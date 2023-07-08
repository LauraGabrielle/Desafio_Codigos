import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class QuintoDesafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra(Input): ");
        String input = scanner.nextLine();

        // Chamar o método para verificar se a string é um anagrama de um palíndromo
        boolean isAnagramPalindrome = checkAnagramPalindrome(input);

        System.out.println("A string é um anagrama de um palíndromo?(Output): " + isAnagramPalindrome);
    }

    public static boolean checkAnagramPalindrome(String str) {
        // Remover espaços e sinais de pontuação da string
        String cleanString = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Contar a ocorrência de cada caractere na string
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : cleanString.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Verificar se é possível formar um palíndromo com os caracteres
        boolean oddCountAllowed = cleanString.length() % 2 == 0 ? false : true;
        boolean foundOddCount = false;

        for (int count : charCount.values()) {
            if (count % 2 != 0) {
                if (oddCountAllowed && !foundOddCount) {
                    foundOddCount = true;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
