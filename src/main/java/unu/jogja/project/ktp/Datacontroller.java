/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unu.jogja.project.ktp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ASUS
 */
@Controller
public class Datacontroller {
    @RequestMapping("/data")
    public String getDataKTP(){
        return "database";
    }
}
