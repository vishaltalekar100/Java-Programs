package basics;

public class VariableNaming {
    static char a;
    public static void main(String[] args) {
        // case-sensitive.
        // should start with small character.
        // can contain _, $, small, capital character's, numbers.
        // numbers cannot be starting character.
        // java reserved keywords cannot to variable names.
        // keep variable names meaningful.
        // use camel-case.

        String myFullName = "Vishal Talekar";
        System.out.println(myFullName);
        System.out.println("Default value of char: " + "'" + a + "'");
    }
}
