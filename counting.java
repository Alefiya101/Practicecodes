import java.util.Scanner;
class counting{
    public static void main(String[] args) {
        int a;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a range");
        a=in.nextInt();
        int bit[]=new int[a+1];

int y;
int k;

for(int i=1;i<=a;i++){
    int bin=0;
    int count =0;
    int temp=i;
    while(temp!=0){
            y=temp%2;
        bin=bin*10 +y;
            temp=temp/2;
        }
      

      String s=Integer.toString(bin);
    for(int j=0;j<s.length();j++){
        if(s.charAt(j)== '1'){
        count++;
        }
    }
     
       bit[i]=count;
}
    

bit[0]=0;
    for(int i=0;i<=a;i++){
        System.out.print(bit[i] + " ");
    }
    }
}

    
        
    