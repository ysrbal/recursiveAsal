import java.util.Scanner;

public class Asal {
    static boolean asal(int n, int k) {
        if (n <= 2) {
            return (n == 2) ? true : false;
        } else if (n % k == 0) {
            return false;
        } else if (k * k > n) {
            return true;
        }
        return asal(n, k + 1);

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz : ");
        int n = inp.nextInt();
        if (asal(n, 2)) {
            System.out.println(n + " Sayisi Asal Sayidir.");

        } else {
            System.out.println(n + " Sayisi Asal Sayi Degildir.");
        }

    }
}
