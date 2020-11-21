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
 * Deskripsi : berisi class dari Rabbit
 */
public class Rabbit extends Animal{
    private String color;
    private String name;
    
    Rabbit(String name, boolean veg,String food,int legs,String color){
        super(veg,food,legs);
        this.name = name;
        this.color = color;
    }   
    
    public String getColor(){
        return color;
    }
    
    public String getName(){
        return name;
    }
}
