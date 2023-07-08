import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SegundoDesafio {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite uma frase(Input): ");
            String input = scanner.nextLine();

            String output = removeDuplicates(input);

            System.out.print("Frase após a remoção de caracteres duplicados(Output): ");
            System.out.println(output);
        }

        public static String removeDuplicates(String str) {
            char[] chars = str.toCharArray();

            // Usar um Set para armazenar os caracteres únicos na ordem em que aparecem
            Set<Character> uniqueChars = new LinkedHashSet<>();

            // Adicionar os caracteres ao Set, que automaticamente remove os duplicados
            for (char c : chars) {
                uniqueChars.add(c);
            }

            // Construir uma nova string a partir dos caracteres únicos
            StringBuilder result = new StringBuilder();
            for (char c : uniqueChars) {
                result.append(c);
            }

            return result.toString();
        }
    }

