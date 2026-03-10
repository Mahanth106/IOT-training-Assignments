import java.util.Scanner;
public class GradeSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        switch (marks / 10) {
            case 10:
            case 9: System.out.println("Grade A"); break;
            case 8: System.out.println("Grade B"); break;
            case 7: System.out.println("Grade C"); break;
            case 6: System.out.println("Grade D"); break;
            case 5: System.out.println("Grade E"); break;
            default:
                if (marks >= 0) System.out.println("Grade F");
                else System.out.println("Invalid");
        }
        sc.close();
    }
}