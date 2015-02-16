public class cronometro {
	public static void main(String args[]) {
		new cronometro();
	}

	public cronometro() {
		// Aqu� se toma el tiempo de incio
		long tiempoInicio = System.currentTimeMillis();
		ejecutaProceso();
		// Aqu� el m�todo a ejecutar
		// Aqu� se detiene el tiempo y calculamos la diferencia
		System.out
				.println("\nTiempo de ejecucion "
						+ (System.currentTimeMillis() - tiempoInicio)
						+ " milisegundos");
	}

	public void ejecutaProceso() {
		for (int i = 0; i < 1000000; i++) {
			System.out.println(i);
		}
	}
}