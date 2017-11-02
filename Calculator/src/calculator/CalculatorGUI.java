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
            buttonsPanel.add(currentNumberButton);
        }
        
        //Loop through and all of the operand buttons
        for (Operator op : Operator.values()){
            String opString = Character.toString(op.getOperand());
            JButton operantionButton = new JButton(opString);
            buttonsPanel.add(operantionButton);
        }
    }
}
