// The actual code for creating an Array to hold DVD's.
// DVD[] dvdCollection = new DVD[15];

// A simple definition for a DVD.

import java.util.ArrayList;

public class DVD {
    public static void main(String[] args) {
        
        public String name;
        public int releaseYear;
        public String director;
        DVD(name,releaseYear,director);
    }
        public static void DVD(String name, int releaseYear, String director) {
            List<String> str = new ArrayList<>()
            this.name = name;
            this.releaseYear = releaseYear;
            this.director = director;
        }
        
        public String toString() {
            return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
        }
}