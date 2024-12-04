import java.util.Scanner;
public class insertElements {
    public static void main(String[] args) {
        int i, element;
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements of array: ");
        for (i = 0; i < 5; i++)
            arr[i] = sc.nextInt();
            System.out.print("Enter an Element to insert: ");
            element = sc.nextInt();
            arr[i] = element;
            System.out.print("\nNow the new array is:");
            for (i = 0; i < 5; i++)
                System.out.print(arr[i] + " ");
        }
    }





