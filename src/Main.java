public class Main {
    public static void main(String[] args) {
        ArithmeticExp term = new Sum(
                new Number(3),
                new Product(new Number(2), new Number(5))
        );

        System.out.println(term.evaluate());
        System.out.println(term.evaluateString());
    }
}