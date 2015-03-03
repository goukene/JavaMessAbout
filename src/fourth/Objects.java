package fourth;

public class Objects {
    public static void main(String[] args) {

        //Basics of object instantiation
    // type name       constructor
        Cat tabby = new Cat("SHORT", "tabby", 99);
        Cat moggy = new Cat("LONG", "moggy" ,101);


        Cat anotherCat = new Cat();
        anotherCat.setName("someName");

        System.out.println(anotherCat.getName());

        System.out.println(tabby);


      //  System.out.println(x); same as System.out.println(x.toString());
    }
}
