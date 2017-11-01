package calculator;

/**
 * @author Scott Lockett
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
