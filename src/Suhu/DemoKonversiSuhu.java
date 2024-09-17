
package Suhu;

public class DemoKonversiSuhu {
      public static void main(String[] args) {
        KonversiSuhu suhu1 = new KonversiSuhu();
        KonversiSuhu2 suhu2 = new KonversiSuhu2();
        
        double celcius = 25.0;
        System.out.println("25 Celcius ke Fahrenheit: " + suhu1.celciusToFahrenheit(celcius));
        System.out.println("25 Celcius ke Reamur: " + suhu1.celciusToReamur(celcius));
       
        double fahrenheit = 77.0;
        System.out.println("77 Fahrenheit ke Reamur: " + suhu2.fahrenheitToReamur(fahrenheit));
    }
}

