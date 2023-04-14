package Controller;
import PilhaString.PilhaS;

public class ConverteController {
	public static String decToBin (int Valor) {
		PilhaS PS = new PilhaS();
		while(Valor > 0) {
			PS.push("" + (Valor %2));
			Valor = Valor /2;
		}
		StringBuffer buffer = new StringBuffer();
		while(!PS.isEmpty()) {
			try {
				buffer.append(PS.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return buffer.toString();
	}
}
