package persistence.demo.entities;

public class Color {
	
	private long id = -1;
	private String name;
	private int red;
	private int green;
	private int blue;
	
	public static final int MAX_VALUE = 255; 
	public static final int MIN_VALUE = 0;
	public static final String DEFAULT_NAME = "undefined";
	
	public Color(String name, int red, int green, int blue) {
		
		this.setName(name);
		this.setRed(red);
		this.setGreen(green);
		this.setBlue(blue);
	}
	
	public Color(int red, int green, int blue) {
		
		this.setName(DEFAULT_NAME);
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	// Método que asigna el id al color SOLO si no tiene uno asignado y éste es valor valido(>0)
	public void setId(long id) {
		if(this.getId() != -1) {
			throw new UnsupportedOperationException("No se puede cambiar el id de un objeto ya asignado");
		}
		if(id <= 0) {
			
			throw new IllegalArgumentException("El id a asignar a una entidad debe ser un valor positivo");
		}
		this.id=id;
	}
	
	
	//GETS & SETS
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}

	public void setName(String name) {
		
		if(name == null || name.trim().isEmpty()) {
			throw new NullPointerException("Es obligatorio indicar el nombre del color!");
		}
		this.name = name;
	}

	public void setRed(int red) {
		if(red < MIN_VALUE || red > MAX_VALUE) {
			throw new IllegalArgumentException(String.format("Valor %d no es valido " +
															 "para la coordenada R. " +
															"Valores validos: %d - %d", red, MIN_VALUE, MAX_VALUE));
		}
		this.red = red;
	}

	public void setGreen(int green) {
		if(green < MIN_VALUE || green > MAX_VALUE) {
			throw new IllegalArgumentException(String.format("Valor %d no es valido " +
															 "para la coordenada R. " +
															"Valores validos: %d - %d", red, MIN_VALUE, MAX_VALUE));
		}
		this.green = green;
	}

	public void setBlue(int blue) {
		if(blue < MIN_VALUE || blue > MAX_VALUE) {
			throw new IllegalArgumentException(String.format("Valor %d no es valido " +
															 "para la coordenada R. " +
															"Valores validos: %d - %d", red, MIN_VALUE, MAX_VALUE));
		}
		this.blue = blue;
	}
	
	
	

}
