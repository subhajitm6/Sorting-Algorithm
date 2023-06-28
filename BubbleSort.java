public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={5,2,7,1,6,4};
        int n=arr.length;
        bubblesort(arr, n);
    }
    static void bubblesort(int arr[], int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
