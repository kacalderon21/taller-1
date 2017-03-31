/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package automata4;

/**
 *
 * @author Carlos C
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Automata4 {

    public static void main(String[] args) {

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

            if (i < c.length() && c.charAt(i) == 'b') // Símbolo 'b', desde q0 a q1
            {
                i++; //Mueve el índice al siguiente símbolo en la cadena
                
                while (i < c.length() && c.charAt(i) == 'b') //Bucle 'b' en q1
                    {
                        i++; //Mueve el índice al siguiente símbolo en la cadena
                    }

                if (i < c.length() && c.charAt(i) == 'a') // Símbolo 'a', desde q1 a q2
                {
                    i++; //Mueve el índice al siguiente símbolo en la cadena

                    if (i < c.length() && c.charAt(i) == 'b') //Símbolo 'b', desde q2 a q3
                    {
                        i++; //Mueve el índice al siguiente símbolo en la cadena

                        while (i < c.length() && c.charAt(i) == 'b') //Bucle 'b' en q3
                        {
                            i++; //Mueve el índice al siguiente símbolo en la cadena
                        }

                        /* Se verifica que el índice haya llegado al final de la cadena, 
                        * y así determinar que si se proceso toda la cadena
                         */
                        accepted = i < c.length() ? false : true; 
                    } else {
                        accepted = false; //Cadena rechazada
                    }
                } else {
                    accepted = false; //Cadena rechazada
                }
            } else {
                accepted = false; //Cadena rechazada
            }

            //Mostrar al usuario el resultado final. 
            if (accepted) {
                bw.write("Cadena Aceptada");
            } else {
                bw.write("Cadena Rechazada");
            }

            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
