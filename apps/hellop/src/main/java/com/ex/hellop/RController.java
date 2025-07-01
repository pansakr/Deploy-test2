package com.ex.hellop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RController {

    @GetMapping("/gg")
    public String gg(){
        return "문자열 응답";
    }
}
