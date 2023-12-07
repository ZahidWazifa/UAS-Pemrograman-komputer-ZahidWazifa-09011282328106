package Soal9;
//** */
/**
 * Buat program Java yang menggunakan struktur data stack 
 * untuk memeriksa apakah urutan kurung buka dan kurung 
 * tutup pada suatu ekspresi matematika sudah benar.
 */
import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        short choose;
        do {
            System.out.println("1. Masukkan ekspresi matematika anda");
            System.out.println("2. Cek ekspresi matematika");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan anda:");
            choose = input.nextShort();
            input.nextLine();
            if (choose == 1) {
                System.out.print("Masukkan ekspresi matematika:");
                String expression = input.nextLine();
                for (char ch : expression.toCharArray()) {
                    stack.push(ch);
                }
            } else if (choose == 2) {
                String expression = "";
                while (!stack.isEmpty()) {
                    expression = stack.pop() + expression;
                }
                System.out.println(isBalanced(expression) ? "Urutan sudah benar." : "Urutan tidak benar.");
            }
        } while (choose != 3);
        input.close();
    }

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}