import java.util.Scanner;

public class Hello{
    public static void main(String[] args){

        Scanner skaner = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
        String opcja;

        System.out.println("Witaj świecie!");
        do {

            System.out.println( "Jeżeli chcesz zakończyć wpisz exit i naciśnij enter " + "jeśli nie, wybierz inny znak. ");
            opcja = skaner.next();
        } while (!opcja.equalsIgnoreCase("exit"));

        System.out.println("Koniec, dziękuję za współpracę.");


    }




}