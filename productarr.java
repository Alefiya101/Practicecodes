import java.util.Scanner;
class productarr {
  
  public static void main(String args[]){
        Scanner in=new Scanner(System.in);
      int n;
      productarr obj=new productarr();
        System.out.println("Enter array size");
        n=in.nextInt();
        int nums[]=new int[n];
      System.out.println("Enter");
        for(int i=0;i<n;i++){
         nums[i]=in.nextInt();
      }
    
      int answers[]=obj.productExceptSelf(nums,n);
      for(int i=0;i<n;i++){
         System.out.print(answers[i] + " ");
      }
    }

    public int[] productExceptSelf(int[] nums,int n) {

        int answers[]=new int[n];
       int k=0;
     
        for(int i=0;i<n;i++){
            int product=1;
        for(int j=0;j<n;j++){
          if(i!=j)
          
          product=product*nums[j];
        }
        answers[i]=product;
      }
      
    

        return answers;
        
    }


  
}