import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x");
        int x= scanner.nextInt();
        System.out.println("Enter y");
        int y = scanner.nextInt();
        NumberFormatException n = new NumberFormatException();
        n.caculate(x,y);
    }
    public void caculate(int x, int y){
        try {
            int a=x+y;
            int b=x-y;
            int c=x*y;
            int d=x/y;
            System.out.println("x+y= "+a);
            System.out.println("x-y= "+b);
            System.out.println("x*y= "+c);
            System.out.println("x/y= "+d);
        }catch (Exception e){
            System.out.println("Exception");
        }
    }
}
