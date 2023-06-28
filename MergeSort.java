public class MergeSort {
    public static void main(String[] args) {
        int arr[]={5,2,7,1,6,4};
        int n=arr.length;
        devide(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void devide(int arr[], int l, int h){
        if(l<h){

            int mid=l+(h-l)/2;
            devide(arr, l, mid);
            devide(arr, mid+1, h);
            merge(arr, l, mid, h);
        }
    }
    static void merge(int arr[], int l, int mid, int h){
        int n=arr.length;
        int b[]=new int[n];
        int i=l, j=mid+1, k=l;
        while(i<=mid && j<=h){
            if(arr[i]<=arr[j]){
                b[k++]=arr[i++];
            }else{
                b[k++]=arr[j++];
            }
        }
        if(j>h){
            while(i<=mid){
                b[k++]=arr[i++];
            }
        }else{
            while(j<=h){
                b[k++]=arr[j++];
            }
        }
        for(k=l;k<=h;k++){
            arr[k]=b[k];
        }
    }
}
