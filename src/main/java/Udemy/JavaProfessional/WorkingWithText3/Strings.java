package Udemy.JavaProfessional.WorkingWithText3;

public class Strings {

    public static void main(String[] args) {
        // the computer create one space in the memory
        String fruit = "apple";
        String anotherFruit = "apple";
        // the computer creates each instance in the memory
        String vegetable = new String("broccoli");
        String anotherVegetable = new String("broccoli");

        //CONTAINS METHOD.
        String myText = "four score";
        String contain = "Score";
        System.out.println(myText.toLowerCase().contains(contain.toLowerCase()));

        //STRIP - REMOVING WHITE SPACE
        String comander = "  optimusPrime          ";
        String comanderWithoutBlankSpace = comander.strip();
        System.out.println(comanderWithoutBlankSpace);

        //STRINGBUILDER AND BUFFER (OLDER - THREAD SAFETY).
        String builder = new StringBuilder(myText.length()).toString();

        //STRING FORMAT (CREATE SPACES BETWEEN THE STRING AND OTHERS).
        String finalString = String.format("%s", myText, comander);
        System.out.println(finalString);

        //SUBSTRING

        String myNewText = myText.substring(1);
        String myNewText1 = myText.substring(0, 3);
        System.out.println(myNewText);
        System.out.println(myNewText1);
        String firstPart = myText.substring(0, 1);
        String secondPart = myText.substring(1);
        String capitalFirstLetter = firstPart.toUpperCase();
        String wordWithFirstCapitalLetter = capitalFirstLetter.concat(secondPart);
        System.out.println(wordWithFirstCapitalLetter);


//        StringBuffer is older and thread safe, multiple threads area ble to interact with instances of
//        StringBuffer safety, but comes at the cost of performance and make it slow. For the majority of time you
//        dont need this kind of thread safety, so its comes the StringBuilder.

        //index of the beggining of a Word. //if the result is negative, it does not contain the word we are searching for.
        System.out.println(myText.indexOf("score"));
        System.out.println(myText.indexOf("s", 2));

        String phoneNumber = "(71) 3333-2222".strip();
        String areaCode = parseAreaCode(phoneNumber);
        String beforeHyphen = parseBeforeHyphen(phoneNumber);
        String afterHyphen = parseAfterHyphen(phoneNumber);

        //SPLIT - SEPARETE WORDS IN A PHRASE
        String text = """
                Smith, Fred, 1/1/90, 111 abc st. Apple, CA
                Mcguire, Jerry, 22/2/2022, def st., Orange, NV
                """;

        String[] people = text.split("\n");
        System.out.println(people.length);
        System.out.println(people[1]);
        String[] george = people[1].split(",");
        System.out.println(george[3]);

        //STARTS WITH / END WITH
        String fileName = "    file001.txt".strip();
        System.out.println(fileName.startsWith("file"));
        System.out.println(fileName.endsWith(".txt"));

        //CONTENTEQUALS
        String firstText = "Apple";
        String secondText = "Apple";
        boolean result = firstText.contentEquals(secondText);
        System.out.println(result);

        //INDEX OF / SUBSTRING
        System.out.println(areaCode);
        System.out.println(beforeHyphen);
        System.out.println(afterHyphen);
        String refinedPhoneNumber = new StringBuilder(areaCode.length() + beforeHyphen.length() + afterHyphen.length())
                .append(areaCode)
                .append(beforeHyphen)
                .append(afterHyphen)
                .toString();
        System.out.println(refinedPhoneNumber);
    }

    public static String parseAreaCode(String phoneNumber) {
        int openParentesis = phoneNumber.indexOf("(");
        int closeParentesis = phoneNumber.indexOf(")");
        String areaCode = phoneNumber.substring(openParentesis + 1, closeParentesis);
        return areaCode;
    }

    public static String parseBeforeHyphen(String phoneNumber) {
        int emptySpaceIndex = phoneNumber.indexOf(" ");
        int hyphenIndex = phoneNumber.indexOf("-");
        String beforeHyphen = phoneNumber.substring(emptySpaceIndex + 1, hyphenIndex);
        return beforeHyphen;
    }

    public static String parseAfterHyphen(String phoneNumber) {
        int hyphenIndex = phoneNumber.indexOf("-");
        String afterHyphen = phoneNumber.substring(hyphenIndex + 1);
        return afterHyphen;
    }


}
