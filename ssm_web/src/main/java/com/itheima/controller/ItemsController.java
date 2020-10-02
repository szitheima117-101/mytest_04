package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    /**
     * 查询所有
     */
    @RequestMapping(value = "/findAll")
    public String findAll(Model model) {
        List<Items> itemsList = itemsService.findAll();
        //存入回显：将查询到的数据存储到request域对象中
        model.addAttribute("items",itemsList);
        //跳转到/WEB-INF/pages/items.jsp
        return "items";
    }

    /**
     * 事务测试
     * 增加商品
     */
    @RequestMapping(value = "/save")
    public String save(Items items) {
        int account = itemsService.save(items);
        //重新查询所有  重定向跳转到/items/findAll
        return "redirect:/items/findAll";
    }
}
