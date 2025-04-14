
// java program to sort an array in  ascending order

import java.util.Scanner;
public class ArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int i, temp, j;
        System.out.println("Enter the element in an array");
        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5 - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("The element after sorting in an ascending order ");
        for (i = 0; i < 5; i++) {
            System.out.println(arr[i]);

        }
    }
}