import java.util.ArrayList;

public class DemoGeneric {
    //    Dùng generic:
    private static ArrayList<Integer> number = new ArrayList<>();
    private static ArrayList<Number> number1 = new ArrayList<>();

    //   Không dùng generic:
    private static ArrayList noneGeneric = new ArrayList<>();

    public static void main(String[] args) {
        int total = 0;
//        Ko ép kiểu:
//        noneGeneric.add(123);
//        noneGeneric.add('C');
//        noneGeneric.add("DucAnhdz");
//        for (int i = 0; i < noneGeneric.size(); i++) {
//            total +=(int)noneGeneric.get(i);
//        }                           //        => Lỗi lúc biên dịch vì không thể ép kiểu char, String sang int

//        Có ép kiểu:
        number.add(69);
        number.add(28);
        number.add(30);
//        Báo lỗi ngay nếu sai KDL
//        number.add("Exemple");

        for (int i = 0; i < number.size(); i++) {
            total += number.get(i);
        }

//
        System.out.println("Total = " + total);


        number1.add(2.3);
        number1.add(6.7);
        number1.add(891);
//        for (int i = 0; i < number1.size(); i++) {
//            System.out.println(number1.get(i));
//        }
    }
}
