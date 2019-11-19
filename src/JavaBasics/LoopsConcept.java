package JavaBasics;

public class LoopsConcept {
    public static void main(String [] args){

        // 1. While loop
        //disadvantage of while loop :It will generate infinite loop if you are not giving incre,emtal or decremental part

        int i =1; //initialization
        while(i<10) // conditional
        {
            System.out.println(i);
            i=i+1; // incremental part
        }

        //2. For loop

        for (int k=1;k<=10;k++){ //initialization,conditional part and incremental part
            System.out.println(k);
        }


    }

}
