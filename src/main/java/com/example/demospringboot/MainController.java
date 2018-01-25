package com.example.demospringboot;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;

@RestController
public class MainController {
    @RequestMapping("/")

    public String showIndex()
    {

        char letter_grade;
        int test_score_percentage;
        int test_score;

        System.out.println("Enter a value and then go to localhost:8080");
        Scanner keyboard = new Scanner(System.in);
        test_score = keyboard.nextInt();
        test_score_percentage =(test_score/50)*100;

        if(test_score_percentage>=90&&test_score_percentage<=100)
         letter_grade = 'A';

         else if(test_score_percentage>=80&&test_score_percentage<=89)
            letter_grade = 'B';

           else if(test_score_percentage>=70&&test_score_percentage<=79)
              letter_grade = 'C';

              else if(test_score_percentage>=60&&test_score_percentage<=69)
               letter_grade = 'D';
                 else
                letter_grade = 'F';
                 return "student's grade is:" + letter_grade;
    }
}
