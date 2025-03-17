package com.springpractice.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//an annotation is a tag that we add in the code to give instructions to the controller
//can be added to methods, fields, parameters...
//this tells spring that the class shoudl be used as a Web Controller for receiving web traffic
public class HomeController {

    @RequestMapping("/")
    //("/") is the URL that the controller will be mapped to - the root of our website
    public String index(){
        return "index.html";
        //this method returns a string that is the name of the template file that should be used to render the response
        //in other words, this is the name of the view that should be returned to the browser
    }

}
