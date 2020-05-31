/*
Según los requisitos del Asunto, estamos creando un plano de la interfaz del Asunto que 
tiene métodos de contrato que deben ser implementados por un Sujeto concreto. 
En nuestro ejemplo, NewVideo es un tema concreto.
 */

/**
 *
 * @author crys
 */
 interface Subject {
        // Libres para suscribirse o no
	public void suscribed(Observer obj);
	public void unsuscribe(Observer obj);
 
	// Con esto se mandara la notificacion
	public void notifyObservers();
 
	// Metodo para obtener el observer
	public Object getUpdate(Observer obj);
}
