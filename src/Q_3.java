import java.util.Scanner;

class Area{
    int length;
    int breadth;
    public Area(int l, int b){
        length = l;
        breadth = b;
    }
    public int getArea(){
        return length*breadth;
    }

}
public class Q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l,b;
        System.out.print("Enter length : ");
        l = sc.nextInt();
        System.out.print("Enter breadth : ");
        b = sc.nextInt();
        Area a = new Area(l,b);
        System.out.println("Area : "+a.getArea());
    }
}
