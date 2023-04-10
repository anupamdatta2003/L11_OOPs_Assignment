import java.util.Scanner;

class Complex{
    int real;
    int ima;
    public Complex(int r, int i){
        real = r;
        ima = i;
    }
    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real),(a.ima+b.ima));
    }
    public static Complex difference(Complex a, Complex b){
        return new Complex((a.real-b.real),(a.ima-b.ima));
    }
    public static Complex product(Complex a, Complex b){
        return new Complex(((a.real*b.real)-(a.ima*b.ima)),((a.real*b.ima)+(a.ima*b.real)));
    }
    public void printComplex(){
        if(real == 0 && ima != 0){
            System.out.println(ima+"i");
        } else if (ima == 0 && real != 0) {
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+ima+"i");
        }
    }
}
public class Q_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part of complex number 1 : ");
        int r1 = sc.nextInt();
        System.out.print("Enter complex part of complex number 1 without iota sign : ");
        int c1 = sc.nextInt();
        System.out.print("Enter real part of complex number 2 : ");
        int r2 = sc.nextInt();
        System.out.print("Enter complex part of complex number 2 without iota sign : ");
        int c2 = sc.nextInt();
        Complex c = new Complex(r1, c1);
        Complex d = new Complex(r2, c2);
        Complex e = Complex.add(c,d);
        Complex f = Complex.difference(c,d);
        Complex g = Complex.product(c,d);
        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}
