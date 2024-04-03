public class javaArithmetic {
    public static void main (String[] args) {
/*
        //order of operations
       double grade1 = 3.5;
       double grade2 = 5.4;
       double grade3 = 9.9;

       double gradeAverage = (grade1+grade2+grade3)/3;
       System.out.println("The grade average is: " + gradeAverage);
*/

       //increment and decrement, i++ and i--;
        int i = 5;
        System.out.println("Old i value: " + i);
        System.out.println("New i value: " + i++);
        System.out.println("New i value: " + ++i);

        //1. print i (5)
        //2. print i then add one (print: 5, then 6)
        //3. add one then print i (7)

        int j = 5;
        j+=6;
        System.out.println("New j value: " + j);

        //performs arithmetic then reassigns variable value;
    }
}
