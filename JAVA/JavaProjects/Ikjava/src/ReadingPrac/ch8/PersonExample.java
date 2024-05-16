//package ReadingPrac.ch8;
//
//class Person{
//    private String name;    // instance variable
////    private  int count;      // NON static instance variable
//    private static int count;      // Pg no 168 Making static to get the correct count..
//
//    Person(String aName) { // constructor
//        name = aName;
//        Person.count++;
//    }
//    public String getName() { // instance method
//        return name;
//    }
//    public void setName(String aName) { // instance method
//        name = aName;
//    }
//    public static int getCount() { // instance method
//        return count;
//    }
//}
////Pg 168
//public class PersonExample {
//    public static void main(String[] args) {
//        Person p1 = new Person("Maaike");
//        Person p2 = new Person("Sean");
//       /*Post making count static
//       Below have added 2 more instances.. the count should be 4 now ..
//       * if i have understood*/
//        Person p3 = new Person("Bablya");
//        Person p4 = new Person("Satya");
//        System.out.println(p1.getName()); // Maaike
//        System.out.println(p2.getName()); // Sean
//        System.out.println(p3.getName()); // Sean
//        System.out.println(p4.getName()); // Sean
//        System.out.println("p1's count "+p1.getCount()); // getting the count
//        System.out.println("p2's count "+p2.getCount()); // getting the count
//        p1.setName("Maaike van Putten");
//        p2.setName("Sean Kennedy");
//        System.out.println(p1.getName()); // Maaike van Putten
//        System.out.println(p2.getName()); // Sean Kennedy
//        System.out.println("p1's count twice "+Person.getCount());// Pg 169-instance method can call static
//        System.out.println("p2's count twice "+Person.getCount()); // getting the count
//        //Not expected..
//    }
//}
//
////Below code just has the access with the instance member more..
//
////public class PersonExample {
////    public static void main(String[] args) {
////        Person p1 = new Person("Maaike");
////        Person p2 = new Person("Sean");
////       /*Post making count static
////       Below have added 2 more instances.. the count should be 4 now ..
////       * if i have understood*/
////        Person p3 = new Person("Bablya");
////        Person p4 = new Person("Satya");
////        System.out.println(p1.getName()); // Maaike
////        System.out.println(p2.getName()); // Sean
////        System.out.println(p3.getName()); // Sean
////        System.out.println(p4.getName()); // Sean
////        System.out.println("p1's count "+p1.getCount()); // getting the count
////        System.out.println("p2's count "+p2.getCount()); // getting the count
////        p1.setName("Maaike van Putten");
////        p2.setName("Sean Kennedy");
////        System.out.println(p1.getName()); // Maaike van Putten
////        System.out.println(p2.getName()); // Sean Kennedy
////        System.out.println("p1's count twice "+p1.getCount()); // getting the count
////        System.out.println("p2's count twice "+p2.getCount()); // getting the count
////        //Not expected..
////    }
////}
