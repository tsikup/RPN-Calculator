import java.util.EmptyStackException;

public class ResultPresenter {
	public void operate() {
		try {
			System.out.println(Calc.st.pop());
		}catch(EmptyStackException e) {
			System.err.println("EmptyStackException: " + "You are trying to pop from an empty stack ..... RESULT SECTION");
		}
	}
}
