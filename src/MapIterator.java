import java.util.HashMap;
import java.util.Map;

public class MapIterator {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.forEach((k,v)-> System.out.println(k+" "+v+" "));

    }
}
