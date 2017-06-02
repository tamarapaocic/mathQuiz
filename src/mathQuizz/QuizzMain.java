package mathQuizz;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class QuizzMain {

	static Random rand = new Random();

	static Scanner uInput = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to simple math quizz");

		startQuizz();

	}

	private static void startQuizz() {

		int correctAnswers = 0;

		for (int i = 0; i < 10; i++) {
			Question q = getEquation();
			double userGuess = getUserInput(q);

			if (userGuess == q.getResult()) {
				System.out.println("Correct");
				correctAnswers++;
			} else {
				System.out.println("Incorrect");
			}

		}

		System.out.println("Quizz over. Points: " + correctAnswers);
	}

	private static double getUserInput(Question question) {
		try {
			System.out.println(question.getQuestion());

			return Double.parseDouble(uInput.nextLine());

		} catch (NumberFormatException e) {
			System.out.println("Exception in number format");
			getUserInput(question);
		} catch (InputMismatchException e) {
			System.out.println("Input exception");
			getUserInput(question);
		} catch (Exception e) {
			System.out.println("Unexpected exception");
			getUserInput(question);
		}
		return 0;

	}

	private static Question getEquation() {
		int operand = rand.nextInt(6);

		switch (operand) {
		case 0:
			return getSumQ();

		case 1:

			return getSubstractQ();

		case 2:

			return getDivisonQ();

		case 3:

			return getMultiQ();

		case 4:

			return getSquaredQ();

		case 5:

			return getSquareRootQ();

		default:

			return null;
		}

	}

	private static Question getSumQ() {
		return new SumQ(getRandomNumber(), getRandomNumber());

	}

	private static Question getSubstractQ() {
		return new SubstractQ(getRandomNumber(), getRandomNumber());

	}

	private static Question getDivisonQ() {
		return new DivisonQ(getRandomNumber(), getRandomNumber());

	}

	private static Question getMultiQ() {
		return new MultiplyingQ(getRandomNumber(), getRandomNumber());

	}

	private static Question getSquaredQ() {
		return new SquaredQ(getRandomNumber());

	}

	private static Question getSquareRootQ() {
		return new SquareRootQ(getRandomNumber());

	}

	private static double getRandomNumber() {

		return rand.nextInt(50) * 1.0;
	}

}
