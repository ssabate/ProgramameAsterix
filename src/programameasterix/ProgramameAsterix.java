/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programameasterix;

import java.util.Scanner;

/**
 *
 * @author salcu
 */
public class ProgramameAsterix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent=new Scanner(System.in);
        long casos=Long.valueOf(ent.nextLine());
        while(casos-->0){
            String pueblo="PLUS ULTRA";
            String nombre=ent.nextLine();
            //System.out.println(nombre.substring(0,3));
            if(nombre.length()>1 && nombre.substring(nombre.length()-2).equalsIgnoreCase("ix")){
                pueblo="GALO";
            } 
            if(nombre.length()>1 && (nombre.substring(nombre.length()-2).equalsIgnoreCase("us") || 
                    nombre.substring(nombre.length()-2).equalsIgnoreCase("um"))){
                pueblo="ROMANO";
            } 
            if(nombre.length()>1 && nombre.substring(nombre.length()-2).equalsIgnoreCase("ic")){
                pueblo="GODO";
            } 
            if(nombre.length()>1 && nombre.substring(nombre.length()-2).equalsIgnoreCase("as")){
                pueblo="GRIEGO";
            } 
            if(nombre.length()>1 && nombre.substring(nombre.length()-2).equalsIgnoreCase("af")){
                pueblo="NORMANDO";
            } 
            if(nombre.length()>1 && (nombre.substring(nombre.length()-2).equalsIgnoreCase("is") || 
                    nombre.substring(nombre.length()-2).equalsIgnoreCase("os") || 
                    nombre.substring(nombre.length()-2).equalsIgnoreCase("ax"))){
                pueblo="BRETON";
            } 
            if(nombre.length()>1 && nombre.substring(nombre.length()-2).equalsIgnoreCase("ez")){
                pueblo="HISPANO";
            } 
            if(nombre.length()>0 && nombre.substring(nombre.length()-1).equalsIgnoreCase("a")){
                pueblo="INDIO";
            } 
            if(nombre.length()>2 && nombre.substring(0,3).equalsIgnoreCase("mac")){
                if(pueblo.equalsIgnoreCase("PLUS ULTRA")) pueblo="PICTO";
                else pueblo="MULATO";
            } 
            System.out.println(pueblo);
            
        }
    }
    
}
