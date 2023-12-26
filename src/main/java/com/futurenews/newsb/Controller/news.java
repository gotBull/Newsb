package com.futurenews.newsb.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class news
{
    @GetMapping("/IndexPage")
    public String Index()
    {
        return "news-magazine";
    }
    @GetMapping("/Explorermsg")
    public String transferMSG(HttpSession session, HttpServletRequest request,Model model)
    {
        session.setAttribute("msg","a text from session");
        request.setAttribute("msg2","a text from request?");
        model.addAttribute("msg3","This is a message from model");

        return "Explorer";
    }
}
