package Entities;

import java.sql.Date;

public class Entity_Bitacora {
	private int no_bitacora;
	private String descripcion;
	private Date fecha_entrega;
	private String status;
	public int getNo_bitacora() {
		return no_bitacora;
	}
	public void setNo_bitacora(int no_bitacora) {
		this.no_bitacora = no_bitacora;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha_entrega() {
		return fecha_entrega;
	}
	public void setFecha_entrega(Date fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
}
