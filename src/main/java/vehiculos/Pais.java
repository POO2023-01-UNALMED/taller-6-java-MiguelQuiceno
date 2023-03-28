package vehiculos;

import java.util.*;
import java.util.stream.Collectors;

public class Pais {

	private String nombre;

	public static ArrayList<Pais> paises = new ArrayList<Pais>();

	public static Pais paisMasVendedor(){
		
		Map<Pais,Long> counts = paises.stream().collect(Collectors.groupingBy(e -> e,Collectors.counting()));
		Pais s = counts.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
		return s;
	}

	public Pais(String nombre){
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
