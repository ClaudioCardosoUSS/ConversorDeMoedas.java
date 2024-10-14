package currencyconverter;

import java.io.IOException;
import java.util.Scanner;

public class CurrencyConverter {
    private static final CurrencyService currencyService = new CurrencyService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            CurrencyUtils.displayMenu();
            int choice = scanner.nextInt();
            if (choice == 9) {
                System.out.println("Obrigado por usar o Conversor de Moedas. Até logo!");
                break;
            }
            handleMenuChoice(choice, scanner);
        }
        scanner.close();
    }

    private static void handleMenuChoice(int choice, Scanner scanner) {
        String[] currencies = CurrencyUtils.getCurrenciesForOption(choice);
        if (currencies == null) {
            System.out.println("Opção inválida. Por favor, tente novamente.");
            return;
        }

        String fromCurrency = currencies[0];
        String toCurrency = currencies[1];

        System.out.print("Digite o valor a ser convertido: ");
        double amount = scanner.nextDouble();

        try {
            double rate = currencyService.getExchangeRate(fromCurrency, toCurrency);
            double convertedAmount = amount * rate;
            System.out.printf("%.2f %s = %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao obter a taxa de câmbio: " + e.getMessage());
        }

        System.out.println("Pressione Enter para voltar ao menu principal...");
        scanner.nextLine(); // Consume newline
        scanner.nextLine(); // Wait for Enter
    }
}