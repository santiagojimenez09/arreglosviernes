/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author 505
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        
        Persona [] personas=new Persona[4];
        
        
        
        for(int i=0;i<personas.length; i++){
            
            personas[i]= new Persona();
            
          System.out.println("Digita el nombre de la persona: "+i);
          personas[i].setNombre(entrada.next());
            
        }
        
        for(int i=0;i<personas.length; i++){
            
            
            
          System.out.println(personas[i].getNombre());
          
            
        }
       
        
                
    }
    
}
