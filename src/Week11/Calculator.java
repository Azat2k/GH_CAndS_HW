package Week11;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String raw_expr = scanner.nextLine();
        String[] expr = raw_expr.split("");
        if ("quit".equalsIgnoreCase(""))
            String[] expr = raw_expr.split("")

        if (expr.length !=3){
            throw new IllegalArgumentException("Input doesnt satisfy language rules" + raw_expr);
        }

        try{
            String operator = expr[0];
            int operand1 = Integer.parseInt(expr[1]);
            int operand2 = Integer.parseInt(expr[1]);


        } catch (Exception e) {
            e.printStackTrace();
        }
        scanner.close();
    }

    public static int evaluete(String operator, int operand1, int operand2)
    {
        switch (operator)
        {
            case "ADD":
                return operand1 + operand2;
            case "SUB":
                return operand1 - operand2;
            case "MUL":
                return operand1 * operand2;
            case "DIV":
                return operand1 / operand2;
            default:
                throw new UnsupportedOperationException("Unsupported Operation"+operator)


    }

}
