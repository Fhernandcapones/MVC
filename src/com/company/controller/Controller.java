package com.company.controller;

import com.company.model.Model;

import com.company.service.PersonImplService;
import com.company.service.PersonService;

import java.util.Scanner;

public class Controller {
   public void prelim() {


       Scanner scan = new Scanner(System.in);
       System.out.println("Enter your Name");
       String name = scan.nextLine();
       System.out.println("Enter your Age");
       Integer age = scan.nextInt();
       System.out.println("Enter your Prelim grade");
       Integer prelim = scan.nextInt();
       System.out.println("Enter your Midterm grade");
       Integer midterm = scan.nextInt();
       System.out.println("Enter your Final grade");
       Integer finals = scan.nextInt();
       Model model = new Model(name,age,prelim,midterm,finals);
       System.out.println("My name is :"+name);
       System.out.println("I am "+age+" years old");
       System.out.println("my grade for prelim :"+prelim);
       System.out.println("my grade for midterm :"+midterm);
       System.out.println("my grade for finals :"+finals);
       PersonService personService = new PersonImplService();
       personService.prelim(model);
       System.out.println("_________________________________________");

    }


}
