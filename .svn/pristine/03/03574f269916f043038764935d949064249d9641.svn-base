package com.xywei.expression;

public class SubtractExpression implements Expression {

	@Override
	public void interpret(Context context) {
		int input = context.getInput();
		System.out.println("输入：" + input);
		System.out.println("自减运算");
		context.setInput(--input);
		context.setOutput(input);

	}

}
