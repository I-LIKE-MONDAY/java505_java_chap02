import java.util.Scanner;

public class Chap2_challenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요. ");

        System.out.println("철수 >>");
        String game1 = scan.next();

        System.out.println("영희 >>");
        String game2 = scan.next();

        if ((game1.equals("가위")) && (game2.equals("바위"))) {
            System.out.println("철수가 이겼습니다.");
        } else {
            System.out.println("영희가 이겼습니다.");
        }
    }
}
