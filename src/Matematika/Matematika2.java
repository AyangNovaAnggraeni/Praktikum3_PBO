/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author user
 */
public class Matematika2 extends Matematika{
    
    int modulus;
    
      Matematika2(int a, int b){
        super(a, b);
        this.modulus = a % b;
    }
    
    public int getModulus(){
        return modulus; 
    }
}
