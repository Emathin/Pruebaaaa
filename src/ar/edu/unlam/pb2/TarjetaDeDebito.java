package ar.edu.unlam.pb2;

import java.util.Objects;

public class TarjetaDeDebito implements Pagadora , MedioDePago {

	private Integer codigoDeSeguridad;
	private Long numeroDeTarjeta;
	private String titular;
	private String fechaVencimientoTarjeta;
	private Double saldo;

	public TarjetaDeDebito(Long numeroDeTarjeta, String titular, String fechaVencimientoTarjeta,Integer codigoDeSeguridad)throws NumeroDeTarjetaInvalidoException {
		if (Long.toString(numeroDeTarjeta).length() > 16) {
			throw new NumeroDeTarjetaInvalidoException("El numero no debe ser mayor a 16 digitos");
		} else {
			this.numeroDeTarjeta = numeroDeTarjeta;
		}
		this.titular = titular;
		this.fechaVencimientoTarjeta = fechaVencimientoTarjeta;
		this.codigoDeSeguridad = codigoDeSeguridad;
	}

	// Getters and Setters

	public Integer getCodigoDeSeguridad() {
		return codigoDeSeguridad;
	}

	public void setCodigoDeSeguridad(Integer codigoDeSeguridad) {
		this.codigoDeSeguridad = codigoDeSeguridad;
	}

	public Long getNumeroDeTarjeta() {
		return numeroDeTarjeta;
	}

	public void setNumeroDeTarjeta(Long numeroDeTarjeta) {
		this.numeroDeTarjeta = numeroDeTarjeta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getFechaVencimientoTarjeta() {
		return fechaVencimientoTarjeta;
	}

	public void setFechaVencimientoTarjeta(String fechaVencimientoTarjeta) {
		this.fechaVencimientoTarjeta = fechaVencimientoTarjeta;
	}

	@Override
	public double getSaldo() {
		return saldo;
	}
	@Override
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroDeTarjeta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TarjetaDeDebito other = (TarjetaDeDebito) obj;
		return Objects.equals(numeroDeTarjeta, other.numeroDeTarjeta);
	}
	
	

}
