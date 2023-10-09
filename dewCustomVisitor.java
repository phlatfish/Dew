import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import java.util.HashMap;
import java.util.Map;

public class dewCustomVisitor extends dewBaseVisitor<Object> {
    private Map<String, Object> variables = new HashMap<>();

    @Override
    public Object visitAssignment(dewParser.AssignmentContext ctx) {
        String variableName = ctx.variableName().getText();
        Object value = visit(ctx.expression());
        variables.put(variableName, value);
        return value;
    }

    @Override
    public Object visitVariableName(dewParser.VariableNameContext ctx) {
        String variableName = ctx.getText();
        if (variables.containsKey(variableName)) {
            return variables.get(variableName);
        } else {
            throw new RuntimeException("Variable " + variableName + " not defined");
        }
    }

    @Override
    public Object visitExpression(dewParser.ExpressionContext ctx) {
        if (ctx.op != null) {
            Object left = visit(ctx.expression(0));
            Object right = visit(ctx.expression(1));
            switch (ctx.op.getType()) {
                case dewParser.ADD:
                    return (Integer) left + (Integer) right;
                case dewParser.SUB:
                    return (Integer) left - (Integer) right;
                case dewParser.MUL:
                    return (Integer) left * (Integer) right;
                case dewParser.DIV:
                    return (Integer) left / (Integer) right;
                default:
                    throw new RuntimeException("Unknown operator: " + ctx.op.getText());
            }
        } else if (ctx.methodCall() != null) {
            return visit(ctx.methodCall());
        } else if (ctx.variableName() != null) {
            return visit(ctx.variableName());
        } else if (ctx.NUMBER() != null) {
            return Integer.valueOf(ctx.NUMBER().getText());
        } else if (ctx.STRING() != null) {
            return ctx.STRING().getText();
        } else {
            throw new RuntimeException("Unknown expression: " + ctx.getText());
        }
    }

    @Override
    public Object visitMethodCall(dewParser.MethodCallContext ctx) {
        String methodName = ctx.methodName().getText();
        if (methodName.equals("output")) {
            Object argument = visit(ctx.methodCallArguments().expression(0));
            System.out.println(argument);
            return Integer.valueOf(1);
        }
        return Integer.valueOf(0);
    }
}
