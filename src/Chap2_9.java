import java.util.Scanner;

public class Chap2_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하세요 ");
        int num = scan.nextInt();

//        2자리의 숫자 중 10의 자리 숫자와 1의 자리 숫자를 분리
        int num1 = num % 10;    // 10의자리 숫자를 저장
        int num2 = num / 10;    // 1의자리 숫자를 저장

        if(num1 == 3 || num1 == 6 || num1 == 9) {
            if(num2 == 3 || num2 == 6 || num2 == 9){
                System.out.println("박수 짝짝");
            }else {
                System.out.println("박수 짝");
            }
        } else {
            System.out.println("박수 없음");
        }


//        풀이 1

        int count = 0;  // 3, 6, 9의 수를 저장하기 위한 변수

//        10의자리 숫자가 3의 배수인지 확인
        if(num2 % 3 == 0) {
            count++;
        }

//        1의자리 숫자가 3의 배수인지 확인
        if (num1 % 3 == 0) {
            count++;
        }

        if (count ==1){
            System.out.println("박수 짝");
        } else if (count == 2) {
            System.out.println("박수 짝짝");
        } else {
            System.out.println("박수 없음");
        }


//        풀이 2
        if((num1 % 3 == 0) && (num2 % 3 == 0)) {
            System.out.println("박수 짝짝");
        } else if ((num1 % 3 == 0) ^ (num2 % 3 == 0)) {
            System.out.println("박수 짝");
        }else {
            System.out.println("박수 없음");
        }
    }
}
