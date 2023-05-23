class ArrayTest
{  
public static void main(String args[]){  
int b[] = new int [] {10,20,30,40,50};  
int sum=0;
for(int i=0;i<b.length;i++){
sum=sum+b[i];
}
System.out.println("sum of all array"+sum);
}
}