import java.util.Scanner;

public class Alistamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do recruta:  ");
        String nome = scanner.nextLine();
        System.out.println ("Ola, " + nome + "!");
    
        System.out.println("digite o seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Seu peso é: " + peso + " kg");
    
        if (peso <50) {
            System.out.println("Você esta abaixo do peso ideal para o alistamento");
        }else if (peso <= 50 && peso <= 100){
            System.out.println("Você esta dentro do peso ideal para o alistamento");
        } else {
            System.out.println("Você esta acima do peso ideal para o alistamento");
        }
        scanner.close();
}
}