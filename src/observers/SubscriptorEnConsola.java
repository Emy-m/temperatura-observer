package observers;

import modelo.Observer;

public class SubscriptorEnConsola implements Observer {

	@Override
	public void actualizar(String valor) {
		int temperatura = Integer.valueOf(valor.split(" ")[0]);

		if (temperatura < 12) {
			System.out.println("Temperatura: " + temperatura + ", Hace frio, se encenderá la caldera");
		} else if (temperatura > 17) {
			System.out.println("Temperatura: " + temperatura + ", Hace calor, se encenderá el aire acondicionado");
		}
	}

}
