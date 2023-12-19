import java.util.Scanner;
class kadane{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n;
       System.out.println("Enter the size");
       n=in.nextInt();
       int a[]=new int[n]; 
       System.out.println("Enter the elements");
       for(int i=0;i<n;i++){
         a[i]=in.nextInt();
        }

        int maxi=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<n;i++){
            sum=sum+a[i];

            if(maxi<sum)
            maxi=sum;

            if(sum<0)
            sum=0;

    
        }
         System.out.println(maxi);
    }

   
}
