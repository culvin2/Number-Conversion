import java.util.Scanner;

public class Main {
    String user;
    String hasil;
    int num;

    public void inputUser() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input your name [3-20]: ");
            user = scanner.nextLine();
        } while (user.length() < 3 || user.length() > 20);
    }

    public void inputNum() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input a number[1-100]: ");
            try {
                num = scanner.nextInt();
            }
            catch (Exception exception) {
                num = 0;
            }
        } while (num < 1 || num > 100);
    }

    public void convertHex() {
        hasil = Integer.toHexString(num);
    }

    public static void main(String[] args) {
        Main main = new Main();
        String cont = "n";
        do {
            System.out.println("Welcome to Super Math Course");
            System.out.println("============================");
            System.out.println("");

            main.inputUser();

            System.out.print("Hello, " + main.user);
            int panjangUser = main.user.length();
            int panjangBintang = 20 - panjangUser;
            for (int i=0; i<panjangBintang; i++) {
                System.out.print("*");
            }
            System.out.println("\n");
            System.out.println("Today's lesson is about converting a number");
            System.out.println("===========================================\n");

            main.inputNum();

            main.convertHex();

            System.out.println("");
            System.out.println("Number in decimal: +" + main.num);
            System.out.println("Number in hexadecimal: 0X" + main.hasil);
            System.out.println("\n");

            Scanner scanner = new Scanner(System.in);
            do {
                System.out.print("Do you want to replay? [y/n] : ");
                cont = scanner.nextLine();
            } while (!cont.equals("y") && !cont.equals("n"));
        } while (cont.equals("y"));
    }
}
