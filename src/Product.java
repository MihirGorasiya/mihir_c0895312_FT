public class Product extends Binary {
    ArithmeticExp left;
    ArithmeticExp right;

    public Product(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }

    @Override
    public String evaluateString() {
        return Integer.toString(left.evaluate()) + "*" + Integer.toString(right.evaluate());
    }
}
