/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.trabalhojavacks.Cliente;
import java.util.ArrayList;
/**
 *
 * @author T-GAMER
 */
public class PseudoData {
    
    public static ArrayList<Cliente> getClientes() {
        ArrayList<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("João", "189511214", "408.995.600-59", "Rua Rui Barbosa"));
        clientes.add(new Cliente("Maria", "", "364.991.580-46", "Rua Alferes Poli"));
        clientes.add(new Cliente("Joaquim", "", "566.712.790-39", ""));

        return clientes;
    }
}
    

