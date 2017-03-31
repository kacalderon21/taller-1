/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package automata3;

/**
 *
 * @author Carlos C
 */
import  java.io.BufferedReader ;
import  java.io.BufferedWriter ;
import  java.io.IOException ;
import  java.io.InputStreamReader ;
import  java.io.OutputStreamWriter ;

public class Automata3 {

    public static void main(String[] args) throws IOException {

        //Lectura y escritura desde la consola
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //Variables
        String c = ""; //Cadena
        int i = 0; //Indice sobre la cadena
        boolean accepted = true; //Estado de aceptación

        try {
            bw.write("Digite la cadena: "); //Solicita al usuario la cadena
            bw.flush();
            c = br.readLine(); //Lee desde consola y almacena en la variable "c"
            
            if (i < c.length() && c.charAt(i) == '0') // Símbolo '0', desde q0 a q2
            {
                i++; //Mueve el índice al siguiente símbolo en la cadena

            }else {
                
                if (i < c.length() && c.charAt(i) == '1') // Símbolo '1', desde q0 a q1
                {
                    i++; //Mueve el índice al siguiente símbolo en la cadena

                   if (i < c.length() && c.charAt(i) == '1') //Símbolo '1', desde q1 a q3
                    {
                        i++; //Mueve el índice al siguiente símbolo en la cadena
                   }
                   else{
                        if (i < c.length() && c.charAt(i) == '0') //Símbolo '0', desde q1 a q4
                    {
                        i++; //Mueve el índice al siguiente símbolo en la cadena
                        
                       if (i < c.length() && c.charAt(i) == '0') //Símbolo '0', desde q4 a q1
                    {
                        i++; //Mueve el índice al siguiente símbolo en la cadena
                       }else{
                           
                        if (i < c.length() && c.charAt(i) == '1') //Símbolo '1', desde q4 a q2
                    {
                        i++; //Mueve el índice al siguiente símbolo en la cadena
                        
                        if (i < c.length() && c.charAt(i) == '1') //Símbolo '1', desde q2 a q4
                    {
                        i++; //Mueve el índice al siguiente símbolo en la cadena
                        }else{
                            if (i < c.length() && c.charAt(i) == '0') //Símbolo '0', desde q2 a q3
                    {
                        i++; //Mueve el índice al siguiente símbolo en la cadena
                        
                        if (i < c.length() && c.charAt(i) == '1') //Símbolo '1', desde q3 a q1
                    {
                        i++; //Mueve el índice al siguiente símbolo en la cadena
                            
                        } else{
                            if (i < c.length() && c.charAt(i) == '0') //Símbolo '0', desde q3 a q2
                    {
                        i++; //Mueve el índice al siguiente símbolo en la cadena
                        
                                       

                        /* Se verifica que el índice haya llegado al final de la cadena, 
						 * y así determinar que si se proceso toda la cadena
                         */
                        accepted = i < c.length() ? false : true; 
                     } else {
                        accepted = false; //Cadena rechazada
                    }
                } }else {
                    accepted = false; //Cadena rechazada
                }
            }} else {
                accepted = false; //Cadena rechazada
            }
                       }}else {
                accepted = false; //Cadena rechazada
                    }
                   }}else {
                accepted = false; //Cadena rechazada
                    }
                       
            //Mostrar al usuario el resultado final. 
            if (accepted) {
                bw.write("Cadena Aceptada");
            } else {
                bw.write("Cadena Rechazada");
            }

            bw.flush();
        }}  catch (IOException e) {
            e.printStackTrace();
                }
        }
    }

            
    
    

