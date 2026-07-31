package Arrays;

public class Find_Average {
    public static void main(String[] args) {
        int [] array = {4,5,6,7,8,2,4,5};
        int n = array.length;
        int sum =0;
        for(int i=0;i<n;i++){
            sum+=array[i];
        }
        double average = sum/n;

        System.out.println("Average of array:"+average);
    }
}
