import java.util.Scanner;
public class Answer {
    public static void main(String[] args) {
//        문제 1) 정수를 입력받아 점수 및 등급을 출력하는 프로그램을 작성하세요
//        else if 문을 사용하여 작성
//        95이상 = A+, 90이상 = A, 85이상 = B+, 80이상 = B, 75이상 = C+, 70이상 = C, 60이상 = D, 60미만 = F
//        중첩 if문을 사용하여 각각의 + 대의 점수를 출력

        Scanner scan = new Scanner(System.in);
        System.out.println("점수를 입력하세요 : ");
        int grade = scan.nextInt();

        if(grade >= 90) {
            if(grade >= 95) {
                System.out.println("당신의 등급은 A+ 입니다." + grade);
            }else {
                System.out.println("당신의 등급은 A 입니다." + grade);
            }} else if(grade >= 80) {
                if(grade >= 85) {
                    System.out.println("당신의 등급은 B+ 입니다." + grade);
                }else {
                    System.out.println("당신의 등급은 B 입니다." + grade);
                }
            }else if(grade >= 70) {
                if(grade >= 75) {
                    System.out.println("당신의 등급은 C+ 입니다." + grade);
                }else {
                    System.out.println("당신의 등급은 C 입니다." + grade);
                }
            }else if (grade >= 60) {
                System.out.println("당신의 등급은 D 입니다." + grade);
            }else {
                System.out.println("당신의 등급은 F 입니다." + grade);
            }
        }
    }

