public class Palindrome { //перебор массива
    public static void main( String[] args)
    {
        for(int i = 0; i < args.length; i++)
        {
            String s = args[i];
            System.out.println(s + " " + isPalindrome(s));
        }
    }
    public static String reverseString(String str) // делаем reverse строки
    {
        String r = "";
        for (int i = 0 ; i < str.length(); i++)
        {
            r += str.charAt(str.length()-i -1);
        }
        return r;
    }
    public static boolean isPalindrome (String s) // сравниваем исходную строку с reverse
    {
        if(s.equals(reverseString(s))){
            return true;
        }
        return false;
    }
}
