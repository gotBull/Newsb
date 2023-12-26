package com.futurenews.newsb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

@Controller
public class Carmodels {
    @GetMapping("/carlist")
    public String showCars(Model model) throws SQLException {
        DBConGenerator DBG;
        Connection con;
        ResultSet RS=null;
        Statement STMT=null;
        DBG =new DBConGenerator();
        con = DBG.getConnection();
        STMT = con.createStatement();

        ArrayList<String> car = new ArrayList<>();
        car.add("Tesla Model3");
        car.add("Mazda");
        car.add("Mizubishi");
        model.addAttribute("car",car);
        return "carlist";
    }
}
