/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deksripsi Program : program ini untuk mengisi value 
 */
public class Test {

    public static String name, color, food;
    public static boolean veg;
    public static int legs;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit rabbit = new Rabbit(name,veg,food,legs,color);
        
        System.out.println("Hello, my name is " + rabbit.getName());
        System.out.println(rabbit.getName() + " Is Vegetarian? " + rabbit.isVegetarian());
        System.out.println(rabbit.getName() + " eats " + rabbit.getEats());
        System.out.println(rabbit.getName() + " has " + rabbit.getNoOfLegs());
        System.out.println(rabbit.getName() + " color is " + rabbit.getColor());
    }
    
}
