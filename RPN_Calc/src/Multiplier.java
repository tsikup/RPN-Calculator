import java.util.EmptyStackException;

public class Multiplier {
	public void operate() {
		try {
			Calc.st.push(Calc.st.pop()*Calc.st.pop());
			//System.out.println(Calc.st.get(Calc.st.size()-1));
		}catch(EmptyStackException e) {
			System.err.println("EmptyStackException: " + "You are trying to pop from an empty stack ..... MULT SECTION");
		}
	}
}
