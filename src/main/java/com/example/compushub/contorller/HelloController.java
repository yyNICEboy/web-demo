package com.example.compushub.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName: HelloController
 * Package: com.example.compushub.contorller
 * Description:
 *
 * @Author:Lin-qk
 * @Create:2024/3/21 10:54
 * Version:
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}
