/*
Have the function Superincreasing (arr) take the array of numbers stored in arr
and determine if the array forms a superincreasing sequence
where each element in the array is greater than the sum of all previous elements.
The array will only consist of positive integers.
For example: if arr is [1, 3, 6, 13, 54] then your program
should return the string "true" because it forms a superincreasing sequence.
If a superincreasing sequence isn't formed, then your program
should return the string "false"
 */
class Solution3 {
    public static void main(String[] args){
        System.out.println(superIncresing(new int[]{1, 3, 6, 13, 54}));
    }
    private static Boolean superIncresing(int[] arr){
        for(int i=1; i<arr.length; i++){
            int sum = 0;
            for(int j=0; j<i; j++){
                sum += arr[j];
            }
            if(sum>=arr[i]) return false;
        }
        return true;
    }
}
