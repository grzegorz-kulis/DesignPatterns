package com.lisek.interpreter;

public class Main {

    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }


    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarried = getMarriedWomanExpression();

        Context ic = new Context("John");
        System.out.println("Is john male? : " + isMale.interpret(ic));

        ic = new Context("Married Julie");
        System.out.println("Is Julie a married woman? : " + isMarried.interpret(ic));

    }
}
