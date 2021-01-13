package ee.bcs.valiit.tasks;

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
//Integer.MAX_VALUE
//sum(new int[]{1,2,3,4,5,6});
//System.out.println factorial());
//int x [] = {9,8,7,6,5,4};

//sort(new int[]{1,2,3,4,5,6});
//System.out.println(sort(5)));
    }

    public static int sum(int[] x){
        // Todo liida kokku kõik numbrid massivis x
        //int someArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i=3; i<x.length; i++){
            sum += i;
            System.out.println(sum);
        }
        return 0;
    }

    public static int factorial(int x){
        // TODO tagasta x faktoriaal.
        // Näiteks
        // x = 5
        // return 5*4*3*2*1 = 120
        int multiple=x;
        for (int i=x-1; i>0;i--){
            multiple=multiple*(i);
        }
        return multiple;
    }

    public static int[] sort(int[] a) {
        // TODO sorteeri massiiv suuruse järgi.
        // TODO kasuta tsükleid, ära kasuta ühtegi olemasolevat sort funktsiooni

        int count = 0;
        for (int i= 1; i<a.length; i++){
            if (a[i]>a[i-1]){
                int vahepealne = a[i-1];
                a[i-1] = a[i];
                a[i]= vahepealne;
                i=0;
                count =0;
            }
            count ++;
            if (count == a.length){
                break;
            }
        }
        return a;
    }

    public static String reverseString(String a) {
        // TODO tagasta string tagurpidi
        return "";
    }

    public static boolean isPrime(int x){
        // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)
        return false;
    }
}
