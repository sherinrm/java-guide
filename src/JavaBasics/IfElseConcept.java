package JavaBasics;

public class IfElseConcept {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        if(a>b) {
            System.out.println("a is greater than b");
        }else
            System.out.println("b is greater than a");

    // comparison operators
        // < > <= >= ==
        //  = is the assignment operator and  ==  is the comparison operator

        int c =40;
        int d =40;
        if (c==d)
        {
            System.out.println("c and d is equal");
        }


        //Write a logic to find the highest number
        int a1 =500;
        int b1 =700;
        int c1 =300;

        //nested if else

        if (a1>b1 & a1>c1) //true & true = true
        {
            System.out.println("a1 is the highest number");
                            }
        else if(b1>c1)
        {
            System.out.println("b1 is the greatest number");
        }
        else
        {
            System.out.println("c1 is the greatest number");
        }

    }
}
