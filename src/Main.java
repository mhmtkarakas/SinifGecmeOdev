import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.print("Turkce notunuz : ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("Muzik notunuz : ");
        muzik = input.nextInt();

        double average = (mat+fizik+turkce+kimya+muzik)/5;
        if(average<55){
            System.out.print("Maalesef sinifta kaldiniz ");
        }else{
            System.out.print("Tebrikler gectiniz ");
        }
        System.out.print("Ortalamaniz : " + average);
    }
}