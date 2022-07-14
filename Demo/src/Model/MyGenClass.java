package Model;

public class MyGenClass<String> {
    private String obj;

    public MyGenClass(){}

    public MyGenClass(String obj) {
        this.obj = obj;
    }

    public void add(String obj) {
        this.obj = obj;
    }
    public String getObj() {
        return obj;
    }
}
