import java.util.Stack;

public class Calc {
	static public Stack<Double> st;
	static private Operand op;
	@SuppressWarnings("unused")
	static private CalculatorGui calc;
	static public Adder adder;
	static public Subtracter suber;
	static public Multiplier multer;
	static public Divider diver;
	static public ResultPresenter resulter;
	
	public static void main(String args[]) {
		st = new Stack<Double>();
		op = new Operand();
		adder = new Adder();
		suber = new Subtracter();
		multer = new Multiplier();
		diver = new Divider();
		resulter = new ResultPresenter();
		calc = new CalculatorGui(op, adder, suber, multer, diver, resulter);
	}

}
