/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.trabalhojavacks.Veiculo;

import locadora.trabalhojavacks.Cliente.Cliente;
import java.util.Calendar;

/**
 *
 * @author T-GAMER
 */
public interface Veiculo1 {
    public void locar(int dias, Calendar data, Cliente cliente);
    public void vender();
    public void devolver();
    public EstadoVeiculo getEstado();
    public MarcaVeiculo getMarca();
    public CategoriaVeiculo getCategoria();
    public Locacao getLocacao();
    public String getPlaca();
    public int getAno();
    public double getValorDeVenda();
    public double getValorDiariaLocacao();

    
    
    
}
