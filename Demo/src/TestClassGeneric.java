import Model.MyGenClass;
import Model.Test;

public class TestClassGeneric {
    public static void main(String[] args) {
        Test<String,Integer> obj = new Test<String,Integer>("DA",22);
//        Test<String,Integer> obj1 = new Test<String,Integer>("DA","22");
        obj.getObject();

        MyGenClass<String> Yolo = new MyGenClass<String>("DucAnh");
//        MyGenClass<String> Yolo1 = new MyGenClass<String>(22);
    }
}
