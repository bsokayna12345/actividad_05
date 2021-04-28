package actividad_05;

public class Circulo extends Fegura{
	
	// los atributos el centro y el radio
	Punto centro;
	double radio;

	
	// constructor
	public Circulo( Punto centro, double radio ) {
		
		this.centro=centro;
		this.radio=radio;
	}


	@Override
	public double calcularArea() {
		
		return Math.PI*radio ;
	}
}
