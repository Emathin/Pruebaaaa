package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Consumidor {

	private Integer dniEsperado;
	private String nobreEsperado;
	private Set<MedioDePago> medios;

	public Consumidor(Integer dniEsperado, String nombreEsperado) {
		this.dniEsperado=dniEsperado;
		this.nobreEsperado=nombreEsperado;
		this.medios=new HashSet<MedioDePago>();
	}

	public Integer getDniEsperado() {
		return dniEsperado;
	}

	public void setDniEsperado(Integer dniEsperado) {
		this.dniEsperado = dniEsperado;
	}

	public String getNobreEsperado() {
		return nobreEsperado;
	}

	public void setNobreEsperado(String nobreEsperado) {
		this.nobreEsperado = nobreEsperado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dniEsperado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consumidor other = (Consumidor) obj;
		return Objects.equals(dniEsperado, other.dniEsperado);
	}

	public Set<MedioDePago> getMedios() {
		return medios;
	}

	public void setMedios(MedioDePago medio) {
		medios.add(medio);
	}
	
	

}
