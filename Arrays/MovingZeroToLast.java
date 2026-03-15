import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++) {
            arr[i] = sc.nextInt();
        }
        int add  = 0;
        for(int i = 0;i < n;i++) {
            if(arr[i] != 0) {
                arr[add] = arr[i];
                add = add + 1;
            }
        }
        while(add < n) {
            arr[add] = 0;
            add = add + 1;
        }
        System.out.print(Arrays.toString(arr));
    }
}

5
1 0 0 2 3
[1, 2, 3, 0, 0]
