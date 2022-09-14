/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.trabalhojavacks.Veiculo.motocicleta;

import locadora.trabalhojavacks.Veiculo.CategoriaVeiculo;
import locadora.trabalhojavacks.Veiculo.EstadoVeiculo;
import locadora.trabalhojavacks.Veiculo.Locacao;
import locadora.trabalhojavacks.Veiculo.MarcaVeiculo;
import locadora.trabalhojavacks.Veiculo.Veiculo;

/**
 *
 * @author T-GAMER
 */
public class Motocicleta extends Veiculo {
    private ModeloMotocicleta modelo;
    
    public Motocicleta(ModeloMotocicleta modelo,CategoriaVeiculo categoria, MarcaVeiculo marca, String placa, EstadoVeiculo estado, double valorDeCompra, int ano, Locacao locacao) {
        super(categoria, marca, placa, estado, valorDeCompra, ano, locacao);
        this.modelo = modelo;
    }
    
    public ModeloMotocicleta getModelo(){
      return this.modelo;
}
    @Override
    public double getValorDiariaLocacao() {
        CategoriaVeiculo categoria = this.getCategoria();
        switch (categoria) {
            case POPULAR:
                return 70.00;
            case INTERMEDIARIO:
                return 200.00;
            case LUXO:
                return 350.00;
            default:
                return 0;
            }
    }
}
    
