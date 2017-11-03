import java.util.EmptyStackException;

public class Multiplier {
	public void operate() {
		try {
			Calc.st.push(Calc.st.pop()*Calc.st.pop());
			CalculatorGui.display.setText(CalculatorGui.display.getText() + " *");;
		}catch(EmptyStackException e) {
			System.err.println("EmptyStackException: " + "You are trying to pop from an empty stack ..... MULT SECTION");
			CalculatorGui.display.setText("Empty Stack. Press C/CE");
		}
	}
}
