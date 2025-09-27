
import java.util.*;
public class Person {
    static class person implements Comparable<person>{
        String name;
        int height;
        int age;

        person(String name,int height, int age) {
            this.height = height;
            this.name=name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "{name=" + name + ", height=" + height + ", age=" + age + "}";
        }

        
        // public int compareTo(person o) {
        //     if(this.height < o.height) return 1;
        //     else if(this.height > o.height) return -1;
        //     return 0;
        // }

        
        public int compareTo(person o) {
            if (this.age != o.age)
                return this.age - o.age;          // sort by age
            if (this.height != o.height)
                return this.height - o.height;    // then by height
            return this.name.compareTo(o.name);   // then by name
        }
    }

    public static void main(String[] args) {
        List<person> people = new ArrayList<>();
        people.add(new person("a",105, 25));
        people.add(new person("b",160, 20));
        people.add(new person("c",180, 20));
        people.add(new person("d",105, 25));

        System.out.println("Before sorting:");
        System.out.println(people);

        // Sort by age
        // people.sort(Comparator.comparingInt(p -> p.age));
        // people.sort((p1, p2) -> p1.age - p2.age);
        // Collections.sort(people);

        // Sort: age > height > name
        // people.sort(
        //     Comparator.comparingInt((person p) -> p.age)
        //               .thenComparingInt(p -> p.height)
        //               .thenComparing(p -> p.name)
        // );

        // Collections.sort(people);
        Collections.sort(people, (p1, p2) -> {
            if (p1.age != p2.age)
                return p1.age - p2.age;
            if (p1.height != p2.height)
                return p1.height - p2.height;
            return p1.name.compareTo(p2.name);
        });



        System.out.println("\nAfter sorting by age:");
        System.out.println(people);
    }
}
