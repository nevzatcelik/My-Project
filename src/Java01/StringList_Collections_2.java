package Java01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
    public class StringList_Collections_2 {
        static int numberStudents;
        static int totalScores;
        static int score;
        public static void main(String[] args) {
    /*
    Soru : Bir ogretmenden ogrencilerin notlarini girmesini isteyin, not girme islemi bittiginde Q’ya basmalidir.
    Not grime islemi bittikten sonra asagidaki sekilde output hazirlayin
        not ortalamasi : …..
        ogrenci sayisi : …..
        ortalama altindaki ogrenci sayisi : ….
        ortalamanin 10 puan alt ve ustunde olan ogrenci sayisi : …
     */
            List<Integer> intList = new LinkedList<>();
            intList = makeList();
            System.out.println("String List is :" + intList);
            double scoresAverage;
            scoresAverage= (double) totalScores/numberStudents;
            System.out.println("Notlarin toplami : " + totalScores);
            System.out.println("Not ortalamasi : " + scoresAverage);
            System.out.println("Ogrenci sayisi : " + numberStudents);
            List<Integer> studentsUnderAverage= new LinkedList<>();
            for (Integer each: intList
            ) {
                if (each < (scoresAverage-10))
                    studentsUnderAverage.add(each);
            }
            List<Integer> studentsAboveAverage= new LinkedList<>();
            for (Integer each: intList
            ) {
                if (each > (scoresAverage+10))
                    studentsAboveAverage.add(each);
            }
            System.out.println("Number of students 10 points under the average " + studentsUnderAverage.size());
            System.out.println("Number of students 10 points above the average " + studentsAboveAverage.size());
        }
        public static List<Integer> makeList() {
            List<Integer> madeList1 = new LinkedList<>();
            Scanner scan = new Scanner(System.in);
            while (score!=1) { // ==>   !(score+"").equals("Q")
                System.out.println("Please enter the scores of the students as positive integer numbers" +
                        "\nFor finishing enter Q");
                score = scan.nextInt();
                if (score!=1) {
                    madeList1.add(score);
                    numberStudents++;
                    totalScores= totalScores + score;
                } else {
                    System.out.println("Q'ya bastiniz, liste tamamlandi");
                }
            }
            return madeList1;
        }
    }

