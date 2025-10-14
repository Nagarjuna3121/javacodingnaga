package org.example;

//Java program for the above approach
import java.io.*;
public class PrintMissingElementsInArray {

    // Function to find the missing elements
    public static void printMissingElements(int arr[], int N)
    {
        int cnt = 0;
        for (int i = arr[0]; i <= arr[N - 1]; i++)
        {

            // Check if number is equal to the first element in
            // given array if array element match skip it increment for next element
            if (arr[cnt] == i)
            {

                // Increment the count to check next element
                cnt++;
            }
            else
            {

                // Print missing number
                System.out.print(i + " ");
            }
        }
    }

    // Driver Code
    public static void main (String[] args)
    {

        // Given array arr[]
        int arr[] = { -2,1 }; // missing elements between -2 and 1 are -1,0
        int N = arr.length;

        // Function Call
        printMissingElements(arr, N);
    }
}

// This code is contributed by Shubham Singh