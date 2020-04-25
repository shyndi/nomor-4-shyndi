/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbonomer4;

/**
 *
 * @author user
 */
public class coursedemo {
     public static void main(String[] args) {
       Instructor myInstructor = new Instructor("FP", "Marchella", "AD4325");
       
       TextBook myTextBook = new TextBook("Nanti Kita Cerita Tentang Hari Ini", "Marcella", "POP");
       
       Course myCourse = new Course("Story Of Family", myInstructor, myTextBook);
       
       System.out.println(myCourse);
    }
}
