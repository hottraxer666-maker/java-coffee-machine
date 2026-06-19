import java.util.Scanner;
public class ScannerService {
    private static final Scanner sc = new Scanner(System.in);
    public static int scanInt(){
        int num = sc.nextInt();
        sc.nextLine();
        return num;
    }
    public static String scanString(){
        String string = sc.nextLine();
        return string;
    }
    public static void closeScanner(){
        sc.close();
    }
}
