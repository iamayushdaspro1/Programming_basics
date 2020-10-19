import java.util.*;

public class HelloWorldArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello World!");

        for(String word:list)
            System.out.println(word)
    }
}