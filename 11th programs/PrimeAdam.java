import java.util.Scanner;
class PrimeAdam
{
    boolean isPrime(int n)
    {
        int c=0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==2)
            return true;
        else
            return false;
    }
    
    boolean isAdam(int n)
    {
        int rev = reverse(n);
        int sq_of_n = n*n;
        int sq_of_rev = rev*rev;
        if(sq_of_n == reverse(sq_of_rev))
            return true;
        else
            return false;
    }

    int reverse(int n)
    {
        int rev=0;
        while(n!=0)
        {
            rev = rev*10+n%10;
            n/=10;
        }
        return rev;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of m and n");
        System.out.print("m = ");
        int m = in.nextInt();
        System.out.print("n = ");
        int n = in.nextInt();
        
        if(m>=0 && n>0 && m<n)
        {
            PrimeAdam obj = new PrimeAdam();
            System.out.println("THE PRIME-ADAM INTEGERS ARE:");
            int freq=0;
            for(int i=m; i<=n; i++)
            {
                if(obj.isPrime(i) && obj.isAdam(i))
                {
                    freq++;
                    System.out.print(i + " ");
                }
            }
            if(freq==0)
                System.out.print("NIL");
            System.out.println("\nFREQUENCY OF PRIME-ADAM INTEGERS IS: " +freq);
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
    }
}