/*
 * Copyright (C) 2017 Lenovo T450
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
 * An interface used to define mathematical operation
 *
 * @author Scott Lockett
 */
public interface MathematicalOperation {
    
    /**
     * Defines the addition of a series of numbers. 
     * 
     * @param parameters 
     * @return 
     */
    public double addition(double... parameters);
    
    /**
     * Defines the subtraction of a series of numbers. 
     * 
     * @param parameters
     * @return 
     */
    public double subtraction(double... parameters);
    
    /**
     * Define the multiplication of a series of numbers 
     * 
     * @param parameters 
     * @return 
     */
    public double multiplication(double... parameters);
    
    /**
     * Divide a couple of numbers 
     * 
     * @param parameters
     * @return 
     */
    public double division(double... parameters);
}
