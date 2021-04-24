package calculadora;

public class CalculadoraDeImposto {

	private double aliquota;

	public double calculoAliquota(double valor) {
		
		if (valor > 4000) {
			aliquota = 0.22f;
			valor += (valor * aliquota);
		}
		
		else if (valor >= 2500.01 && valor <= 4000) {
			aliquota = 0.15f;
			valor += (valor * aliquota);

		} 

		else if (valor >= 1000.01 && valor <= 2500) {
			aliquota = 0.10f;
			valor += (valor * aliquota);

		} 
		else if (valor > 0 && valor <= 1000) {
			aliquota = 0.5f;
			valor += (valor * aliquota);
		}

		else {
			valor = 0;
		}

		return valor;
	}
}