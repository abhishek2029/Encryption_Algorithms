import java.util.*;
class CaesarCipher{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your PlainText: ");
        String message = scan.next();
        int length = message.length();
        System.out.print("Enter the Key: ");
        int key = scan.nextInt();

        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String special = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";
        String numbers = "0123456789";
        System.out.print("The encrypted Text is: ");
        for(int i = 0 ;i < length ;i++)
        {
            for(int j = 0; j < 26 ;j++)
            {
                if(j < special.length() && message.charAt(i) == special.charAt(j))
                {
                    System.out.print(special.charAt(j)); //print special charecters as it is
                }
                else if(j < numbers.length() && message.charAt(i) == numbers.charAt(j))
                {
                    System.out.print(numbers.charAt(j)); //print numbers as it is
                }
                else if(message.charAt(i) == lowercase.charAt(j))
                {
                    System.out.print(lowercase.charAt((j + key) % 26));
                }
                else if(message.charAt(i) == uppercase.charAt(j))
                {
                    System.out.print(uppercase.charAt((j + key) % 26));
                }
            }
        }
        System.out.println();
    }
}
