abstract class Binary extends ArithmeticExp{
    public ArithmeticExp left;
    public ArithmeticExp right;

    public Binary(ArithmeticExp left, ArithmeticExp right){
        this.left = left;
        this.right = right;
    }
}
