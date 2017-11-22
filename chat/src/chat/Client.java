/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

/**
 *
 * @author dvcarrillo
 */

/**
 * Clase Client
 * Almacena inforamcion sobre el cliente:
 *  - ID del cliente (asignar numero random entre 1-10000 por ejemplo) (private)
 *  - Nombre del cliente (como atributo vacio, se asigna desde la GUI) (private)
 *  - PUERTO Y IP de conexion (se asignan desde la GUI) (private)
 *  - Objeto de mensaje: mensaje actual que esta componiendo (private)
 * 
 *  - Metodos SET para nombre, puerto e IP
 *  - Metodo que asigne el texto compuesto desde la GUI al mensaje actual
 *  (que reciba un string y lo meta en el atributo mensaje)
 *  - Metodo para enviar el mensaje actual al servidor
 *  OJO, HAY QUE ENVIAR EL OBJETO MENSAJE ENTERO, CON TODOS SUS ATRIBUTOS.
 *  VER SI ES POSIBLE HACERLO DIRECTAMENTE, POR BYTES, O PASANDO LOS CAMPOS DE
 *  MENSAJE STRING A STRING
 * 
 * @author dvcarrillo
 */

/**
 * OJO: COMO LA RECEPCION DE MENSAJES SE HACE EN CADA CLIENTE:
 * Implementar metodos y atributos de modo que en todo momento se tenga en esta
 * clase un registro de TODOS los mensajes que contiene Servidor
 * (puede funcionar replicar el ArrayList de Mensajes aqui e incluir metodos
 * para recibir el ultimo mensaje de Server, siempre que haya alguno nuevo)
 * @author dvcarrillo
 */

public class Client {
    public static void main(String [] args) {
        
    }
}
