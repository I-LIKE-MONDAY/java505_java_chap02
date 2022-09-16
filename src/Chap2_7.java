import java.util.Scanner;

public class Chap2_7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("학점을 입력하세요 >> ");
        String grade = scan.next();

        switch (grade) {
            case "A":
            case "B":
                System.out.println("Excellent");
                break;

            case "C":
            case "D":
                System.out.println("Good");
                break;
            case "F":
                System.out.println("Bye");
                break;
        }



    }
}
