import java.util.Random;
import java.util.Scanner;

public class pilot {

    public static void main(String[] args) {

        while(true){
            System.out.println("What you want to generate.");
            System.out.println("Press 1 for Password");
            System.out.println("Press 2 for OTP");
            System.out.println("Press 3 to exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();


            if(choice == 1){
                System.out.println("Welcome to Random Password Generator(RPG)! ");
                Random rand = new Random();

                System.out.print("Length of the password should be : ");
                int len = sc.nextInt();
                char [] pass = new char[len];
                //using gen() method of keys class
                //to provide combination of character,digits
                // and special keys into String comb.
                String comb = keys.gen();

                for(int i=0;i<len;i++){
                    pass[i] = comb.charAt(rand.nextInt(comb.length()));
                }
                //character array to String.
                String str = new String(pass);
                System.out.println("Generated password : " + str);
                String result = strength.stren(str);
                System.out.println(result);
            }

            else if(choice == 2){
                System.out.println("Welcome to Random OTP Generator(ROG)! ");
                Random rand = new Random();
                System.out.print("Length of the OTP should be : ");
                int len = sc.nextInt();
                char [] pass = new char[len];
                String num = "0123456789";
                for(int i=0;i<len;i++){
                    pass[i] = num.charAt(rand.nextInt(num.length()));
                }
                String str = new String(pass);
                System.out.println("Generated OTP : " + str);
            }
            else if(choice == 3){
                break;
            }
            System.out.println("**************************");
            System.out.println("Thank you for using.");
            System.out.println("**************************");
        }


    }
}
