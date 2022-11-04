package com.rock_paper_scissor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rock_paper_scissor.game;

@RestController
public class cont{
    // @RequestMapping(value = "/test", method = RequestMethod.GET)    
    // @ResponseBody
    @Autowired
    game g1;
    @GetMapping("/{userInput}")
    public String handle(@PathVariable("userInput") String userInput){
        System.out.println(userInput);
        return g1.handle(userInput);
        // return userInput;
    }
    
}
