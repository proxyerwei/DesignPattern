package com.xywei.expression;

public class PlusExpression implements Expression {

	@Override
	public void interpret(Context context) {

		int input = context.getInput();

		System.out.println("输入" + input);
		System.out.println("自增运算");

		context.setInput(++input);
		context.setOutput(input);

	}

}
