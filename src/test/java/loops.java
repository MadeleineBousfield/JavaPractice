public class loops {
    public static void main (String [] args){

        //FOR LOOPS
        int count = 10;
        for (int i = 0; i<=count; i++)
        {
            System.out.println(count-i);
        }

        //WHILE LOOPS
        int a = 1;
        while (a <=10){
            System.out.println(a);
            a++;
        }

        //DO WHILE LOOPS
        int b = 3;
        do {
            System.out.println("The value of b is: " + b);
            b++;
        }while(b <=10);
        
    }
}
