package exercicios;

public class CurrencyConvert {
	/**
	 * Class for calculating the convert of coin and IOF percentage of taxe.
	 * @author Marcos Gostoso
	 */
	public static double IOF = 0.06;
	
	public static double Convert(double dolarPrice, double quantity) {
		return dolarPrice * quantity + (IOF * dolarPrice * quantity);
	}
	
	
}
