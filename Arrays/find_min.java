package Arrays;

public class find_min {
    public static void main(String[] args) {
        int [] arr = {5, 2, 8, 1, 9};

        int min = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Minimum value in the array is: " + min);
    }
    
}
