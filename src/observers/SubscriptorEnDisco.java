package observers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

import modelo.Observer;

public class SubscriptorEnDisco implements Observer {

	private String ruta;

	public SubscriptorEnDisco(String ruta) {
		this.ruta = ruta;
	}

	@Override
	public void actualizar(String valor) {
		try {
			File archivo = new File(Path.of(ruta).toString());
			FileWriter escritura = new FileWriter(archivo, true);

			escritura.write(valor + "\n");
			escritura.close();
		} catch (IOException e) {
			throw new RuntimeException("Hubo un error al escribir en el archivo", e);
		}

	}
}
