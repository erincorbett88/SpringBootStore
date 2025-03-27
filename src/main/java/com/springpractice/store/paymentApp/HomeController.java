package com.springpractice.store.paymentApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//an annotation is a tag that we add in the code to give instructions to the controller
//can be added to methods, fields, parameters...
//this tells spring that the class should be used as a Web Controller for receiving web traffic
public class HomeController {
    @Value("${spring.application.name}")
    private String name;

    @RequestMapping("/")
    //("/") is the URL that the controller will be mapped to - the root of our website
    public String index(){
        System.out.println("appName: " + name);
        return "index.html";
        //this method returns a string that is the name of the template file that should be used to render the response
        //in other words, this is the name of the view that should be returned to the browser
    }

}
