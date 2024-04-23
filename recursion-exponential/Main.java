public class Main {

    public static void main(String[] args) {
        int base = Integer.parseInt(args[0]);
        int exponent = Integer.parseInt(args[1]);
        int result = exponential(base, exponent);
        System.out.println(result);
    }

    static int exponential(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        }

        // NOTE: Is useless
        // if (exponent == 1) {
        // return base;
        // }

        return base * exponential(base, exponent - 1);
    }

}
