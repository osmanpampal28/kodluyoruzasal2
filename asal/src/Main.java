import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int n =scanner.nextInt();
        if (Asal(n,2))
            System.out.println("sayı asaldır");
        else
            System.out.println("sayı asal değildir");

    }
    public static boolean Asal(int n, int i)
    {

        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        return Asal(n, i + 1);
    }
}
