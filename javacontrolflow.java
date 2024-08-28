import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<0)System.out.println("Neg");
        else System.out.println("pos");
        switch(a)
        {
            case 1:System.out.println("Sunday");break;
            case 2:System.out.println("Monday");break;
            case 3:System.out.println("Tuesday");break;
            case 4:System.out.println("Wednesday");break;
            case 5:System.out.println("Thursday");break;
            case 6:System.out.println("Friday");break;
            case 7:System.out.println("Saturday");break;
            default:System.out.println("None");
        }
        for(int i=0 ; i<=a ;i++)
        {
            System.out.print(i);
        }
         for(int i=a ; i>=0 ;i--)
        {
            System.out.println(i);
        }
        int i = 0;
        while(i<a)
        {
            if(i==4) break;
            System.out.print(i);
            i++;
        }
    }
}