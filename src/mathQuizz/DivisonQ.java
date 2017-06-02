package mathQuizz;

public class DivisonQ extends Question {

	private double firstNumber;
	private double secondNumber;

	public DivisonQ(double firstNum, double secondNum) {
		this.firstNumber = firstNum;
		this.secondNumber = secondNum;
	}

	@Override
	public double getResult() {
		if (this.secondNumber == 0) {
			return 0;
		}
		return firstNumber / secondNumber;
	}

	@Override
	public String getQuestion() {
		return firstNumber+" / "+secondNumber+" = ?";
	}

}
