import java.util.Scanner;
public class QuartoDesafio {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite uma frase(Input): ");
            String input = scanner.nextLine();

            // Chamar o método para colocar em maiúscula a primeira letra de cada frase
            String output = capitalizeFirstLetter(input);

            System.out.print("Frase com as primeiras letras em maiúscula(Output): ");
            System.out.println(output);
        }

        public static String capitalizeFirstLetter(String sentence) {
            // Dividir a frase em frases usando pontos, exclamações e interrogações como delimitadores
            String[] phrases = sentence.split("(?<=[.!?])");

            // Criar uma nova string para armazenar o resultado
            StringBuilder result = new StringBuilder();

            // Iterar pelas frases
            for (String phrase : phrases) {
               phrase = phrase.trim();

                if (!phrase.isEmpty()) {
                    // Primeira letra em maiúscula
                    char firstLetter = Character.toUpperCase(phrase.charAt(0));

                    // Substituir a primeira letra na frase
                    phrase = firstLetter + phrase.substring(1);

                    // Adicionar a frase com a primeira letra maiúscula
                    result.append(phrase);
                }
            }

            return result.toString();
        }
    }


