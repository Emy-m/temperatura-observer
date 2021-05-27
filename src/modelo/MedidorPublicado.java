package modelo;

public class MedidorPublicado extends Observable implements IPublicador {
	private IPublicador medidor;

	public MedidorPublicado(IPublicador medidor) {
		super();
		this.medidor = medidor;
	}

	@Override
	public String leerTemperatura() {// leo la temperatura del servicio web
		String temperatura = this.medidor.leerTemperatura();
		notificar(temperatura);
		return temperatura;
	}
}
