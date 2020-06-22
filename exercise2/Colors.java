package exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colors {

     void colorful(String[] strings) {
        Collection<String> strings1= new ArrayList<>();
        strings1= Arrays.asList(strings);
        System.out.println(strings1);
         System.out.println(strings1.size());
        
//        for(int i=0;i<strings1.size();i++){
//            System.out.println(strings1.get(i));
//        }
        // For the given strings, keep all the strings that begin with a color ("red", "yellow", "green", "blue", etc.) return an array of strings that start with a color.  discard all the other strings.  If no strings start with a color in the input array, return an empty array.

    }

    public static void main(String[] args) {
        Colors code = new Colors();
        code.colorful(new String[]{"bluebird","red herring", "yellow bumblebee","black spider", "green monkey","pink","great gatsby","feeding frenzy","black bird","widowmaker","quran","bible","torah"});
        System.out.println("This is the Colors class");
    }


}