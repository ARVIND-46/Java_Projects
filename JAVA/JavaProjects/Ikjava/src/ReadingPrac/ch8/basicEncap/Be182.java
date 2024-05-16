package ReadingPrac.ch8.basicEncap;

//public class Be182 {

//    * package ch8;

    class Adult{
        private String name;
        private int age;

        Adult(String name, int age) {
            setAge(age);
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            if(isAgeOk(age)){
                this.age = age;
            }else{
                this.age = -1; // error state
            }
        }
        private boolean isAgeOk(int age){ // private
            return age >= 18 ? true :false ; // ternary operator
        }
    }

    public class Be182 {
        public static void main(String[] args) {
            Adult john = new Adult("John", 20);
            System.out.println(john.getName() + " "
                    + john.getAge());   // John 20
            //john.age = -99; // 'age' is private
            john.setAge(-99); // uh-oh!
            System.out.println(john.getName() + " "
                    + john.getAge());   // John -99
        }
    }

