import java.util.Arrays;
import java.util.Scanner;

public class Sort{
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i<10;i++) {
            numbers[i] = sc.nextInt();
        }

      
        Arrays.sort(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
