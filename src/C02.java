import java.util.Random;
import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        Random random=new Random();

        int userChoose=0;
        int compChoose=0;
        int userPoint=0;
        int comPoint=0;

        do {
            System.out.println("Lutfen bir secim yapiniz\n"+
                    "1-Tas\n"+
                    "2-kagit\n"+
                    "3-makas");
            userChoose=scan.nextInt();
            compChoose= random.nextInt(3);

            if (userChoose==1 && compChoose==2){
                System.out.println("Kagit tasi sarar --> Bilgisayar +1");
                comPoint++;

            } else if(userChoose==1 && compChoose==3){
                System.out.println("Tas makasi kirar --> user+1");
                userPoint++;
                System.out.println("User= "+ userPoint+" vs. Computer =" + comPoint );


            }else if (userChoose==2 && compChoose==1) {
                System.out.println("Kagit tasi sarar");
                userPoint++;
                System.out.println("User= "+ userPoint+" vs. Computer =" + comPoint );



            }else if (userChoose==2 && compChoose==3){
                System.out.println("makas kagidi keser");
                comPoint++;
                System.out.println("User= "+ userPoint+" vs. Computer =" + comPoint );


            }else if (userChoose==3 && compChoose==1){
                System.out.println("Tas makasi kirar --> computer+1");
                comPoint++;
                System.out.println("User= "+ userPoint+" vs. Computer =" + comPoint );

            }else if (userChoose==3 && compChoose==2) {
                System.out.println("Makas kagidi keser --> User +1" );
                userPoint++;
                System.out.println("User= "+ userPoint+" vs. Computer =" + comPoint );

            }else {
                System.out.println("Berabere");
                System.out.println("User= "+ userPoint+" vs. Computer =" + comPoint );

            }


        } while (userPoint!=5 && comPoint!=5);{
            if (userPoint>comPoint) {
                System.out.println("User kazandi");

            }else {
                System.out.println("Bilgisayar Kazandi");

            }
            scan.close();

        }

    }
}
