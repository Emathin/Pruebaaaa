package ar.edu.unlam.pb2;

import java.util.Objects;

public class CuentaBancaria implements Transferible, MedioDePago{

	private String cbuEsperado;
	private String entidadEsperada;
	private String titularEsperado;

	public CuentaBancaria(String cbuEsperado, String entidadEsperada, String titularEsperado) throws CBUInvalidoException{
		if(cbuEsperado.length()!=22) {
			throw new CBUInvalidoException("El CBU debe ser de 22 digitos");
		}else{
			this.cbuEsperado=cbuEsperado;
		}
		this.entidadEsperada=entidadEsperada;
		this.titularEsperado=titularEsperado;
	}

	public String getCbuEsperado() {
		return cbuEsperado;
	}

	public void setCbuEsperado(String cbuEsperado) {
		this.cbuEsperado = cbuEsperado;
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

	public void setTitularEsperado(String titularEsperadoa) {
		this.titularEsperado = titularEsperadoa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cbuEsperado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaBancaria other = (CuentaBancaria) obj;
		return Objects.equals(cbuEsperado, other.cbuEsperado);
	}
	
	
	
}
