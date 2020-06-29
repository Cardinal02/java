package exercise2;

import java.util.ArrayList;
import java.util.List;

public class Colors {

     void colorful(String[] strings) {
         //System.out.println(strings);
         List<String> string1 = new ArrayList<>();
        // System.out.println(string1);
         //System.out.println(string1.size());
        
      for(int i=0;i< strings.length;i++){
          String temp = strings[i];
          System.out.println(temp);
          if(temp.contains("blue")){
              string1.add(temp);
          }else if (temp.contains("red")){
              string1.add(temp);
          }else if (temp.contains("yellow")){
              string1.add(temp);
          }else if (temp.contains("black")){
              string1.add(temp);
          }else if (temp.contains("green")){
              string1.add(temp);
          }else if (temp.contains("pink")){
              string1.add(temp);
          }


      }
         System.out.println(string1);

         // For the given strings, keep all the strings that begin with a color ("red", "yellow", "green", "blue", etc.) return an array of strings that start with a color.  discard all the other strings.  If no strings start with a color in the input array, return an empty array.

    }

    public static void main(String[] args) {
        Colors code = new Colors();
        code.colorful(new String[]{"bluebird","red herring", "yellow bumblebee","black spider", "green monkey","pink","great gatsby","feeding frenzy","black bird","widowmaker","quran","bible","torah"});
        System.out.println("This is the Colors class");
    }


}