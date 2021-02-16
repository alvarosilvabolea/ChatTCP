package Servidor;

import java.net.Socket;

public class ComunHilos extends AtiendeCliente {

	int conexionesTotales;
	int conexionesActuales;
	Socket tableDeConexiones;
	String mensaje;
	
	public ComunHilos(Socket conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	public ComunHilos(Socket conexion, int conexionesTotales, int conexionesActuales, Socket tableDeConexiones,
			String mensaje) {
		super(conexion);
		this.conexionesTotales = conexionesTotales;
		this.conexionesActuales = conexionesActuales;
		this.tableDeConexiones = tableDeConexiones;
		this.mensaje = mensaje;
	}

	public int getConexionesTotales() {
		return conexionesTotales;
	}

	public void setConexionesTotales(int conexionesTotales) {
		this.conexionesTotales = conexionesTotales;
	}

	public int getConexionesActuales() {
		return conexionesActuales;
	}

	public void setConexionesActuales(int conexionesActuales) {
		this.conexionesActuales = conexionesActuales;
	}

	public Socket getTableDeConexiones() {
		return tableDeConexiones;
	}

	public void setTableDeConexiones(Socket tableDeConexiones) {
		this.tableDeConexiones = tableDeConexiones;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
