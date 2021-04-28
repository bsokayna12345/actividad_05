package actividad_05;

public class Cuadrado extends Poligono {
	
	
	Punto punto1;
	private int lado;
	
	public Cuadrado(Punto punto1, int lado) {
		this.punto1=punto1;
		this.lado=lado;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return lado*lado ;
	}

}
