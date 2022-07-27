public class ss{
    public static void main(String[] args) {
        int n=232342;
        int[] arr = new int[10];
        while (n > 0) {
            int digit = n % 10;  
            arr[digit]++;
            n = n / 10;
        }
        
        int f = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[f]) {
                f = i;
            }
        }
        System.out.println("Most frequent digit is : "+f);
    }
}
