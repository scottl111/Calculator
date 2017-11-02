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
    TIMES('*'),
    EQUALS('=');
    
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