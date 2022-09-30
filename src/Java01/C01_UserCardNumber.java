package Java01;

import java.util.Scanner;

public class C01_UserCardNumber {
    public static void main(String[] args) {

        /*
         * Ask User Name, Surname and credit card numbers than convert it to special form
         *
         * (Check credit card number, if there aren't 16 digit print
         * "Invalid credit card number"
         *
         * Input : John White 1234234534561478
         * Output : Name : J*** W****
         *          CCN  : **** **** **** 1478
                     ExpD: 02/10 ,  CCV: **3
         *  (Initials for name and surname should be uppercase)
         *
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter your credit number : ");
        String cardNumber=scan.nextLine();
        if (!(cardNumber.length() == 16)){
            System.out.println("invalid card number");

        }else {
            System.out.print("Please enter your name : ");
            String name = scan.nextLine();
            System.out.println("Please enter your surname");
            String surname = scan.nextLine();
            System.out.println("Please enter your Expd. Like this 02/10 : ");
            String expd = scan.nextLine();
            if ((expd.charAt(0)>='a' && expd.charAt(0)<='z') || (expd.charAt(1)>='a' && expd.charAt(1)<='z') ||
                    (expd.charAt(3)>='a' && expd.charAt(3)<='z') || (expd.charAt(4)>='a' && expd.charAt(4)<='z')) {
                System.out.println("Please Check Your expd,Your expd must contains only number");
            } else if ((expd.charAt(0)>='A' && expd.charAt(0)<='Z') || (expd.charAt(1)>='A' && expd.charAt(1)<='Z') ||
                    (expd.charAt(3)>='A' && expd.charAt(3)<='Z') || (expd.charAt(4)>='A' && expd.charAt(4)<='Z')) {
                System.out.println("Please Check Your expd, Your expd must contains only number");
            } else {

                System.out.println("Please enter your CvC code : ");
                String CvcCODE = scan.next();
                if ((CvcCODE.charAt(0)>='a' && CvcCODE.charAt(0)<='z') || (CvcCODE.charAt(1)>='a' && CvcCODE.charAt(1)<='z')
                        && (CvcCODE.charAt(2)>='a' || CvcCODE.charAt(2)<='z'))
                {
                    System.out.println("Please Check your CvC Code,Your CvC code must contains only number");
                } else if ((CvcCODE.charAt(0)>='A' && CvcCODE.charAt(0)<='Z') || (CvcCODE.charAt(1)>='A' && CvcCODE.charAt(1)<='Z')
                        && (CvcCODE.charAt(2)>='A' || CvcCODE.charAt(2)<='Z')) {
                    System.out.println("Please Check your CvC Code,Your CvC code must contains only number");


                } else {


                    String newcardNumber = cardNumber.substring(0, 4).replaceAll("\\d", "*") + " " +
                            cardNumber.substring(4, 8).replaceAll("\\d", "*") + " " + cardNumber.substring(8, 12).
                            replaceAll("\\d", "*") + " " +
                            cardNumber.substring(cardNumber.length() - 4);


                    String newNameSur = name.substring(0, 1).toUpperCase() +
                            name.substring(1).replaceAll("\\w", "*") + " " +
                            surname.substring(0, 1).toUpperCase() +
                            surname.substring(1).replaceAll("\\w", "*");

                    String newCVC = CvcCODE.substring(0, 2).replaceAll("\\d", "*") +
                            CvcCODE.substring(CvcCODE.length() - 1);

                    System.out.println(newcardNumber + "\n" + newNameSur + "\n" + expd + "\n" + newCVC);

                }
            }
        }

    }
}
