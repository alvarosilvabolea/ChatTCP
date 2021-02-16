package Servidor;

import java.net.Socket;

public class AtiendeCliente extends AppServidor{
	Socket conexion;
	
	
	public AtiendeCliente(Socket conexion) {
		super();
		this.conexion = conexion;
	}


	public Socket getConexion() {
		return conexion;
	}


	public void setConexion(Socket conexion) {
		this.conexion = conexion;
	}


	public static void run() {
		
	}

}
