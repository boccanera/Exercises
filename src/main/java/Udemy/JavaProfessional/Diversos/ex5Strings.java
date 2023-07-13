package Udemy.JavaProfessional.Diversos;

public class ex5Strings {

    public static void main(String[] args) {
        ex5Strings exercise5 = new ex5Strings();
        exercise5.myMultiInputMethod("one", "two", "three", "four");
        exercise5.myMultiInputMethod("apple", "orange", "pineapple");
        exercise5.myMultiInputMethod("Bobby");
    }

    /* A method that allows any number of Strings to be passed as parameter inputs without an array */
    private void myMultiInputMethod(String...args) {}

}
