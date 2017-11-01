import java.util.EmptyStackException;

public class Subtracter {
	public void operate() {
		try {
			Double c = Calc.st.pop();
			Calc.st.push(Calc.st.pop()-c);
			//System.out.println(Calc.st.get(Calc.st.size()-1));
		}catch(EmptyStackException e) {
			System.err.println("EmptyStackException: " + "You are trying to pop from an empty stack ..... SUB SECTION");
		}
	}
}
