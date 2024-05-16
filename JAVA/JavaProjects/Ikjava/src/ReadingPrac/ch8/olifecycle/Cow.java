package ReadingPrac.ch8.olifecycle;

class Tag{}
public class Cow {
    Tag tag;
    String country;

    public static void main(String[] args) {
        Cow cow1 = new Cow();
        Cow cow2 = cow1;// reassignment
        cow2.tagAnimal(cow1); // "This" ref refers to the obj instance resp for method call
    }
    void tagAnimal(Cow cow){
        tag = new Tag();   //Creates a new tag object(this.tag in effect)
        cow.setCountry("France");
    }
    void setCountry(String country){
        this.country = country;
    }
}
