import java.lang.*;
import java.util.Scanner;
public class Lagranges_theorem
{
    public static void main(String args[]) {
        float x[]=new float[100];
        float y[]=new float[100];
        float xp, yp = 0, p;
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        /* Input Section */
        System.out.println("Enter number of data: ");
        n = sc.nextInt();
        System.out.println("Enter data:\n");
        for(i=1;i<=n;i++)
        {
            System.out.print("x = "+ i);
            x[i]=sc.nextFloat();
            System.out.print("y = "+ i);
            y[i]=sc.nextFloat();
        }
        System.out.println("Enter interpolation point: ");
        xp=sc.nextFloat();
        /* Implementing Lagrange Interpolation */
        for(i=1;i<=n;i++)
        {
            p=1;
            for(j=1;j<=n;j++)
            {
                if(i!=j)
                {
                    p = p* (xp - x[j])/(x[i] - x[j]);
                }
            }
            yp = yp + p * y[i];
        }
        System.out.println("Interpolated value at "+xp + " is "+ yp+"\n");
    }


}
