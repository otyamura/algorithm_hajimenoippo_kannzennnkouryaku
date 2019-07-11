public class SumOfArrayTrace {
    public static void  main(String[] args) {
        int[] a ={72,68,43,53,63,5,23,64,63,14};
        int sum=0,i;
        
        System.out.println("ループの前"+sum);

        for(i=0;i<a.length;i++){
            sum += a[i];
            System.out.println("ループの中:sum="+sum+", i="+i);
        }
        
        System.out.printf("sum = %d\n",sum);
        System.out.println("ループの後:sum="+sum+", i="+i);
    }
    
}