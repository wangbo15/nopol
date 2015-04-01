package fr.inria.lille.spirals.repair.expression.operator;


/**
 *
 */
public enum Operator {
    AND(Boolean.class, "&&", Boolean.class, Boolean.class, false),
    OR(Boolean.class, "||", Boolean.class, Boolean.class, false),
    EQ(Boolean.class, "==", Object.class, Object.class, true),
    NEQ(Boolean.class, "!=", Object.class, Object.class, true),
    LESSEQ(Boolean.class, "<=", Number.class, Number.class, false),
    LESS(Boolean.class, "<", Number.class, Number.class, false),
    //GREATER(Boolean.class, ">", Number.class, Number.class, false),
    //GREATEREQ(Boolean.class, ">=", Number.class, Number.class, false),

    ADD(Number.class, "+", Number.class, Number.class, true),
    SUB(Number.class, "-", Number.class, Number.class, false),
    MULT(Number.class, "*", Number.class, Number.class, true),
    DIV(Number.class, "/", Number.class, Number.class, false);
    // Operator MOD(Number.class, "%", Number.class, Number.class);

    private final Class returnType;
    private final String symbol;
    private final Class param1;
    private final Class param2;
    private final boolean isCommutative;

    /**
     *
     */
    Operator(Class returnType, String symbol, Class param1, Class param2, boolean isCommutative) {
        this.returnType = returnType;
        this.symbol = symbol;
        this.param1 = param1;
        this.param2 = param2;
        this.isCommutative = isCommutative;
    }

    public String getSymbol() {
        return symbol;
    }

    public boolean isCommutative() {
        return this.isCommutative;
    }

    public Class getReturnType() {
        return returnType;
    }

    public Class getParam1() {
        return param1;
    }

    public Class getParam2() {
        return param2;
    }
}

