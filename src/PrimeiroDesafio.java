import java.util.Scanner;
public class PrimeiroDesafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase(Input): ");
        String input = scanner.nextLine();

        // Chamar o método para reverter a ordem das palavras
        String output = reverseWords(input);

        System.out.print("Frase com a ordem das palavras revertida(Output): ");
        System.out.println(output);
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");

        // Criar uma nova string para armazenar a frase revertida
        StringBuilder reversed = new StringBuilder();

        //palavras na ordem inversa
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        return reversed.toString();
    }
}
