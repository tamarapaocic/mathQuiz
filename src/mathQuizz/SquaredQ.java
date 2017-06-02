package mathQuizz;

public class SquaredQ extends Question {

	private double firstNumber;
	private double secondNumber;

	public SquaredQ(double firstNum) {
		this.firstNumber = firstNum;
		this.secondNumber = 2;
	}

	@Override
	public double getResult() {
		return Math.pow(firstNumber, secondNumber);
	}

	@Override
	public String getQuestion() {
		return "What is " + firstNumber + " squared";
	}

}
