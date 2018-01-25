package com.example.demospringboot;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;


@RestController
public class MainController {
    @RequestMapping("/")

    public String showIndex()
    {
        System.out.println("Enter a value and then go to localhost:8080");

        String userName="";
        Scanner keyboard = new Scanner(System.in);
        userName = keyboard.nextLine();
        System.out.println("Hello" +" "+userName);
        return"Hello"+ " "+userName;


    }
}
