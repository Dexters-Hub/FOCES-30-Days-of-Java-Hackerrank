// Day 8
/* Read an array and print 0 and 1 for even and odd elements of array respectively*/

import java.io.*;
import java.util.*;

public class Explore_array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] % 2 == 0) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            } 
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }

}
