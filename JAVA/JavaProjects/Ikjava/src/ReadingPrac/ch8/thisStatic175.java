package ReadingPrac.ch8;

public class thisStatic175 {
    int x;              // instance variable
    public void m(){}   // instance method
    public static void main(String[] args) {
        // Non-static field 'x' cannot be referenced
        // from a static context
//        x = 9;  // same as 'this.x = 9;'
//        this.x = 99;
//        m();    // same as 'this.m();'
//        this.m();

        // this works
        thisStatic175 pe = new thisStatic175();
        pe.x=999;   // ok
        pe.m();     // ok
        System.out.println(pe.x);   // 999
    }
}