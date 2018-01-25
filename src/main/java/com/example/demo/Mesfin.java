package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class Mesfin {
    @RequestMapping("/")
    public String showIndex(){
        String userName="";
        System.out.println("Enter username ");
        Scanner keyboard = new Scanner(System.in)
        userName=keyboard.nextLine();
        System.out.println("Hello " +userName);
        return userName;
    }
}
