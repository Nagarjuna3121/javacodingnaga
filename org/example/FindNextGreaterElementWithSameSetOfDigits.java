package org.example;

public class FindNextGreaterElementWithSameSetOfDigits {
    public static void main(String[] args) {
        String str = "218765";

        System.out.println(nextPermutation(str));
    }

    private static String nextPermutation(String str) {

        int n = str.length();

        if(n <=1){
            return "not possible";
        }
        int i;
        for(i = n-1;i>0;i--){
            if(str.charAt(i) > str.charAt(i-1)){
                break;
            }
        }

        if( i == 0){
            return "not possible";
        }

        for(int j = n-1;i>=i;j--){
            if(str.charAt(i-1) < str.charAt(j)){
           char[] ch = str.toCharArray();
           char temp = ch[i-1];
           ch[i-1] = ch[j];
           ch[j] = temp;

           str = new String(ch);
           break;

            }

        }

        char[] ch = str.toCharArray();
        reverse(ch,i,str.length() - 1);


        return new String(ch);
    }

    static void reverse(char[] arr, int start, int end)
    {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
