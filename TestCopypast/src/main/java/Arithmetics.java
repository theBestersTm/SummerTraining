
class Main {
    public static void main(String[] args) {
        Arithmetics arithmetics = new Arithmetics();
        double res = arithmetics.add(3,7);
    }
}

public class Arithmetics {

    public double add(double a, double b) {
        return a + b;

    }

    public double deduct(double a, double b) {
        return a - b;

    }

    public double mult(double a, double b) {
        return a * b;

    }
    public double div(double a, double b) {
        return a/b;

    }

}
