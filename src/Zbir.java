import java.util.Scanner;

public class Zbir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Broj b = new Broj();

       
        System.out.print("Внесете првиот број: ");
        int num1 = scanner.nextInt();
        b.seta(num1);

        
        System.out.print("Внесете вториот број: ");
        int num2 = scanner.nextInt();
        b.setb(num2);

        int c = b.geta() + b.getb();
        System.out.println("Збирот на броевите е: " + c);

        
        scanner.close();
    }
}