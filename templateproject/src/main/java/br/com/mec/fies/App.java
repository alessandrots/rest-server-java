package br.com.mec.fies;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String cpf = "519.641.497-54";
        //String alphaOnly = cpf.replaceAll("[^\\w\\s\\-_]","");
        String numbersOnly = cpf.replaceAll("[^\\w\\s]","");
        System.out.println("alphaOnly = "+ numbersOnly);
        
    }
}
