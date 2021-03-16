import java.util.Arrays;

public class CurrencyExchangeClass {
    public static void main(String[] args) {

        System.out.println("Umrechnung:Zielwährung HUF, value : "+exchangeCurrency("HUF",100.33));
        System.out.println("Umrechnung:Zielwährung SEK, value : "+exchangeCurrency("SEK",1000.66));
        System.out.println("Umrechnung:Zielwährung USD, value : "+exchangeCurrency("USD",1.77));
    }

    public static double exchangeCurrency(String my_currency, double value) {
            if (my_currency.equals("HUF")) {
              return value*328.61;
            } else if (my_currency.equals("SEK")) {
                return value*10.76;
            } else if (my_currency.equals("USD")) {
                return value*1.12;
            } else if (my_currency.equals("CAD")) {
                return  value*1.47;
            }
            return 0;
    }

}
