package project;

/**
 * Hello world!
 *
 */
import java.util.Arrays;
public class App 
{
    private static int arr1 [] = {11,3,4,5,6,10,29,0};
    public static void main( String[] args )
    {
        Arrays.sort(arr1);
        for(int i=0; i<arr1.length;i++)
        {
            System.out.println( "Hello World!"+arr1[i]);
        }
    }
}
