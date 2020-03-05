package util;

public class CurrencyCoverter {

	public double convertendo(double dolar, double bought) {
		double calc1 = dolar * bought;
		double calc2 = calc1 * 0.06;
		double result = calc2 + calc1;

		return result;
	}

}
