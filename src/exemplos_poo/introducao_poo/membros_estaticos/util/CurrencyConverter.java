package exemplos_poo.introducao_poo.membros_estaticos.util;

public class CurrencyConverter {
	public static double dolarConverter(double dolarPrice, double qtdDolar) {
		double iofCalc = (qtdDolar * 6 / 100) + qtdDolar;
		return iofCalc * dolarPrice;
	}
}
