import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Person{
    public String name;
    public Person(String tmp){
        name = tmp;
    }

}
public class test1 {


    public static void swap(Person p1,Person p2){
        System.out.println("in swap: " + p1.name);
        p1.name = "xxx";

    }
    public static void main(String[] args){

        ArrayList<Integer> as = new ArrayList<>();
        as.add(5);
        as.add(1);
        as.add(4);
        as.add(3);
        as.add(2);
        System.out.println(as);

        Collections.sort(as, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(as);


//        Person xz = new Person("xiaozhang");
//        Person xm = new Person("xiaoming");
//        System.out.println("in main: " + xz.name);
//        swap(xz,xm);
//        System.out.println("in main: " + xz.name);
    }
}