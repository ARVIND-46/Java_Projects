package ReadingPrac.ch8.AdvEncapsulation;


import java.util.Arrays;
class Seniors1 {
    private int[] ages = new int[2];
    private int num;

    Seniors1(){
        num = 2;
        ages[0] = 30;
        ages[1] = 40;
    }
    public int getNum() { return num;}
    public int[] getAges() { // properly encapsulated
        int newArr[] =  Arrays.copyOf(ages,2);
        return newArr;
    }
}
public class FixedProperEncapsulation {
    public static void main(String[] args) {
        Seniors1 seniors = new Seniors1();

        int[] copyAges = seniors.getAges(); // 'copyAges' and 'ages' refer to 2 different arrays
        System.out.println(copyAges[0] + ", " + copyAges[1]);// 30, 40
        copyAges[0] = -9;
        copyAges[1] = -19;
        int[] copyAges2 = seniors.getAges();
        System.out.println(copyAges2[0] + ", " + copyAges2[1]);// 30, 40
    }
}


/* By making the above change(26 and 27)
 * we are changing new declared local reference of copyAges and seniors is properly encapsulated..
 *
 *
 * */