package mathQuizz;

public class SquareRootQ extends Question {

	private double firstNumber;
	private double secondNumber;

	public SquareRootQ(double firstNum) {
		this.firstNumber = firstNum;
		this.secondNumber = 2;
	}

	@Override
	public double getResult() {
		return Math.pow(firstNumber, (1.0 / secondNumber));
	}

	@Override
	public String getQuestion() {
		return "What is square root of " + firstNumber;
	}

}
