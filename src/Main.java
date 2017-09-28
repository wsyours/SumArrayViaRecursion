/**
 * Created by Сергей on 26.09.2017.
 */
public class Main {

    public static void main(String[] args) {

    int summ = Main.getRecArrSum(arr,arr.length);
        System.out.println(summ);

    }
   static int arr [] = {1,3,5,6,12,44};
   static  int getRecArrSum(int arr[],int size){

        if(size==0){
            return 0;
        }
        if(size==1){
            return arr[0];
        }
       size--;
        return arr[size]+getRecArrSum(arr,size);
    }
}
