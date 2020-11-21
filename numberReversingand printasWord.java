import java.util.*;
class A
{
public static void main(String[] args)
{

Scanner s=new Scanner(System.in);
int n=s.nextInt();

while(n>0)
{

int r=n%10;

switch (r) {
  case 1:
    System.out.println("one");
    break;
  case 2:
    System.out.println("two");
    break;
  case 3:
    System.out.println("three");
    break;
  case 4:
    System.out.println("four");
    break;
  case 5:
    System.out.println("five");
    break;
  case 6:
    System.out.println("Six");
    break;
  case 7:
    System.out.println("Seven");
    break;
 case 8:
    System.out.println("eight");
    break;
 case 9:
    System.out.println("nine");
    break;
case 0:
    System.out.println("zero");
    break;
}

n=n/10;

}//while



}
}