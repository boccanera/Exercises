package classesObjectMethods;

public class ex6MethodWithoutInstance {

    public static void mySpecialMethod() {
        System.out.println("My special method needs no class instance to run.");
    }

    public static void main(String[] args) {
        // No need to call "new Exercise6().mySpecialMethod()"
        ex6MethodWithoutInstance.mySpecialMethod();
    }

}
