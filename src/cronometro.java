public class cronometro {
	public static void main(String args[]) {
		new cronometro();
	}

	public cronometro() {
		// Aquí se toma el tiempo de incio
		long tiempoInicio = System.currentTimeMillis();
		ejecutaProceso();
		// Aquí el método a ejecutar
		// Aquí se detiene el tiempo y calculamos la diferencia
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