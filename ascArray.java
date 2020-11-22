import java.util.*;
class B
{
public static void main(String[] args)
{

Scanner s=new Scanner(System.in);
System.out.println("enter array length:");
int n=s.nextInt();

//declaring array
 int intArr[] = new int[n];  // allocating memory to array


System.out.println("enter array elements");

for(int i=0;i<n;i++)
{
intArr[i]=s.nextInt();
}

int len=intArr.length;


for(int i=0;i<len;i++)
{
 for(int j=i+1;j<len;j++)
  {
   
   if(intArr[i]>intArr[j])
    {
     
     int temp=intArr[i];
     intArr[i]=intArr[j];
     intArr[j]=temp;
    }//if

   }

}//outer for

System.out.println("after arranging in ascending");

for(int i=0;i<n;i++)
{
System.out.println(intArr[i]);
}

}

}

