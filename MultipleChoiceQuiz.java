import java.util.Scanner;

public class MultipleChoiceQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questions and answers
        String[] questions = {
            "1. What is the capital of France?",
            "2. Which planet is known as the Red Planet?",
            "3. What is the largest mammal?",
            "4. Who wrote 'Romeo and Juliet'?",
            "5. What is the powerhouse of the cell?"
        };

        String[] options = {
            "A. Berlin\tB. Madrid\tC. Paris\tD. Rome",
            "A. Venus\tB. Mars\tC. Jupiter\tD. Saturn",
            "A. Elephant\tB. Blue Whale\tC. Giraffe\tD. Gorilla",
            "A. Charles Dickens\tB. William Shakespeare\tC. Jane Austen\tD. J.K. Rowling",
            "A. Nucleus\tB. Mitochondria\tC. Ribosome\tD. Cell Membrane"
        };

        char[] correctAnswers = {'C', 'B', 'B', 'B', 'A'};
        int score = 0;

        System.out.println("Welcome to the Multiple Choice Quiz!");

        // Display and process each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            System.out.println(options[i]);

            // Get the user's answer
            System.out.print("Enter your answer (A, B, C, or D): ");
            char userAnswer = scanner.next().toUpperCase().charAt(0);

            // Check the answer
            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct! +1 point");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswers[i]);
            }
        }

        // Display final score
        System.out.println("\nQuiz complete! Your final score: " + score + "/" + questions.length);

        // Close the scanner
        scanner.close();
    }
}
