import java util.Scanner;
class main {
  public static void main(String[] args)
  {
    Scanner sc=new Scanner sc(System.in);
    int n=sc.nextInt();
    boolean prime=TRUE;
    for(int i=0;i<n;i++)
      {
        if(n%i==0)
        {
          System.out.println("NOT prime");
          prime=false;
          break;
        }
        else {
                    System.out.println("prime");
        }
      }
  }
}
