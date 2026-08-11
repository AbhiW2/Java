package Arrays;

public class Check_Array_Sorted {
    public static void main(String[] args) {

        int[] array={1,2,3,4,5,6,7};

        Boolean sorted = true;
        int n = array.length;
        for(int i=0;i<n-1;i++){
            if(array[i]>array[i+1])
                sorted=false;
            break;

        }
        if(sorted){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not Sorted");
        }
    }
}
