package ar.edu.unlam.pb2;

import java.util.Objects;

public class Comercio {

	private Long cuitEsperado;
	private String nombreEsperado;

	public Comercio(Long cuitEsperado, String nombreEsperado) throws CuitInvalidoException {

		if (Long.toString(cuitEsperado).length() == 11 && Long.toString(cuitEsperado).charAt(0) == '3'
				&& Long.toString(cuitEsperado).charAt(1) == '0') {
			this.cuitEsperado = cuitEsperado;
		} else {
			throw new CuitInvalidoException("CUIT invalido SSS");
		}
		this.nombreEsperado = nombreEsperado;
	}

	public Long getCuitEsperado() {
		return cuitEsperado;
	}

	public void setCuitEsperado(Long cuitEsperado) {
		this.cuitEsperado = cuitEsperado;
	}

	public String getNombreEsperado() {
		return nombreEsperado;
	}

	public void setNombreEsperado(String nombreEsperado) {
		this.nombreEsperado = nombreEsperado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cuitEsperado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comercio other = (Comercio) obj;
		return Objects.equals(cuitEsperado, other.cuitEsperado);
	}

}
