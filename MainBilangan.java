/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilangan;

import java.util.Scanner;

/**
 *
 * @author yudi hermawan
 */
public class MainBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bilangan b=new Bilangan();
        System.out.println("Masukkan Bilangan :");
        float bil = input.nextFloat();
        b.setBilangan(bil);
        if(bil%1==0){
        b.I1();
    }
        else {
        b.D1();
        }

}
}
