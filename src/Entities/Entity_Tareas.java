package Entities;

import java.sql.Date;

public class Entity_Tareas {
	private int no_tarea;
	private String descripcion;
	private String Char;
	private Date fecha_entrega;
	public int getNo_tarea() {
		return no_tarea;
	}
	public void setNo_tarea(int no_tarea) {
		this.no_tarea = no_tarea;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getChar() {
		return Char;
	}
	public void setChar(String c) {
		Char = c;
	}
	public Date getFecha_entrega() {
		return fecha_entrega;
	}
	
	public void setFecha_entrega(Date fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}
	
	

}
