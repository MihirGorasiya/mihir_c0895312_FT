public class Modulo extends Binary {
    ArithmeticExp left;
    ArithmeticExp right;

    public Modulo(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate() {
        return left.evaluate() / right.evaluate();
    }

    @Override
    public String evaluateString() {
        return Integer.toString(left.evaluate()) + "/" + Integer.toString(right.evaluate());
    }
}
