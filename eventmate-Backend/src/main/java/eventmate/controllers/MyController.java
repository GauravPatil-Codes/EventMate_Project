package eventmate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.annotation.Repeatable;
@Controller
public class MyController {

    @GetMapping ("/test")
    @ResponseBody
    public String handleTest(){
        return "i am checking weather project is live or not! ";
    }

}
