package mathQuizz;

public class MultiplyingQ extends Question {
	
	private double firstNumber;
	private double secondNumber;

	public MultiplyingQ(double firstNum, double secondNum) {
		this.firstNumber = firstNum;
		this.secondNumber = secondNum;
	}

	@Override
	public double getResult() {
		return firstNumber * secondNumber;
	}

	@Override
	public String getQuestion() {
		return firstNumber+" * "+secondNumber+" = ?";
	}

}
