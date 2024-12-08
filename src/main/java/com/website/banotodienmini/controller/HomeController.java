package com.website.banotodienmini.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "home";
    }



    @GetMapping("/quanlysanpham")
    public String quanlysanpham() {
        return "quanlysanpham";
    }

    @GetMapping("/quanlydonhang")
    public String quanlydonhang() {
        return "quanlydonhang";
    }


}