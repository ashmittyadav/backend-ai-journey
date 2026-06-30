import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(90);
        // list.add(23);
        // list.add(232);
        // list.add(14);
        // list.add(2433);
        // list.add(24);

        // System.out.println(list.contains(14));


        // list.set(0,99);
        
        for(int i = 0; i < 5;i++) {
            list.add(sc.nextInt());
        }
        for(int i = 0; i < 5;i++) {
            System.out.println(list.get(i));
        }

        // System.out.println(list);;

    }
}
