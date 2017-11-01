/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * An enum representing the operands  
 * 
 * @author Scott Lockett
 */
public enum Operator {
    DIVIDE('/'),
    PLUS('+'),
    MINUS('-'),  
    TIMES('*');
    
    /**
     * The operand type 
     */
    private final char operand;

    /**
     * Constructor to create an operand object 
     * 
     * @param operand The operand to be used
     */
    private Operator(char operand) {
        this.operand = operand;
    }
    
    /**
     * Getter method to return the operand as a char
     * 
     * @return The chosen operand as a char
     */
    public char getOperand(){
        return operand;
    }

}