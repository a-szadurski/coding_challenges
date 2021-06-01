package simple_adding;

import java.util.Scanner;

class Main {

    public static int SimpleAdding(int num) {
        // code goes here
        if(num>0){
            return num + SimpleAdding(num-1);
        }
        return 0;
    }

    public static void main (String[] args) {
        // keep this function call here
//        Scanner s = new Scanner(System.in);
        System.out.print(SimpleAdding(31));
    }

}
