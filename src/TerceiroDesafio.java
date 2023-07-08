import java.util.Scanner;

public class TerceiroDesafio {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite uma palavra(Input): ");
            String input = scanner.nextLine();

            // Chamar o método para encontrar a substring palíndroma mais longa
            String output = findLongestPalindrome(input);


            System.out.print("A substring palíndroma mais longa é(Output): ");
            System.out.println(output);
        }

        public static String findLongestPalindrome(String str) {
            if (str == null || str.length() == 0) {
                return "";
            }

            int comeco = 0;
            int fim = 0;

            for (int i = 0; i < str.length(); i++) {
                int len1 = expandAroundCenter(str, i, i); // palíndromo de comprimento ímpar
                int len2 = expandAroundCenter(str, i, i + 1); // palíndromo de comprimento par
                int len = Math.max(len1, len2);

                if (len > fim - comeco) {
                    comeco = i - (len - 1) / 2;
                    fim = i + len / 2;
                }
            }

            return str.substring(comeco, fim + 1);
        }

        public static int expandAroundCenter(String str, int left, int right) {
            int L = left;
            int R = right;

            while (L >= 0 && R < str.length() && str.charAt(L) == str.charAt(R)) {
                L--;
                R++;
            }

            return R - L - 1;
        }
    }

