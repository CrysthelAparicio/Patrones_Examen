/*
A continuación, crearemos un contrato para el Observador, habrá un método para adjuntar el 
Sujeto al observador y otro método que utilizará el Sujeto para notificar cualquier cambio.
 */

/**
 *
 * @author crys
 */
 interface Observer {
        // Metodo para mandar el update del observer
	public void update();
 
	// Attach
	public void setSubject(Subject subjectObj);
}
