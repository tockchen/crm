package cn.edu.hnnu.crm.controller;

import cn.edu.hnnu.crm.mapper.CustomerMapper;
import cn.edu.hnnu.crm.model.Customer;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Set;

/**
 * @program: crm
 * @description: 主页核心逻辑
 * @author: chen can
 * @create: 2019-06-13 14:25
 */
@Controller
public class IndexController {

    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private IndexController indexController;

    @RequestMapping("/index")
    public String index(@RequestParam(required = false, defaultValue = "1", value = "pageNum") Integer pageNum,
                        @RequestParam(defaultValue = "9", value = "pageSize") Integer pageSize,
                        Model model,
                        HttpServletRequest request) {
        String name = (String) request.getSession().getAttribute("name");
        String method = request.getMethod();
        System.out.println(method);
        System.out.println(name);
        if (name == null) {
            return "redirect:/";
        }
        indexController.ty2(pageNum,pageSize);

        //1.引入分页插件,pageNum是第几页，pageSize是每页显示多少条,默认查询总数count
        PageHelper.startPage(pageNum, pageSize);
        //2.紧跟的查询就是一个分页查询-必须紧跟.后面的其他查询不会被分页，除非再次调用PageHelper.startPage
        try {
            List<Customer> customerList = customerMapper.select();;

            indexController.ty(customerList,model);


        } finally {
            PageHelper.clearPage(); //清理 ThreadLocal 存储的分页参数,保证线程安全
        }

        return "index";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value = "cust_id") Integer cust_id) {
        customerMapper.delete(cust_id);
        return "redirect:/index";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().setAttribute("name", null);
        return "redirect:/index";
    }

    @RequestMapping("/fquery")
    public String fquery(@RequestParam(value = "custName",defaultValue = "99999") String custName,
                         @RequestParam(value = "custSource") String custSource,
                         @RequestParam(value = "custIndustry") String custIndustry,
                         @RequestParam(value = "custLevel") String custLevel,
                         @RequestParam(required = false, defaultValue = "1", value = "pageNum") Integer pageNum,
                         @RequestParam(defaultValue = "9", value = "pageSize") Integer pageSize, Model model,
                         HttpServletRequest request) {
        String name = (String) request.getSession().getAttribute("name");
        System.out.println(name);
        String method = request.getMethod();
        System.out.println(method);
        if (name == null) {
            return "redirect:/";
        }
        indexController.ty2(pageNum,pageSize);
        PageHelper.startPage(pageNum, pageSize);
        List<Customer> customerList = customerMapper.likeSelect(custName, custSource, custIndustry, custLevel);

        PageInfo<Customer> pageInfo = new PageInfo<Customer>(customerList, 5);
        indexController.ty(customerList,model);
        return "index";
    }

    @PostMapping("/update")
    @ResponseBody
    public Customer update(@RequestBody Customer customer) {

        customerMapper.update(customer);
        return customer;
    }
    public void ty(List<Customer> customerList,Model model){
        //3.使用PageInfo包装查询后的结果,5是连续显示的条数,结果list类型是Page<E>
        Set<Customer> customerSet = customerMapper.selectset();
        PageInfo<Customer> pageInfo = new PageInfo<Customer>(customerList, 5);
        //4.使用model/map/modelandview等带回前端
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("customerSet", customerSet);
        //获得当前页
        model.addAttribute("pageNum", pageInfo.getPageNum());
        //获得一页显示的条数
        model.addAttribute("pageSize", pageInfo.getPageSize());
        //是否是第一页
        model.addAttribute("isFirstPage", pageInfo.isIsFirstPage());
        //获得总页数
        model.addAttribute("totalPages", pageInfo.getPages());
        //是否是最后一页
        model.addAttribute("isLastPage", pageInfo.isIsLastPage());

    }
    public void ty2(Integer pageNum,Integer pageSize){

        //为了程序的严谨性，判断非空：
        if (pageNum == null) {
            // 设置默认当前页
            pageNum = 1;
        }
        if (pageNum <= 0) {
            pageNum = 1;
        }
        if (pageSize == null) {
            // 设置默认每页显示的数据数
            pageSize = 9;
        }
        System.out.println("当前页是：" + pageNum + "显示条数是：" + pageSize);

    }
}