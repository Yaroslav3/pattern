package pattern.arrays.data;

import jdk.nashorn.internal.objects.annotations.Setter;
import pattern.arrays.data.sweets.Candy;
import pattern.arrays.data.sweets.CandyComparatot;
import pattern.arrays.data.sweets.Sweet;

import java.util.Arrays;

public class A {
    public static void main(String[] args) {

        Candy[] candies = {new Candy(Sweet.SweetType.CHOCOLATE, 5),
                new Candy(Sweet.SweetType.MARMALADE, 10),
                new Candy(Sweet.SweetType.JELLY, 5)};
        System.out.println(Arrays.toString(candies));

        Arrays.sort(candies);
        System.out.println(Arrays.toString(candies));
        Arrays.sort(candies, new CandyComparatot());
        System.out.println(Arrays.toString(candies));

//        A[] arraysOfA1 = new A[10];
//
//        arraysOfA1[0] = new A();
//
//        A[] arraysOfA2 = new A[10];
//        arraysOfA2[0] = arraysOfA1[0];
//
//        System.out.println(A.class);
//        System.out.println(arraysOfA1.getClass());
//
//
//        System.out.println(arraysOfA1 == arraysOfA2);
//        System.out.println(arraysOfA1 == arraysOfA2);
//        System.out.println(Arrays.deepEquals(arraysOfA1, arraysOfA2));
    }
}