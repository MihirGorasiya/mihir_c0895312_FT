public abstract class ArithmeticExp {
    int type;
    int value;
    ArithmeticExp left;
    ArithmeticExp right;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public ArithmeticExp(int type, int value, ArithmeticExp left, ArithmeticExp right) {
        this.type = type;
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ArithmeticExp getLeft() {
        return left;
    }

    public void setLeft(ArithmeticExp left) {
        this.left = left;
    }

    public ArithmeticExp getRight() {
        return right;
    }

    public void setRight(ArithmeticExp right) {
        this.right = right;
    }

    public abstract int evaluate(ArithmeticExp term);
}
