public class Calc_Test {

    public static double sum;

    public static void calc(double numA, double numB, char symbol){

        switch(symbol) {
            case '+': sum = numA + numB;
                break;
            case '-': sum = numA - numB;
                break;
            case '*': sum = numA * numB;
                break;
            case '/': sum = numA / numB;
                break;
            default: System.out.println("Not correct operator");
                break;
        }
        System.out.println("Результат: " + sum);
    }

    public static void main(String[] args) {

        calc(12, 10, '+');
    }
}