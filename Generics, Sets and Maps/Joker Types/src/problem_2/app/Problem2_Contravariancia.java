//package problem_2.app;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Problem2_Contravariancia {
//    public static void main(String[] args) {
//        List<Object> myObjs = new ArrayList<Object>();
//        myObjs.add("Maria");
//        myObjs.add("Alex");
//        List<? super Number> myNums = myObjs;
//        myNums.add(10);
//        myNums.add(3.14);
//        Number x = myNums.get(0); // erro de compilacao
//    }
//}
