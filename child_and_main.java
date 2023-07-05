import java.util.Scanner;

class except extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                
            }
        }
    }
}
class HelloWorld {
    static int armstrong(int n)
    {
        int sum=0,temp=n;
        while(n>0)
        {
            sum=sum+((n%10)*(n%10)*(n%10));
            n/=10;
        }
        if(sum==temp)return 1;
        else return 0;
    }
    public static void main(String[] args) throws Exception{
        except t1 = new except();
        t1.start();
        for(int i=100;i<=999;i++)
        {
            if(HelloWorld.armstrong(i)==1){
            System.out.println("main");
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                
            }
            }
        }
    }
}