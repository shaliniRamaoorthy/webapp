package com.example.MyWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Homecontroller 
{
     @RquestMapping("home")
     public void home() 
     {
	 System.out.println("hi");
 }
}
