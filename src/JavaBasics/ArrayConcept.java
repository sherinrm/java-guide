package JavaBasics;

public class ArrayConcept {

    public static void main(String[] args){

        //array : to store similiar data type values in a array variable
        // one dimentional array

        // dis advantages of array
        //1.

        //1. int arrray
        //lowest bound /index =0
        // upper bound/index = n-1 ,where n is hte size of the array.
        // only integers can be stored

        int i[] = new int[4];
        i[0] =10;
        i[1] = 20;
        // when location doest exit , array index out of bounds exception will be given
//System.out.println(i[4]);

        i[2] =30;
        i[3] =40;

        System.out.println(i[3]); System.out.println(i.length);//size / lenght of the array
        // for printing all values of the array ,use loops

        for(int j=0;j<i.length;j++){
            System.out.println(i[j]);
        }
        //2. double
        double k[] = new double[5];
        k[0] = 10.21;
        k[1] = 11.43;

        System.out.println(k[1]);

        //3.  character array

        char c[] = new char[3];
        c[0] = '3';
        c[1] = 'a';

        //4.      boolean array

        boolean b[] = new boolean[2];
        b[0] = true;
        b[1] = false;

        //5.   string array

        String s[]= new String [3];
        s[0] = "Hello";
        s[1] = "World";
        s[2] = "learnig" ;

        System.out.println(s.length);






   }
}
