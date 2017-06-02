package mathQuizz;

public class SumQ extends Question {
	private double firstNumber;
	private double secondNumber;

	public SumQ(double firstNum, double secondNum) {
		this.firstNumber = firstNum;
		this.secondNumber = secondNum;
	}

	@Override
	public double getResult() {
		return firstNumber + secondNumber;
	}

	@Override
	public String getQuestion() {
		// TODO Auto-generated method stub
		return firstNumber+" + "+secondNumber+" = ?";
	}

}
