package day53_FunctionalInterface;

public class LambdaExpressions {

    static BurakFunctionalInterface<Integer> numbersReverse = (n) -> {
        int temp = 0;
        while (n > 0) {
            temp = temp * 10 + n % 10;
            n /= 10;
        }
        return temp;
    };

    public static void main(String[] args) {

        System.out.println(numbersReverse.apply(354));

        MyThirdFunctionalInterface<String> stringReverse =
                (s) -> {
                    String reverse = new StringBuilder(s).reverse().toString();
                    return reverse;
                };

        String result = stringReverse.method("Wooden Spoon");

        System.out.println(result);

        //create a function that can return the cube of an integer

        BurakFunctionalInterface<Integer> cube = n -> {
            return n * n * n;
        };
        System.out.println(cube.apply(17));

    }

}
