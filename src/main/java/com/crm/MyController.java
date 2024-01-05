package com.crm;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

   @RequestMapping("/")
    public String home()
    {
        return "this is Home page ";
    }
   
   @RequestMapping("/ajay")
   public String ajay()
   {
       return "running spring boot project ";
   }
}