package pl.agataroga.creditcalculator;
//Stwórz kalkulator kredytowy, który pobierze od użytkownika dane takie jak:
//jego miesięczna pensja, jego miesięczne zobowiązania, na ile chce wziac kredyt i ile chce tego kredytu wziąc.
//Nastepnie oblicz, czy ten kredyt otrzyma wzorem:
//jego miesieczne zarobki minus miesieczne zobowiazania, musza byc wieksze o 30% od kwoty kredytu podzielonej przez liczbę miesięcy.
//Komunikat o przyznaniu lub oddaleniu kredytu wypisz na tej samej stronie co formularz.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreditcalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditcalculatorApplication.class, args);
	}

}
