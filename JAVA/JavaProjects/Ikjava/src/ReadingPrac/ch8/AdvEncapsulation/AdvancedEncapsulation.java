package ReadingPrac.ch8.AdvEncapsulation;



class Seniors {
    private int[] ages = new int[2];
    private int num;

    Seniors(){
        num = 2;
        ages[0] = 30;
        ages[1] = 40;
    }
    public int getNum() { return num;}
    public int[] getAges() { // breaks encapsulation
        return ages;
    }
}
public class AdvancedEncapsulation {
    public static void main(String[] args) {
        Seniors1 seniors = new Seniors1();
        // 1. Returning primitives is okay.
        int num = seniors.getNum();
        System.out.println(num); // 2
        num = -100;
        num = seniors.getNum();
        System.out.println(num); // 2, ok, primitives are encapsulated once 'private'

        // 2. Returning references requires care.
        int[] copyAges = seniors.getAges(); // 'copyAges' and 'ages' refer to the same array object!
        System.out.println(copyAges[0] + ", " + copyAges[1]);// 30, 40
        // As we have a copy of the internal array reference, we can, from HERE
        // change the "private" internal Seniors array! This breaks encapsulation.
        copyAges[0] = -9;
        copyAges[1] = -19;
        int[] copyAges2 = seniors.getAges();
        System.out.println(copyAges2[0] + ", " + copyAges2[1]);// -9, -19
    }
}