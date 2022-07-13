package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

public class Billetera {

	private String nombreBilleter;
	private Set<Comercio> comercios;
	private Set<Consumidor> consumidores;
	
	
 
	public Billetera(String nombreBilletera) {
		this.nombreBilleter=nombreBilletera;
		this.comercios=new HashSet<Comercio>();
		this.consumidores=new HashSet<Consumidor>();
	}

	public String getNombreBilleter() {
		return nombreBilleter;
	}

	public void setNombreBilleter(String nombreBilleter) {
		this.nombreBilleter = nombreBilleter;
	}

	public void agregarComercio(Comercio unComercio) {
		this.comercios.add(unComercio);
		
	}

	public Set<Comercio> getComercios() {
		return comercios;
	}

	public void setComercios(Set<Comercio> comercios) {
		this.comercios = comercios;
	}
	

	public Integer getCantidadDeComercios() {
		return comercios.size();
	}

	public Set<Consumidor> getConsumidores() {
		return consumidores;
	}

	public void setConsumidores(Set<Consumidor> consumidor) {
		this.consumidores = consumidor;
	}

	public void agregarConsumidor(Consumidor consumidor) {
		this.consumidores.add(consumidor);		
	}

	public Object getCantidadDeConsumidores() {
		return consumidores.size();
	}

	public Consumidor traerConsumidor(Integer dni) {
		for (Consumidor consu : consumidores) {
			if(consu.getDniEsperado().equals(dni)) {
				return consu;
			}
		}
	} 
	public void agregarMedioDePago(Integer dni, MedioDePago unaTarjetaDeDebito) {
		this.traerConsumidor(dni).setMedios(unaTarjetaDeDebito);
		
	}

	
	

	}
	

