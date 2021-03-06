/*
 * Copyright (C) 2017 Scott Lockett
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 * A class that holds the GUI components for the calculator
 * 
 * @author Scott Lockett
 */
public class CalculatorGUI {
    /**
     * The top level JFrame on which the panels are going to be added
     */
    private final JFrame frame = new JFrame();
    
    /**
     * The JPanel to which the button are going to be added to 
     */
    private final JPanel buttonsPanel = new JPanel();
    
    /**
     * The JPanel on which the result of the operations will be displayed.
     */
    private final JPanel resultPanel = new JPanel();
    
    /**
     * An arraylist for the operations
     */
    private final ArrayList<Character> listOfOperations = new ArrayList();
    
    /**
     * Sets up the calculator's graphical user interface
     */
    public CalculatorGUI(){
        
        buttonsPanel.setLayout(new GridLayout(3,2));
        buttonsPanel.setSize(new Dimension(300,200));
        
        resultPanel.setBackground(Color.red);
        resultPanel.setSize(new Dimension(300,200));
        
        frame.add(buttonsPanel);
        frame.add(resultPanel);
        frame.setVisible(true);
        frame.setSize(new Dimension(600,410));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        //Loop through and add all of the numberical buttons 
        for (int i = 0; i < 10; i++){
            JButton currentNumberButton = new JButton(Integer.toString(i));
            char digitAsChar = Integer.toString(i).charAt(0);
            ButtonClick clickable = new ButtonClick(digitAsChar);
            currentNumberButton.addActionListener(clickable);
            buttonsPanel.add(currentNumberButton);
        }
        
        //Loop through and all of the operand buttons
        for (Operator op : Operator.values()){
            String opString = Character.toString(op.getOperand());
            JButton operantionButton = new JButton(opString);
            ButtonClick clickable = new ButtonClick(op.getOperand());
            operantionButton.addActionListener(clickable);
            buttonsPanel.add(operantionButton);
        }
    }
    
    /**
     * A class that implements the action listener interface. When the JButtons 
     * have been clicked, the listener will trigger. 
     */
    private class ButtonClick implements ActionListener{
        
        /**
         * The digit that is associated with the button
        */
        private char digit;
        
        /**
         * 
         * 
         * @param digit 
         */
        public ButtonClick(char digit){
            this.digit = digit;
        }

        /**
         * 
         * 
         * @param ae The Action Event that has been triggered. 
         */
        @Override
        public void actionPerformed(ActionEvent ae) {
            if (Operator.EQUALS.getOperand() == (ae.getActionCommand().charAt(0))){
                if (listOfOperations.size() < 3){
                     throw new ArithmeticException();
                }
            } else {
                listOfOperations.add(ae.getActionCommand().charAt(0));
            }
        }
    }
    
    
    private class MathsOperator implements MathematicalOperation{

        @Override
        public double addition(double... parameters) {
            if (parameters.length == 2){
                return parameters[0] + parameters[1];
            }
            else {
                return 0;
            }
        }

        @Override
        public double subtraction(double... parameters) {
            if (parameters.length == 2){
                return parameters[0] - parameters[1];
            }
            else {
                return 0;
            }
        }

        @Override
        public double multiplication(double... parameters) {
            if (parameters.length == 2){
                return parameters[0] * parameters[1];
            }
            else {
                return 0;
            }
        }

        @Override
        public double division(double... parameters) {
            if (parameters.length == 2){
                return parameters[0] / parameters[1];
            }
            else {
                return 0;
            }
        }
    }
}
