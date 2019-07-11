public class SumOfArray {
    public static void  main(String[] args) {
        int[] a ={72,68,43,53,63,5,23,64,63,14};
        int sum=0,i;
        
        for(i=0;i<a.length;i++){
            sum += a[i];
        }
        
        System.out.printf("sum = %d\n",sum);
    }
    
}