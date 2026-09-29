public class Main
{
    public static void insertion(int[] arr){
        for (int i=1;i<arr.length;i++){
            int key = arr[i];
            for (int j = i-1;j>=0;j--){
                if (arr[j] > key){
                    arr[j+1] = arr[j];
                    arr[j] = key;
                }
            }
        }
    }
    public static void main(String[] args){
        int[]  arr = {45,12,89,33,67,21,90,56};
        insertion(arr);
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
