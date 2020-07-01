package exercise2;

public class Statically {
    //Once you have finished getting statistically.js to run, refactor the code here in Java.
    private String glue;
    String jello;

    public Statically(String g, String j) {
        this.glue = g;
        this.jello = j;
    }

    public String getGlue() {
        return glue;
    }
    public void moveAndShake() {
        System.out.println("Never stagnate in life.  Be agile, change, and improve...");
    }
    public void stubborn(){
        moveAndShake();
        System.out.println("Please don't make me change... I just don't like it...");
    }
    public void explain(){
        stubborn();
        System.out.println(getGlue());
        System.out.println("In Java, the static keyword is mainly used for memory management. It can be used with variables, methods, blocks and nested classes. It is a keyword which is used to share the same variable or method of a given class. Basically, static is used for a constant variable or a method that is same for every instance of a class.");
        System.out.println("In Javascript, the static keyword defines a static method for a class. Static methods aren't called on instances of the class. Instead, they're called on the class itself. These are often utility functions, such as functions to create or clone objects.");

    }

    public static void main(String[] args) {
        Statically stats = new Statically("Epoxy", "Jello");
        stats.moveAndShake();
        stats.stubborn();
        stats.explain();
        System.out.println(stats.jello);
    }
}
