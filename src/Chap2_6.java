import java.util.Scanner;

public class Chap2_6 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        System.out.println("돈의 액수를 입력하세요 : ");
    int money = scan.nextInt();

//    87654원
    int money1 = money / 50000;             // 몫1 = 5만원권 1장
    int money2 = (money % 50000) / 10000;   // 나머지 37654 / 10000 = 1 -> 1만원권 3장
    int money3 = ((money % 50000) % 10000) / 1000 ;  // 나머지 37654 / 10000 나머지 : 7654 = 5 -> 천원권 7장
    int money4 = (((money % 50000) % 10000) % 1000) / 500;
    int money5 = ((((money % 50000) % 10000) % 1000) % 500) / 100;
    int money6 = (((((money % 50000) % 10000) % 1000) % 500) % 100) / 10;
    int money7 = ((((((money % 50000) % 10000) % 1000) % 500) % 100) % 10);


        System.out.println("오만원" + money1 + "개, 만원" + money2 + "개, 천원"
                + money3 + "개, 500원" + money4 + "개, 100원" + money5 + "개, 10원" + money6 + "개, 1원" + money7 + "개");
//        System.out.println("오만원 {money1}");



//        풀이

        System.out.println("돈의 액수를 입력하세요 : ");
        int m = scan.nextInt();
//        원금 / 50000 해서 5만원권의 수 확인
        int m50000 = money / 50000;
//        5만원권을 뺀 15,245원을 변수 m에 저장
        m = m % 50000;
        int m10000 = m / 10000; // 1만원권의 수를 확인하기 위해서 10000으로 나눔
        m = m % 10000;          // 1만원권을 제외한 금액을 저장하기 위해서 10000으로 나머지 연산
        int m1000 = m / 1000;   // 5,245에서 1천원권의 수를 확인하기 위해서 1000으로 나눔
        m = m % 1000;           // 5000을 뺀 나머지 금액을 계산하기 위해서 나머지 연산
        int m500 = m / 500;     // 245에서 500원 동전의 수를 확인하기 위해서 500으로 나눔
        m = m % 500;            // 500을 나눈 후 나머지 금액을 계산하기 위해서 나머지 연산을 다시 한번
        int m100 = m / 100;     // 245에서 100원 동전의 수를 확인하기 위해서 100으로 나눔
        m = m % 100;            // 200을 뺀 나머지 값을 계산
        int m10 = m / 10;       // 45에서 10원 동전의 수 계산
        m = m % 10;             // 1원 동전 수 계산

        System.out.println("오만원" + m50000 + "개, 만원" + m10000 + "개, 천원"
                + m1000 + "개, 500원" + m500 + "개, 100원" + m100 + "개, 10원" + m10 + "개, 1원" + m + "개");
}
}