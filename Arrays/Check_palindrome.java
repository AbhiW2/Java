package Arrays;

public class Check_palindrome {
    public static void main(String[] args) {
        int [] array = {10,11,12,12,11,10};

        int n = array.length;
        int left=0;
        int right = n-1;

        while(left<right){
            if(array[right]!=array[left]){
                System.out.println(" Array is Not Palindrome");
            }
            left++;
            right--;
        }
        System.out.println(" Array is Plaindrome Array");
    }
}
