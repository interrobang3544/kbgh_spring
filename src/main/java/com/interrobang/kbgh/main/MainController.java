package com.interrobang.kbgh.main;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {
    @GetMapping(value = {"/", "main"})
    public String main() {
        return "index";
    }
}
