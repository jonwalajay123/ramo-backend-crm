package com.crm;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

   @RequestMapping("/")
    public String home()
    {
        return "CRM Project is Running ";
    }
   
   @RequestMapping("/api")
   public String ajay()
   {
       return " All Api is Running ";
   }
}