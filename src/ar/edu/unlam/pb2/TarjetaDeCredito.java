package ar.edu.unlam.pb2;

import java.util.Objects;

public class TarjetaDeCredito implements Pagadora, MedioDePago {

	private Long numeroDeTarjeta;
	private String titular;
	private String fechaVencimientoTarjeta;
	private Integer codigoDeSeguridad;
	private Double limiteDeCompraEnPesos;
	private Double limiteDeCompraEnDolares;
	private double saldo;

	public TarjetaDeCredito(Long numeroDeTarjeta, String titular, String fechaVencimientoTarjeta,
			Integer codigoDeSeguridad, double limiteDeCompraEnPesos, double limiteDeCompraEnDolares)
			throws NumeroDeTarjetaInvalidoException {
		if (Long.toString(numeroDeTarjeta).length() != 16) {
			throw new NumeroDeTarjetaInvalidoException("El numero de tarjeta es inválido");
		} else {
			this.numeroDeTarjeta = numeroDeTarjeta;
			this.titular = titular;
			this.fechaVencimientoTarjeta = fechaVencimientoTarjeta;
			this.codigoDeSeguridad = codigoDeSeguridad;
			this.limiteDeCompraEnPesos = limiteDeCompraEnPesos;
			this.limiteDeCompraEnDolares = limiteDeCompraEnDolares;
		}

	}

	public TarjetaDeCredito(Long numeroDeTarjeta, String titular, String fechaVencimientoTarjeta,
			Integer codigoDeSeguridad) throws NumeroDeTarjetaInvalidoException {
		if (Long.toString(numeroDeTarjeta).length() != 16) {
			throw new NumeroDeTarjetaInvalidoException("El numero de tarjeta es inválido");
		} else {
			this.numeroDeTarjeta = numeroDeTarjeta;
			this.titular = titular;
			this.fechaVencimientoTarjeta = fechaVencimientoTarjeta;
			this.codigoDeSeguridad = codigoDeSeguridad;
		}
	}

	@Override
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public double getSaldo() {

		return saldo;
	}

	// Getters and setters

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

	public Integer getCodigoDeSeguridad() {
		return codigoDeSeguridad;
	}

	public void setCodigoDeSeguridad(Integer codigoDeSeguridad) {
		this.codigoDeSeguridad = codigoDeSeguridad;
	}

	public Double getLimiteDeCompraEnPesos() {
		return limiteDeCompraEnPesos;
	}

	public void setLimiteDeCompraEnPesos(double limiteDeCompraEnPesos) {
		this.limiteDeCompraEnPesos = limiteDeCompraEnPesos;
	}

	public Double getLimiteDeCompraEnDolares() {
		return limiteDeCompraEnDolares;
	}

	public void setLimiteDeCompraEnDolares(double limiteDeCompraEnDolares) {
		this.limiteDeCompraEnDolares = limiteDeCompraEnDolares;
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
		TarjetaDeCredito other = (TarjetaDeCredito) obj;
		return Objects.equals(numeroDeTarjeta, other.numeroDeTarjeta);
	}

	
}
