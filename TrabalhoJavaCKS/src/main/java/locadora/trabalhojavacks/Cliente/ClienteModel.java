/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.trabalhojavacks.Cliente;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author T-GAMER
 */
public class ClienteModel extends AbstractTableModel {
    
   private static ClienteModel instance;

   public static ClienteModel getInstance() {
       if (instance == null) {
            instance = new ClienteModel();
        }
        return instance;
    }
    
   
    private ArrayList<Cliente> clientes;

    private final String[] campos = {"Nome", "RG", "CPF", "Endereço"};

    public ClienteModel() {
        this.clientes = new ArrayList<>();

        for (Cliente cliente : PseudoData.getClientes()) {
            this.clientes.add(cliente);
        }
    }

    public void adicionaCliente(Cliente cliente) {
        this.clientes.add(cliente);
        this.fireTableDataChanged();
    }


    public Cliente getClienteByUniqueFields(String name, String rg, String cpf) {
        for (Cliente cliente : this.clientes) {
            if (name.equals(cliente.getNome()) || cpf.equals(cliente.getCpf()) || (!rg.isEmpty() && rg.equals(cliente.getRg()))) {

                return cliente;
            }
        }

        return null;
    }

     @Override
    public String getColumnName(int columnIndex) {
        return this.campos[columnIndex];
    }

    @Override
    public int getRowCount() {
        return ClienteDAO.getInstance().getAllClientes().size();
    }

    @Override
    public int getColumnCount() {
        return this.campos.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = ClienteDAO.getInstance().getAllClientes().get(rowIndex);

        switch (columnIndex) {
            case 0:
                return cliente.getNome();
            case 1:
                return cliente.getRg();
            case 2:
                return cliente.getCpf();
            case 3:
                return cliente.getEndereco();
            default:
                return null;
        }
    }
}