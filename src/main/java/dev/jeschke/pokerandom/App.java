package dev.jeschke.pokerandom;


/**
 * Hello world!
 */
public class App {

    public static void main( final String[] args ) {
        final MyObject build = MyObject.builder()
                .nonNullString( "" )
                .myString( "" )
                .build();
        final String nonNullString = build.getNonNullString();
        System.out.println( nonNullString.toLowerCase() );
        System.out.println( build.getMyString().toLowerCase() );
    }
}
