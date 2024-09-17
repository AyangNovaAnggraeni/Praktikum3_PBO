/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author user
 */
public class MatematikaInheritance {
    public static void main(String[] args) {
        
        Matematika2 m = new Matematika2(10, 3);

        System.out.println("Pertambahan: " + m.pertambahan());
        System.out.println("Pengurangan: " + m.pengurangan());
        System.out.println("Perkalian: " + m.perkalian());
        System.out.println("Pembagian: " + m.pembagian());
        System.out.println("Modulus: " + m.getModulus());
    }
}

