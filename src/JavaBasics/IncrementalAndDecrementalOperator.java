package JavaBasics;

public class IncrementalAndDecrementalOperator {
    public static void main(String[] args){

        int i=1;
        int j=i++; //post increment - value of i is first assigned to j and then increment  value of i by 1
        System.out.println(j);
        System.out.println(i);

        int a =1;
        int b = ++a; //pre increment  - value of a is incrementd first and then assignd to b

        System.out.println(a);
        System.out.println(b);
        int c = 5;
        int k = c--; //post decrement
        System.out.println(c);
        System.out.println(k);

        System.out.println(c);
        int l = 1;
        int m = --l; //pre decrement

        System.out.println(l);
        System.out.println(m);


         }
}
