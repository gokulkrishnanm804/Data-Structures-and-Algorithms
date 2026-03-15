import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++) {
            arr[i] = sc.nextInt();
        }
        int high = arr[0];
        for(int i = 1;i < n;i++) {
            if(high < arr[i]) {
                high = arr[i];
            }
        }
        System.out.print(high);
    }
}

5
10 20 30 50 40
50
