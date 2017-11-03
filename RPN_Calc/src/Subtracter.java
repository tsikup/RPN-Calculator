import java.util.EmptyStackException;

public class Subtracter {
	public void operate() {
		try {
			Double c = Calc.st.pop();
			Calc.st.push(Calc.st.pop()-c);
			CalculatorGui.display.setText(CalculatorGui.display.getText() + " -");;
		}catch(EmptyStackException e) {
			System.err.println("EmptyStackException: " + "You are trying to pop from an empty stack ..... SUB SECTION");
			CalculatorGui.display.setText("Empty Stack. Press C/CE");
		}
	}
}
