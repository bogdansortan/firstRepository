package Calc;

import Ops.Operation;
import java.util.function.Consumer;
import java.util.function.BinaryOperator;
import Ops.*;

public class myCalc {

	public static void main(String[] args) {
		
		myCalc calc=new myCalc();
		Operation add1=new Plus();
		BinaryOperator<Double> add = add1::calc;
		BinaryOperator<Double> min=(a,b)->a-b;
		BinaryOperator<Double> ori=(a,b)->a*b;
		BinaryOperator<Double> div=(a,b)->{ if (b==0) throw new IllegalArgumentException("Division by 0") ;
					else return (a/b);};
		
		
		
		myCalc.print(add,2D,3D);
		myCalc.print(min,2D,3D);
		myCalc.print(ori,2D,3D);
		myCalc.print(div,2D,3D);

		//BinaryOperator<Double> printer=(p1,p2)->p1+p2;
		Consumer<BinaryOperator<Double>> printer = p->{System.out.println(p.apply(69D, 69D));};
		printer.accept(add);
	}
	
	public static void print (BinaryOperator<Double> calc,Double a,Double b)
	{
		System.out.println(calc.apply(a, b));
	}

}
