import java.util.ArrayList;

public class main{
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(5);
            list.add(20);
            // System.out.println(list.get(2));
            // System.out.println(list.size());
            // for(int i = 0 ; i < list.size(); i++) {
            //     System.out.println(list.get(i));
            // }
            // for(int x: list){
            //     System.out.println(x);
            // }
            // System.out.println(list.contains(5));
            // System.out.println(list.contains(50));
            // list.remove(2);
            System.out.println(list);
            list.add(2,15);
            System.out.println(list);
            list.set(2,15);
            System.out.println(list);
        }
}
