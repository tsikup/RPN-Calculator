import java.util.EmptyStackException;

public class Divider {
	public void operate() {
		try {
			Double divisor = Calc.st.pop();
			if(divisor==(double)0) {
				throw new IllegalArgumentException("Argument 'divisor' is 0");
			}
			Calc.st.push(Calc.st.pop()/divisor);
			CalculatorGui.display.setText(CalculatorGui.display.getText() + " /");;
		}catch(EmptyStackException e) {
			System.err.println("EmptyStackException: " + "You are trying to pop from an empty stack ..... DIV SECTION");
			CalculatorGui.display.setText("Empty Stack. Press C/CE");
		}catch(IllegalArgumentException e) {
			System.err.println("IllegalArgumentException: " + e.getMessage());
			CalculatorGui.display.setText("Cannot Divide by 0. Press C/CE");
		}
	}
}
