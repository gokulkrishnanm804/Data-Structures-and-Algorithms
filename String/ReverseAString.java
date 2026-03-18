import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        System.out.println("Reversed: " + sb);
    }
}
