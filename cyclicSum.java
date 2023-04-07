import java.util.*;
class cyclicSum
{
    static int power(int rep)
    {
        int temp=1;
        while(rep>1)
        {
            if(rep==0)
            break;
            temp = temp*10;
            rep--;
        }
        return temp;
    }
    public  static void main(String[] args)
    {
        int number,sum=0;
        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        while(number>0)
        {
            int temp = number,flag=0;
            while(temp>0)
            {
                sum+=temp%10;
                temp/=10;
                flag++;
            }
            int a = cyclicSum.power(flag);
            number=number%a;
        }
        System.out.println(sum);
    }
}