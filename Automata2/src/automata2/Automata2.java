/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automata2;

/**
 *
 * @author Carlos C
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Automata2 {

    private String input;

    public Automata2(String input) {

        this.input = input;

    }

    public boolean validation() {

        int size = input.length();
        int index = 0;
        boolean accepted_state = true;

	//start in q0
        if (index < size && input.charAt(index) == 'b') //q0
        {
            //move a q4
            index += 1;

            if (index < size && input.charAt(index) == 'a')//q4
            {
                //move a q2
                index += 1;

            } else {

                if (index < size && input.charAt(index) == 'b')//q4
                {
                    //move a q3
                    index += 1;

                    while (input.charAt(index) == 'b')//q3
                    //loop in q3
                    {
                        index += 1;
                    }

                    if (index < size && input.charAt(index) == 'a') //q3
                    {
                        //move a q1
                        index += 1;

                        if (index < size && input.charAt(index) == 'a')//q1
                        {
                            //move a q2
                            index += 1;

                            while (input.charAt(index) == 'a')//q2
                            //loop in q2
                            {
                                index += 1;
                            }

                        } else {
                            accepted_state = false;
                        }
                    } else {
                        accepted_state = false;
                    }
                } else {
                    accepted_state = false;
                }
            }
            //q2
            while (accepted_state && index < size && (input.charAt(index) == 'a' || input.charAt(index) == 'b')) {

                //loop in q2
                index += 1;

            }
            if (index != size) {
                accepted_state = false;
            }
        }
    else {
    accepted_state = false;
    }
    return accepted_state ;}

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String input = br.readLine();
            Automata2 demo = new Automata2(input);

            if (demo.validation()) {

                bw.write("cadena aceptada\n");
            } else {
                bw.write("cadena rechazada\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
    }
}
