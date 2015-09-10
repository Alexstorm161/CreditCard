
import java.util.Scanner;
public class ValidationFromFile {
        static long userNumber;
        public static void main(String[]args)
        {
                long[] inputNumber=new long[16];
                long[] q =new long[2];
                long n;
                long total=0;
                Scanner check= new Scanner(System.in);
                System.out.println("Enter Credit Card Information:");
                userNumber=check.nextLong();
                for(int i= 0;i<16;i++)
                {
                        inputNumber[i]=userNumber%10;
                        userNumber=userNumber/10;
                }
                for (int y = 0; y<16; y++)
                {
                        if(y%2==1)
                        {
                                n=inputNumber[y]*2;
                                if(n>9)
                                {
                                        for(int m = 0; m<2;m++)
                                        {
                                                q[m]=n%10;
                                                n=n/10;
                                        }
                                        n=q[0]+q[1];
                                }
                                inputNumber[y]=n;
                        }
                        total=total+inputNumber[y];
                }
                if(total%10==0)
                        System.out.println("Credit Card: Valid");
                else
                        System.out.println("Credit Card: Invalid");
        }
}

