import java.util.*;
class snakeladder
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter number of players (maximum upto 4)");
    int n=sc.nextInt();
    int A[]=new int[n];
    int B[]=new int[n];
    for(int m=0;m<n;m++)
    {
        B[m]=-1;
    }
    boolean flag=false;
    boolean ladder=true;
    int win=0;
    int c=0;
    for(int i=1;i>0;i=i+1)
    {
        for (int k=0;k<n;k++)
        {
            ladder=true;
            while((ladder==true)&&(flag==false))
            {
            System.out.println("Player "+(k+1)+" will throw dice");
            int s=throwDice();
            System.out.println("Dice gives - "+s);
            if(s==1||s==6)
            {
            B[k]++;
            }
            if(((A[k]+s)<=101) && (B[k]>=0))
            {
        A[k]=A[k]+s;
        ladder=isladder(A[k]);
        A[k]=snake(A[k]);
        ladder=isladder(A[k]);
        A[k]=ladder(A[k]);
        A[k]=snake(A[k]);
        A[k]=ladder(A[k]);
        System.out.println("Player "+(k+1)+" reached "+A[k]);
            }
            else 
            {
                System.out.println("Can't move");
                ladder=false;
            }
        if(A[k]==101)
        {
            win=k+1;
           flag=true;
        }
           
            }
            
        }
          if (flag)
        break;
    }
    System.out.println("Congratualations! player "+win+" has won the game");
    
    
}
static int callDice()
{
    int a=(int)(Math.random()*6)+1;
    return a;
}
static int throwDice()
{ 
    Scanner sc=new Scanner (System.in);
 char ch=sc.next().charAt(0);
 int b=0;
 boolean flag=false;
       do
        {
            if(ch=='+')
            {
                 b=callDice();
                flag=true;
            }
            else
            {
            System.out.println("Throw again! invalid throw ");
             ch=sc.next().charAt(0);
            }
             if(flag==true)
             break;
        }while(true);
        
        return b;
}

static int snake(int a)
{
    int x=a;
    if(x==13)
    x=9;
    else if(x==23)
    x=4;
    else if(x==35)
    x=5;
    else if(x==51)
    x=32;
    else if(x==62)
    x=40;
    else if(x==85)
    x=38;
    else if(x==94)
    x=34;
    else if(x==99)
    x=78;
    if(a!=x)
    System.out.println("Hit by snake!");
    return x;
}
static int ladder(int b)
{
    int y=b;
    if(y==4)
    y=16;
    else if(y==6)
    y=27;
    else if(y==21)
    y=42;
    else if(y==28)
    y=47;
    else if(y==48)
    y=71;
    else if(y==61)
    y=83;
    else if(y==65)
    y=75;
    else if(y==86)
    y=97;
    if(b!=y)
    System.out.println("Up by ladder!");
    return y;
}
static boolean isladder(int d)
{
    if((d==4)||(d==6)||(d==21)||(d==28)||(d==48)||(d==61)||(d==65)||(d==86))
    return true;
    else 
    return false;
}

}