public class keys {
    public static String gen(){
        String num = "0123456789";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String specialChar = "!@#$%^&*()_-+=[]{};:',.<>/?";

        String combination = num + upperCase + lowerCase + specialChar;
        return combination;
    }
    public static void main(String[] args) {

    }
}
