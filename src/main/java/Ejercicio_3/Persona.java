package Ejercicio_3;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	public ArrayList<Persona> _amigos = new ArrayList<Persona>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarAmigo() {
		throw new UnsupportedOperationException();
	}
}