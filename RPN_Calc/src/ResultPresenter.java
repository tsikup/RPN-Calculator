import java.util.EmptyStackException;

public class ResultPresenter {
	public void operate() {
		try {
			Double result = Calc.st.pop();
			CalculatorGui.display.setText(CalculatorGui.display.getText() + " =");;
			CalculatorGui.display.setText(result.toString());
		}catch(EmptyStackException e) {
			System.err.println("EmptyStackException: " + "You are trying to pop from an empty stack ..... RESULT SECTION");
			CalculatorGui.display.setText("Empty Stack. Press C/CE");
		}
	}
}
