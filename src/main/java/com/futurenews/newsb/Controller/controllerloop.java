package com.futurenews.newsb.Controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class controllerloop {

    @GetMapping("/if")
    public String showif(HttpSession session, Model model)
    {
        session.setAttribute("isAdmin","true");
        model.addAttribute("isAdmin","true");


        return "testIf";
    }
}
