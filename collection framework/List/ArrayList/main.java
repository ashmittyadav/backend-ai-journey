// create ArrayList

package ArrayList;

import java.util.ArrayList;

public class main{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 20; i < 30; i++) {
            list.add(i);
        }
        System.out.println(list.get(4)); 
        System.out.println(list);  
        
        // size 
        System.out.println(list.size()); 

        // insert in ArrayList
        list.add(4,18);
        System.out.println(list.get(4)); 
        System.out.println(list); 
        System.out.println(list.size()); 
        
        
        // get elements
        list.get(3);
        
        // set elements
        list.set(4,16);
        System.out.println(list); 
        // remove

        
        }
    }