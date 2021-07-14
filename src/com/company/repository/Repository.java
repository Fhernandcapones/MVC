package com.company.repository;

import com.company.model.Model;

public class Repository {

 public void average(Model model){
     int total , avg;
     total = model.getPrelim()+model.getMidterm()+model.getFinals();
     avg = total/3;
     System.out.println(avg);

     if (avg == 100){
         System.out.println("tangina rekta uno");
     }else if (avg >= 90 && avg <= 100){
         System.out.println("pwede na yan uno parin");
     }else if (avg >= 80 && avg <= 90){
         System.out.println("muntik na mag dos");
     }else if (avg >= 75 && avg <=80){
         System.out.println("naks nakapasa");
     }else if (avg >= 65 && avg <=74){
         System.out.println("taena drop na tayo");
     }else if (avg >= 0 && avg <=64) {
         System.out.println("gg");
     }else {
         System.out.println("invalid ");
     }

 }
}
