import java.util.Scanner;

public class Main {
    public static void main (String [] args)

    {
        Scanner d=new Scanner(System.in);

        int g = d.nextInt();
        int t = d.nextInt();

        System.out.println(sum(g,t));
        sumd();

    }



      static int sum(int g,int t)


      {
          return g+t;
      }
   static int x=4, y=5;
     static void sumd(){


        System.out.println(x+y);
     }





}
