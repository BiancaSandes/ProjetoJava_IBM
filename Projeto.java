import java.util.Scanner; // Importa a classe Scanner para ler entradas do usuário

public class Projeto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        int[] numeros = new int[10]; // Cria um array para armazenar os 10 números
        int soma = 0;
        int maior, menor;

        // Solicita os números ao usuário
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt(); 
            soma += numeros[i]; // Soma os números para calcular a média depois
        }
        
        scanner.close(); 
        
    
        maior = numeros[0];
        menor = numeros[0];
        
        // Encontra o maior e o menor número
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        // Exibe os números digitados
        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        // Calcula a média
        double media = (double) soma / 10;
        
        // Exibe os resultados
        System.out.println("\nMédia dos números: " + media);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
