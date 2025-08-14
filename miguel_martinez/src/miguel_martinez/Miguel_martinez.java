/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miguel_martinez;

import java.util.Scanner;


public class Miguel_martinez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Introdusca La Nota 1: ");
        double N1 = sc.nextDouble();
        System.out.println("Introdusca La Nota 2: ");
        double N2 = sc.nextDouble();
        System.out.println("Introdusca La Nota 3: ");
        double N3 = sc.nextDouble();
        double NF = (N1*0.30)+(N2*0.30)+(N3*0.40);
         if (NF<=1.9){
        System.out.println("La Nota es deficiente ");}
        else if (NF>=2 && NF<=2.9){
        System.out.println("La Nota Es Insuficiente ");}
        else if (NF>=3 && NF<=3.9){
        System.out.println("La Nota Es Aceptable ");}
         else if (NF>=4 && NF==5){
        System.out.println("La Nota Es Destacado ");}
        System.out.println("La Nota Final Es: "+NF);  
    }
    
}
