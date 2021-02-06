package com.example.MVCapptest.controller;

import com.example.MVCapptest.model.Items;
import com.example.MVCapptest.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/inventory")
public class ItemsController {

    @Autowired
    ItemsService its;

    @RequestMapping(value= {"/all","/"})
    public String getAll(Model model) {
        List<Items> items = its.getAll();
        model.addAttribute("items", items);
        model.addAttribute("heading", "My heading");
        return "ItemsView";
    }

}
