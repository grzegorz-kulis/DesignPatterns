package com.lisek.interpreter;

public class OrExpression implements Expression {
    private Expression e1;
    private Expression e2;

    public OrExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public boolean interpret(Context context) {
        return e1.interpret(context) || e2.interpret(context);
    }
}
