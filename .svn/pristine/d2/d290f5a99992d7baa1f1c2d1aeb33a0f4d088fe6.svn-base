package com.xywei.expression;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {

		int input = 20;
		Context context = new Context();
		context.setInput(input);
		Expression expression1 = new PlusExpression();
		Expression expression2 = new SubtractExpression();
		List<Expression> expressions = new ArrayList<>();
		expressions.add(expression1);
		expressions.add(expression1);
		expressions.add(expression1);
		expressions.add(expression1);
		expressions.add(expression2);
		expressions.add(expression2);
		expressions.add(expression2);
		expressions.add(expression2);
		expressions.add(expression2);
		for (Expression e : expressions) {
			e.interpret(context);
			System.out.println(context.getOutput());
		}

	}

}
