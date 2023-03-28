package vehiculos;

import java.util.*;
import java.util.stream.Collectors;

public class Fabricante {

	private String nombre;
	private Pais pais;

	public static ArrayList<Fabricante> fabricas = new ArrayList<Fabricante>();

	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;	
	}
	public static Fabricante fabricaMayorVentas(){
		
		Map<Fabricante,Long> counts = fabricas.stream().collect(Collectors.groupingBy(e -> e,Collectors.counting()));
		Fabricante s = counts.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
		return s;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
