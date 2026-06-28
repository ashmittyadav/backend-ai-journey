package stack;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        // stack creation
        Stack<Integer> st = new Stack<>();
        
        st.push(10);                // push elements
        st.push(13);
        st.push(34);
        st.push(7);
        st.push(4);
        System.out.println(st);
        
        System.out.println(st.size());          // size of stack
        
        
        System.out.println(st.peek());            // element on top
        
        
        st.pop();                            // pop last element
        
        
        System.out.println(st.isEmpty());                   // chack if stack is empty or not
        
        st.pop();
        st.pop();
        System.out.println(st.peek());                    
        System.out.println(st.isEmpty());                   
        st.pop();
        System.out.println(st.peek());                    
        System.out.println(st.isEmpty());                   
        st.pop();
        // System.out.println(st.peek());                  // if no element left stack is empty error will generate while execting this loc     
        System.out.println(st.isEmpty());                   

    }
}
