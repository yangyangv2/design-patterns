package com.ca.dp.behavioral.interpreter;

/**
 * Pitfalls
 * - Complexity
 * - Class per rule
 * - Use of other patterns
 * - Add new variant
 * - Specific case
 *
 * Summary
 * - define a grammar
 * - rules or validation
 * - special case pattern
 * - consider the visitor
 *
 * Created by yanya04 on 6/12/2017.
 */
public class InterpreterDemo {
    static Expression buildInterpreterTree() {
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        // Tigers and Bears
        Expression alternation1 = new AndExpression(terminal2, terminal3);

        // (Tigers and Bears) || Lions
        Expression alternation2 = new OrExpression(terminal1, alternation1);
        return new AndExpression(terminal3, alternation2);
    }

    public static void main(String[] args) {
        //String context = "Lions";
        String context = "Tigers Bears";
        Expression define = buildInterpreterTree();
        System.out.println(context + " is " + define.interpret(context));

    }


}
