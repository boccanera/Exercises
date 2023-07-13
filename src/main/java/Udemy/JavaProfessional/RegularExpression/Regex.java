package Udemy.JavaProfessional.RegularExpression;

public class Regex {
    public static void main(String[] args) {
        System.out.println("Cat".toLowerCase().matches("cat")); //its case sensitive
        System.out.println("Cat".matches("[cC]at")); // starting with 'c' or 'C', it will match.
        System.out.println("Cat".matches("[a-fA-F]at")); //ranges 'a' to 'f' and uppercase.
        System.out.println("Cat".matches("[^a-z]at")); //every character except lower case 'a' to 'z'.

        System.out.println("Cat".matches("\\wat")); // \\w is a shorthand of [a-zA-Z0-9_]
        System.out.println("Cat".matches("\\w{3}")); //all 3 character can use [a-zA-Z0-9_]
        System.out.println("2".matches("\\d")); //shorthand of [0-9]
        System.out.println("321-232-1234".matches("\\d{3}-\\d{3}-\\d{4}")); //shorthand of [0-9]
        System.out.println("321-232.1234".matches("\\d{3}[-.]\\d{3}[-.]\\d{4}")); // adding [-.] will match an '-' or '.' between the characters.
        System.out.println("321,232 1234".matches("\\d{3}[-.,\\s]\\d{3}[-.,\\s]\\d{4}")); //adding \\s to accept 1 space
        System.out.println("321  232 1234".matches("\\d{3}[-.,\\s]*\\d{3}[-.,\\s]*\\d{4}")); //adding * to accept zero or more of any characters inside the squarebracket.
        System.out.println("321  232 1234".matches("\\d{3}[-.,\\s]?\\d{3}[-.,\\s]?\\d{4}")); //adding ? to accept zero or one of any characters inside the squarebracket.
        System.out.println("321,232 1234".matches("\\d{3}[-.,\\s]\\d{3}[-.,\\s]+\\d{4}")); //adding + to accept one or more of any characters inside the squarebracket.
        System.out.println("321,232 1234".matches("\\d{3}[-.,\\s]\\d{3}[-.,\\s]+\\d{3,4}")); //adding 3 to 4 {3,4} digits in the final sequence.
        System.out.println("321,232 1234".matches("\\d{3}[-.,\\s]\\d{3}[-.,\\s]+\\d{3,4}")); //adding 3, {3,} it will be a minimum of 3 digits in the final sequence.
        System.out.println("321,232 1234".matches("(\\d{3}[-.,\\s]?){2}\\d{3,4}")); //only one "\\d{3}[-.,\s]" in parenthesis repeating twice with {2}
        System.out.println("1,232 1234".matches("(1[-.,\\s]?)?\\d{3}[-.,\\s]?\\d{3,4}")); //number starting with 1
    }
}
