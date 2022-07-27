public class qw {
    public static void main(String[] args) {
        int[] arr = { 2,5,1,7,9,3};

        int sum= 0;
        for(int i=0;i<arr.length-1;i++)
        {
            sum = arr[i]+arr[i+1];
            arr[i]=sum;
            sum= 0;
            
        }
     
     for(int i=0;i<arr.length;i++)
     {
         System.out.print(arr[i]+" ");
         
     }
    }
}

//@Ks
