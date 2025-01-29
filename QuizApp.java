
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Questions and answers
        String[][] questions = {
                { "What is the capital of France?", "A. Berlin", "B. Madrid", "C. Paris", "D. Rome", "C" },
                { "Which planet is known as the Red Planet?", "A. Earth", "B. Mars", "C. Jupiter", "D. Venus", "B" },
                { "What is 5 + 3?", "A. 6", "B. 8", "C. 10", "D. 7", "B" }
        };

        // Loop through questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i][0]);
            System.out.println(questions[i][1]);
            System.out.println(questions[i][2]);
            System.out.println(questions[i][3]);
            System.out.println(questions[i][4]);

            System.out.print("Your answer (A/B/C/D): ");
            String answer = scanner.nextLine().trim().toUpperCase();

            if (answer.equals(questions[i][5])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was: " + questions[i][5]);
            }
        }

        // Display final score
        System.out.println("\nQuiz Over! Your final score: " + score + "/" + questions.length);
        scanner.close();
    }
}