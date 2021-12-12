import java.util.Scanner;

class newClass {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();
        System.out.print("hello " + word);
    }
}