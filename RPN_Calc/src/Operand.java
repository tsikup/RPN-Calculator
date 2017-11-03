
public class Operand {
	public StringBuffer buf;
	
	public Operand() {
		buf = new StringBuffer(14);
	}
	
	public void addDigit(char digit) {
		if(Calc.timeEx==0) {
			CalculatorGui.display.setText("");
			Calc.timeEx++;
		}
		buf.append(digit);
		CalculatorGui.display.setText(CalculatorGui.display.getText() + digit);
	}
	public void deleteLastDigit() {
		String s = new String(buf);
		buf = new StringBuffer(s.substring(0, s.length()-1));
		CalculatorGui.display.setText(buf.toString());
	}
	public void complete() {
		char c = buf.charAt(0);
		
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
		default:
			Calc.st.push(Double.parseDouble(buf.toString()));
			buf = new StringBuffer(14);
			CalculatorGui.display.setText(CalculatorGui.display.getText() + " ");
		}
	}
	public void reset() {
		buf = new StringBuffer(14);
		CalculatorGui.display.setText("0");
		Calc.timeEx=0;
	}
}
