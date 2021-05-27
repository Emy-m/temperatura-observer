package main;

import modelo.Medidor;
import modelo.MedidorPublicado;
import modelo.WeatherChannelService;
import observers.SubscriptorEnConsola;
import observers.SubscriptorEnDisco;

public class Main {
	public static void main(String[] args) {
		WeatherChannelService clima = new WeatherChannelService();
		MedidorPublicado medidorPublicado = new MedidorPublicado(new Medidor(clima));

		SubscriptorEnDisco subDisco = new SubscriptorEnDisco("C:\\Users\\Emy_m\\Desktop\\subscriptor.txt");
		SubscriptorEnConsola subConsola = new SubscriptorEnConsola();

		medidorPublicado.agregarObservador(subDisco);
		medidorPublicado.agregarObservador(subConsola);

		medidorPublicado.leerTemperatura();
	}
}
