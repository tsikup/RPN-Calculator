
public class Operand {
	public StringBuffer buf;
	
	public Operand() {
		buf = new StringBuffer(14);
	}
	
	public void addDigit(char digit) {
		buf.append(digit);
		System.out.println(buf);
	}
	public void deleteLastDigit() {
		String s = new String(buf);
		buf = new StringBuffer(s.substring(0, s.length()-1));
		System.out.println(buf);
	}
	public void complete() {
		/*char c = buf.charAt(0);
		switch(c) {
		case '+':
			System.out.println("ADD");
		case '-':
			System.out.println("----");
		case '*':
			System.out.println("MULT");
		case '/':
			System.out.println("DIV");
		case '=':
			System.out.println("RESULT");
		default:*/
		Calc.st.push(Double.parseDouble(buf.toString()));
			//System.out.println(Calc.st.get(Calc.st.size()-1));
		//}
		this.reset();
	}
	public void reset() {
		buf = new StringBuffer(14);
		System.out.println("RESET");
	}
}
