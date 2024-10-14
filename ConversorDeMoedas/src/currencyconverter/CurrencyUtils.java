package currencyconverter;

public class CurrencyUtils {
    public static void displayMenu() {
        System.out.println("\nConversor de Moedas - Menu Principal");
        System.out.println("1. Dólar => Real Brasileiro");
        System.out.println("2. Real Brasileiro => Dólar");
        System.out.println("3. Dólar => Euro");
        System.out.println("4. Euro => Dólar");
        System.out.println("5. Dólar => Peso Argentino");
        System.out.println("6. Peso Argentino => Dólar");
        System.out.println("7. Real Brasileiro => Peso Argentino");
        System.out.println("8. Peso Argentino => Real Brasileiro");
        System.out.println("9. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static String[] getCurrenciesForOption(int option) {
        switch (option) {
            case 1: return new String[]{"USD", "BRL"};
            case 2: return new String[]{"BRL", "USD"};
            case 3: return new String[]{"USD", "EUR"};
            case 4: return new String[]{"EUR", "USD"};
            case 5: return new String[]{"USD", "ARS"};
            case 6: return new String[]{"ARS", "USD"};
            case 7: return new String[]{"BRL", "ARS"};
            case 8: return new String[]{"ARS", "BRL"};
            default: return null;
        }
    }
}