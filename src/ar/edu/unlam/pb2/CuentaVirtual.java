package ar.edu.unlam.pb2;

import java.util.Objects;

public class CuentaVirtual implements Transferible , MedioDePago {

	private String cvuEsperado;
	private String entidadEsperada;
	private String titularEsperado;

	public CuentaVirtual(String cvuEsperado, String entidadEsperada, String titularEsperado)throws CVUInvalidoException {
		if (cvuEsperado.length() != 23) {
			throw new CVUInvalidoException("El CVU debe contener 23 digitos");
		} else {
			this.cvuEsperado = cvuEsperado;
		}
		this.entidadEsperada = entidadEsperada;
		this.titularEsperado = titularEsperado;

	}

	public String getCvuEsperado() {
		return cvuEsperado;
	}

	public void setCvuEsperado(String cvuEsperado) {
		this.cvuEsperado = cvuEsperado;
	}

	public String getEntidadEsperada() {
		return entidadEsperada;
	}

	public void setEntidadEsperada(String entidadEsperada) {
		this.entidadEsperada = entidadEsperada;
	}

	public String getTitularEsperado() {
		return titularEsperado;
	}

	public void setTitularEsperado(String titularEsperado) {
		this.titularEsperado = titularEsperado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cvuEsperado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaVirtual other = (CuentaVirtual) obj;
		return Objects.equals(cvuEsperado, other.cvuEsperado);
	}

	
}
