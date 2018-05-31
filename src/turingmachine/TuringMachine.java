/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turingmachine;

import javax.swing.JFrame;

/**
 *
 * @author Dianne
 */
public class TuringMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UI ui = new UI();
        JFrame frame = new JFrame();
        frame.add(ui);
        frame.setVisible(true);
        frame.setSize(450,250);
        frame.setLocationRelativeTo(null);  

    }
    
}
