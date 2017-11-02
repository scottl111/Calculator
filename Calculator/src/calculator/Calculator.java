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
 * @author Scott Lockett
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CalculatorGUI gui = new CalculatorGUI();
        
        int arg1 = 50;
        int arg2 = 10;
        Operator op = Operator.PLUS;
        
        double result; 
        switch (op.getOperand()){
            case '+':
                result = arg1 + arg2;
                break;
            case '-':
                result = arg1 - arg2;
                break;
            case '/':
                result = arg1 / arg2;
                break;
            case '*':
                result = arg1 * arg2;
                break;
            default:
                throw new ArithmeticException();
            }
        System.out.println(result);
    }
    
}
