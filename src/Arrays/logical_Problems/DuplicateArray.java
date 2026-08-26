package Arrays;

public class DuplicateArray {
    public static void display(int arr[]){
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=-1){
                System.out.println(arr[i]+" ");

            }
        }
    }

    public static void removeDuplicate(int arr[]){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                        arr[i] = -1;
                        arr[j] = -1;
                }
            }
        }
        System.out.println("Array without duplicates");
        display(arr);

    }

    public static void main(String[] args) {
        int arr[] ={ 1,2,5,4,2,4,8,6,5};
        removeDuplicate(arr);
    }
}
