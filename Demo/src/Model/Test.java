package Model;

public class Test<T, U> {
    T obj1; // An object of type T

    U obj2; // An object of type U

    public Test(T obj1, U obj2) {

        this.obj1 = obj1;

        this.obj2 = obj2;

    }
    // To print objects of T and U

    public void getObject() {
        System.out.println("String value: " + obj1);
        System.out.println("Integer value: " + obj2);
    }
}
