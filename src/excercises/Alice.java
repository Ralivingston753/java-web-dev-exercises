package excercises;

import java.util.Scanner;

public class Alice {
    public static void main( String[] args){
    String paragraph;
    String searchWord;
    String paragraph2;
    Scanner input;


    paragraph =( "Alice was beginning to get very tired of" +
            " sitting by her sister on the bank, and of having" +
            " nothing to do: once or twice she had peeped into the" +
            " book her sister was reading, but it had no pictures or " +
            "conversations in it, 'and what is the use of a book,'" +
            " thought Alice 'without pictures or conversation?'");

    paragraph = paragraph.toLowerCase();

    input = new Scanner(System.in);
    System.out.println("enter in search word: ");
    searchWord = input.nextLine();
    searchWord = searchWord.toLowerCase();


    System.out.println(paragraph.contains(searchWord));
    System.out.println(paragraph.indexOf(searchWord));
        System.out.println(searchWord.length());

        paragraph2 = paragraph.replaceAll(searchWord,"");
        System.out.println(paragraph2);
}
}
