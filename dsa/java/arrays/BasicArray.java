public class BasicArray {
    public static void main(String args[]) {
        // array created
        int[] arr = {2,5,7,9,8,4};

        // print all elements
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        // find maximum element
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
        if(arr[i] > max) {
            max = arr[i];
        }
    }
    System.out.println("max = "+max);
    
    System.out.println("reverse array");
    // reverse array
    for(int i = arr.length-1; i >= 0; i--) {
        System.out.print(arr[i]+" ");
    }
    
    System.out.println("");
    // count even number  
    int count = 0;  
    for(int i = 0 ; i < arr.length; i++) {
        if(arr[i]%2 == 0) {
            count++;
        }
    }
    System.out.println("even numbers in array = "+count);
    }
}
