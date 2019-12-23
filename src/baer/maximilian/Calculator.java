package baer.maximilian;

public class Calculator {
        public static double calculate (double number1, String symbol, double number2){
            double result = 0;
            switch (symbol){
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                case "/":
                    result = number1 / number2;
                    break;
                default:
                    throw new ArithmeticException("Please write a calculation with only two arguments.");
            }
            return result;
        }
    }

