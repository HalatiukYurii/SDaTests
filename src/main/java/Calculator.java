/**
 * Created by RENT on 2018-03-24.
 */
public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double mnoz(double a, double b) {
        return a * b;
    }

    public double dziel(double a, double b) {
        if(b==0){

        }
        return a / b;
    }

    public double odejmowanie(double a, double b) {
        return a - b;
    }

    public boolean isEven(int number) {
        return (boolean) (number % 2 == 0 ? true : false);
    }

    public  int fibonacjego(int n){
        if (n<2){
            return n;
        }
        return fibonacjego(n-1)+fibonacjego(n-2);


    }



}
