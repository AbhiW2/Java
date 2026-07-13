package Arrays;
public class Find_max {
    public static void main(String[] args) {

        int [] num = {2,4,6,7,8,1};

        int max=num[0];

        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("Maximum value in the array is: " + max);
    }
    
}
