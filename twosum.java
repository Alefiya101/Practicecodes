import java.util.Scanner;
class twosum{
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int s;
    System.out.println("enter size of the array :");
    s=in.nextInt();
    int a[]=new int[s];

     int t;
    System.out.println("enter the target sum :");
    t=in.nextInt();
    
    System.out.println("the elements of the array :");
    for(int i=0;i<s;i++){
        a[i]=in.nextInt();
    }

    int a2[]=new int[s];
    for(int i=0;i<s;i++){
        a2[i]=a[i];
    }
    
    //bubblesort
for(int i=0;i<s;i++){
    for(int j=0;j<s-1;j++){
        
        int temp=0;
        if(a[j]>a[j+1]){
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
        }
    }
}

//To check is sorted properly
System.out.println("The sorted array is :");
for(int i=0;i<s;i++){
    System.out.print(a[i] + " ");
    }
    System.out.println();
    

    int one=0;
    int sec=0;
    int sum=0;
   for(int i=0;i<s-1;i++){
    sum=a[i]+a[i+1];
  if(sum==t){
    one=a[i];
    sec=a[i+1];
    } 

}

for(int i=0;i<s;i++){
    if(a2[i]==one)
    System.out.println("The first indice is " +i);
    if(a2[i]==sec)
    System.out.print("The second indice is " +i);


}

}
}
















