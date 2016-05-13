/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilangan;

/**
 *
 * @author yudi hermawan
 */
public class Bilangan implements I1,D1 {
    float bilangan;
    public Bilangan(){
        bilangan=0;
    }
    public Bilangan(float bilangan){
        this.bilangan=bilangan;
    }
public void setBilangan(float b){
    bilangan=b;    
    }
public float getBilangan(){
    return bilangan;
}
    @Override
    public void I1() {
        System.out.println("Angka yang anda inputkan integer");
    }
    @Override
    public void D1() {
        System.out.println("Angka yang anda inputkan double");
    }
}
