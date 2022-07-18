package factorial.java;

public class Factorial {
    public int getFactorial(int number) {
        return number == 0 
            ? 1 
            : number * getFactorial(number - 1);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        System.out.println(factorial.getFactorial(4));
    }
}
