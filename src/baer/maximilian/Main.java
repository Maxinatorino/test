package baer.maximilian;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);       //scanner to scan user input
    static Quiz quiz = new Quiz();                          //object to use methods of class "Quiz"

    public static void main(String[] args) {
        programStart();
    }

    //method asking user if he wants to test the other functions
    static void questionTestFunctions() {
        System.out.println("Was this all or do you want to test the other functions? Write either TESTING or something else to close the program.");
        String answerRunProgramStart = scanner.nextLine();

        switch (answerRunProgramStart) {
            case "TESTING":
                programStart();
                break;
            default:
                System.out.println("Thank you for using the program.");
                break;
        }
    }

    //program will be started and asks which function the user wants to use
    private static void programStart() {
        System.out.println("Do you want to use the CALCULATOR, play a QUIZ or find out the AVERAGE of your grades?");
        String answer = scanner.nextLine();
        switch (answer) {
            case "CALCULATOR":
                calculateNumbers();
                break;
            case "AVERAGE":
                meanGrades();
                break;
            case "QUIZ":
                quiz.quiz();
            default:
                System.out.println("Please write CALCULATOR, QUIZ or AVERAGE.");
                return;
        }
    }

    //method to calculate numbers
    private static void calculateNumbers() {
        System.out.println("Please write your calculation. Separate the numbers and the operation Symbol with SPACE and use only two arguments. Example: 4 / 2");
        String input = scanner.nextLine();
        String[] partsInput = input.split(" ");
        double number1 = 0, number2 = 0;
        String symbol = "";
        try {
            number1 = Double.parseDouble(partsInput[0]);
            symbol = partsInput[1];
            number2 = Double.parseDouble(partsInput[2]);
        } catch (NumberFormatException e) {
            System.out.println("Input couldn't be passed.");
            calculateNumbers();
        }
        double resultEnd = Calculator.calculate(number1, symbol, number2);
        System.out.println("Your result is " + resultEnd + ".");
        questionTestFunctions();
    }

    //main method calculate grade point
    private static void meanGrades() {
        System.out.println("What is the subject you want to find out your grade point?");
        String subject = scanner.nextLine();
        System.out.println("Please enter your grades and separate each number with a comma. Example: grade1,grade2...");
        String grades = scanner.nextLine();
        String[] splitGrades = grades.split(",");
        int numberGrades = splitGrades.length;
        int[] yourGrades = new int[numberGrades];          //array including the numbers the user entered
        for (int i = 0; i < numberGrades; i++) {
            try {
                yourGrades[i] = Integer.parseInt(splitGrades[i]);
            } catch (NumberFormatException e) {
                System.out.println("Input couldn't be passed. Please write grade1,grade2,grade3...");
                meanGrades();
            }
        }
        double resultEnd = Average.schnittBerechnen(yourGrades);
        if (resultEnd > 4.0) {
            System.out.println("Your grade point of the subject " + subject + " is " + resultEnd + " which is not enough to pass the exams. Keep learning!");
        } else if (resultEnd == 4.0) {
            System.out.println("Even though you have passed the exams of the subject " + subject + " with a grade point of " + resultEnd + " you shouldn't be satisfied with your performance.");
        } else {
            System.out.println("Good job! Your grade point of the subject " + subject + " is " + resultEnd + " which will you allow to pass the exams. Well done!");
        }
        questionTestFunctions();
    }
}

