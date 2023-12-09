public class Binary extends ArithmeticExp{
    public ArithmeticExp left;
    public ArithmeticExp right;

    public Binary(int type, int value, ArithmeticExp left, ArithmeticExp right) {
        super(type, value, left, right);
    }

    @Override
    public int evaluate(ArithmeticExp term) {
        return 0;
    }
}
