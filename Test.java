package com.OnlineQuiz;
import java.util.Scanner;
public class Quiz {
public static void main(String[] args) {
// Set up quiz questions and answers
String[] questions = {"What is the capital of France?", "What is the highest mountain in the
world?"};
String[] answers = {"Paris", "Mount Everest"};
// Set up user input
Scanner scanner = new Scanner(System.in);
// Start quiz loop
int score = 0;
for (int i = 0; i < questions.length; i++) {
// Ask question and get user answer
System.out.println(questions[i]);
String userAnswer = scanner.nextLine();
// Check if user answer is correct
if (userAnswer.equalsIgnoreCase(answers[i])) {
System.out.println("Correct!");
score++;
} else {
System.out.println("Incorrect. The correct answer is " + answers[i] + ".");
}
}
System.out.println("Quiz complete. Your score is " + score + "/" + questions.length + ".");
// Close scanner
scanner.close();
}
}
