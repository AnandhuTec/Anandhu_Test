class ArrayBubbleSort
{
public static void main(String args[])
{
int a[]={5,4,3,2,1};
int temp;
System.out.println("Array elements befor sorting:");
for(int i=0; i<a.length;i++)
{
System.out.println(a[i]);
}
for (int j=0; j<a.length;j++)
 {     
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
System.out.println(a[i]);
} 
}
