package baer.maximilian;

import java.util.Scanner;

public class Quiz {
    Scanner scanner = new Scanner(System.in);       //scanner to scan answers
    Main objectMain = new Main();                   //object to use methods of class "Main"

    //method to ask if player wants to play the quiz again, if he has got a score below 7
    public void questionRestartQuiz(){
        String playQuizAgain = scanner.nextLine();
        switch (playQuizAgain) {
            case "YES":
            case "yes":
            case "Yes":
                System.out.println("Quiz will be started...");
                quiz();
                break;
            default:
                System.out.println("Ok, thank you for playing the quiz.");
                objectMain.questionTestFunctions();
        }
    }

    //method starting the quiz with its questions
    public void quiz() {
        int currentScore = 0;

        System.out.println("Question 1: What is the world's hugest mountain?\nA K2\nB Matterhorn\nC Mount Everest\nD Makalu\nWrite one of the letters as a capital letter to confirm your answer.");
        String answer1 = scanner.nextLine();
        if (answer1.equals("C")) {
            System.out.println("Your answer is right! Mount Everest has a height of 8848 metres and is thus the world's highest mountain!");
            currentScore++;
        } else {
            System.out.println("Unfortunately your guess was wrong.");
        }

        System.out.println("Question 2: What is the approximate velocity of light?\nA 300 km/s\nB 300,000 km/s\nC 300,000 km/h\nD 30,000 km/s");
        String answer2 = scanner.nextLine();
        if (answer2.equals("B")) {
            System.out.println("Your answer is right! Light is 300,000 km/s fast and is thus the fastest thing that exists in the entire universe.");
            currentScore++;
        } else {
            System.out.println("Unfortunately your guess was wrong.");
        }

        System.out.println("Question 3: What is the capital of Australia?\nA Canberra\nB Sydney\nC Melbourne\nD Alice Springs");
        String answer3 = scanner.nextLine();
        if (answer3.equals("A")) {
            System.out.println("Your answer is right! Canberra is the 8th largest city and since 1908 the capital of Australia.");
            currentScore++;
        } else {
            System.out.println("Unfortunately your guess was wrong.");
        }

        System.out.println("Question 4: How many bones are in ONE human hand?\nA 10\nB 27\nC 53\nD 35");
        String answer4 = scanner.nextLine();
        if (answer4.equals("B")) {
            System.out.println("Your answer is right! Both human hands have in total 54 bones and thus a quarter of all human bones in its body.");
            currentScore++;
        } else {
            System.out.println("Unfortunately your guess was wrong.");
        }

        System.out.println("What is the name of the indicator mostly being used to determine the pH value of a substance?\nA Phenolphthalein\nB Cresol\nC Methyl orange\nD Unitest");
        String answer5 = scanner.nextLine();
        if (answer5.equals("D")) {
            System.out.println("Your answer is right! Unitest is able to represent the pH value from 0 to 14 clearly and is thus the most frequently used indicator.");
            currentScore++;
        } else {
            System.out.println("Unfortunately your guess was wrong.");
        }

        System.out.println("Who said the world famous sentence \"That's one small step for (a) man, one giant leap for mankind.\"?\nA John F. Kennedy\nB Joanne K. Rowling\nC Greta Thunberg\nD Neil Armstrong");
        String answer6 = scanner.nextLine();
        if (answer6.equals("D")) {
            System.out.println("Your answer is right! Neil Armstrong was the first human entering the moon, but unfortunately he died in 2012 due to his infirmity.");
            currentScore++;
        } else {
            System.out.println("Unfortunately your guess was wrong.");
        }

        System.out.println("What is the world's biggest airport based on its passenger per year?\nA Atlanta\nB Bangkok\nC Abu Dhabi\nD Moscow ");
        String answer7 = scanner.nextLine();
        if (answer7.equals("A")) {
            System.out.println("Your answer is right! The airport Atlanta in Georgia reached in year 2018 an incredible number of approximately 100 million passengers. ");
            currentScore++;
        } else {
            System.out.println("Unfortunately your guess was wrong.");
        }

        //cases what happens at scores with different height
        if(currentScore<4){
            System.out.println("Your score is " + currentScore + ", but at least you tried it. Do you want to play the quiz again? Write YES or NO.");
            questionRestartQuiz();
        }else if(currentScore>= 4 && currentScore != 7){
            System.out.println("Your score is " + currentScore + ". Not bad! Do you want to play again? Write YES or NO.");
            questionRestartQuiz();
        }else{
            System.out.println("WOW. your score is 7 which is the score limit of this quiz! You are a true master of general knowledge!");
            objectMain.questionTestFunctions();
        }

    }
}
