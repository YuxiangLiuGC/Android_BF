/*
Pick one number in the second String to make the two numbers in first String equal. 
You can only use each number in the second String exactly once.  
{"(3, 4)", "(1, 2, 7, 7)"}, returns 1 because left side number 3 + 1 (the number in the second String"1,2,7,7") = 4 (right side number). 
4 doesn't need to add anything from (1,2,7,7).
{"(5, 9)", "(1, 2, 6, 7)"}, returns 6, 2 because left side number: 5 + 6(from "1,2,6,7") = 9 + 2(from "1,2,6,7").
 */
import java.util.*;
class solution4 {
    public static void main (String[] args){
        System.out.println(helper("(3, 4)","(1, 2, 7, 7)"));
        System.out.println(helper("(5, 9)","(1, 2, 6, 7)"));
    }
    private static String helper(String s1, String s2){
        String[] arr1 = s1.replaceAll("[()\\s]", "").split(",");
        String[] arr2 = s2.replaceAll("[()\\s]", "").split(",");

        String res="";
        int first = Integer.parseInt(arr1[0]);
        int second = Integer.parseInt(arr1[1]);

        for(int i=0; i<arr2.length; i++){
            int num = Integer.parseInt(arr2[i]);
            if(first == second + num || second == first + num){
                res = arr2[i];
                return res;
            }
        }

        for(int i=0; i<arr2.length; i++){
            int sum1 = first + Integer.parseInt(arr2[i]);
            for(int j=0; j<arr2.length; j++){
                if(j==i) continue;
                int sum2 = second + Integer.parseInt(arr2[j]);
                if(sum1 == sum2){
                    res = arr2[i] + ", " + arr2[j];
                    return res;
                }
            }
        }
        return "not possible";
        
    }
}
