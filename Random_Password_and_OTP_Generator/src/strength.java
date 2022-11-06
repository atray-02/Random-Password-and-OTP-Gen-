public class strength {
    public static String stren(String str){
        int upChar = 0, lowChar = 0, digit = 0, special = 0;

        for(int i=0;i<str.length();i++){
            char x = str.charAt(i);
            if(Character.isDigit(x))
                digit = 1;
            else if(Character.isLowerCase(x))
                lowChar = 1;
            else if(Character.isUpperCase(x))
                upChar = 1;
            else
                special = 1;
        }
        if(digit == 1 && lowChar == 1 && upChar == 1 && special == 1 )
            return "Password Strength : Strong";
        else
            return "Password Strength : Weak";
    }
    public static void main(String[] args) {

    }
}
