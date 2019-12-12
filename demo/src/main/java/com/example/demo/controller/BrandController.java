package com.example.demo.controller;


import com.example.demo.dao.BrandMapper;
import com.example.demo.entity.Brand;
import com.example.demo.service.BrandService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class BrandController {

    @Autowired
    private BrandService service;

    //    数据展示
    @RequestMapping("/test")
    public @ResponseBody
    List<Brand> test() {
        return service.findall();
    }


    //    商品显示页面
    @RequestMapping("/brandindex")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("/brand");
        List<Brand> brandList = service.findall();
        mv.addObject("list", "brandList");
        return mv;
    }


    //    商品新增换页
    @RequestMapping("/goodsadd")
    public ModelAndView goodsadd() {
        ModelAndView mv = new ModelAndView("/goodsadd");
        return mv;
    }

    //    商品新增
    @RequestMapping("/goodsaddbut")
    public ModelAndView goodsaddbut(String goodstype, String goodsbrand, String goodsname, Float goodssprice) {
        ModelAndView mv = new ModelAndView("redirect:/brandindex");
        Brand brand = new Brand();
        brand.setGoodstype(goodstype);
        brand.setGoodsbrand(goodsbrand);
        brand.setGoodsname(goodsname);
        brand.setGoodsprice(goodssprice);
        service.insert(brand);
        return mv;
    }


    //    商品删除
    @RequestMapping("/goodsdel")
    public ModelAndView goodsdel(Integer id) {
        System.out.println(id);
        ModelAndView mv = new ModelAndView("brand");
        service.deleteId(id);
        return mv;
    }


    //    商品修改换页
    @RequestMapping("/goodsupdate")
    public ModelAndView goodsupdate(Integer id, String goodstype, String goodsbrand, String goodsname, Float goodssprice) {
        ModelAndView mv = new ModelAndView("/goodsupdate");
        System.out.println(id + goodstype + goodssprice + goodsbrand + goodsname);
        return mv;
    }

    //    商品确认修改
    @RequestMapping("/goodsupdatebut")
    public ModelAndView goodsupdatebut(Integer id, String goodstype, String goodsbrand, String goodsname, Float goodssprice) {
        ModelAndView mv = new ModelAndView("redirect:/brandindex");
//        System.out.println(id+goodstype+goodssprice+goodsbrand+goodsname);
        Brand brand = new Brand();
        brand.setId(id);
        brand.setGoodsprice(goodssprice);
        brand.setGoodsname(goodsname);
        brand.setGoodsbrand(goodsbrand);
        brand.setGoodstype(goodstype);
        service.updateByPrimaryKey(brand);

        return mv;
    }

//  模糊查询
    @RequestMapping("/mhselect")
    public ModelAndView mhselect(String goodsname){
        ModelAndView mv =new ModelAndView("/selectbrand");
        List<Brand> brandList = service.mhselect(goodsname);
        System.out.println(brandList);
        mv.addObject("mhlist","brandList");
        return mv;
    }

    //分页
    //http://localhost:8080/getUserList?pageNum=1
    @RequestMapping("/getUserList")
    public ModelAndView getUserList(Integer pageNum){
        ModelAndView mv = new ModelAndView("pagebrand");
        PageHelper.startPage(pageNum, 5);
        Page<Brand> userList= service.getUserList();
        mv.addObject("pagelist","userList");
        return mv;
    }




}
