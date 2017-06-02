package mathQuizz;

public class SubstractQ extends Question {
	private double firstNumber;
	private double secondNumber;

	public SubstractQ(double firstNum, double secondNum) {
		this.firstNumber = firstNum;
		this.secondNumber = secondNum;
	}

	@Override
	public double getResult() {
		return firstNumber - secondNumber;
	}

	@Override
	public String getQuestion() {
		return firstNumber+" - "+secondNumber+" = ?";	
	}

}
