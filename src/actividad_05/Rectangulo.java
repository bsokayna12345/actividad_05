package actividad_05;

public class Rectangulo extends Poligono {
	
	//los atributos de la parte inferior del pecho, la longitud y el ancho
	Punto punto1;
	private int longitud, ancho;
	
	//le constructeur
	public Rectangulo(Punto  point, int longitud , int largeur) {
		this.punto1=punto1;
		this.longitud=longitud;
		this.ancho=ancho;
		
		
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return longitud*ancho;
	}

}
