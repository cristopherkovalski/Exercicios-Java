/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.trabalhojavacks.Veiculo.van;

import locadora.trabalhojavacks.Veiculo.CategoriaVeiculo;
import locadora.trabalhojavacks.Veiculo.EstadoVeiculo;
import locadora.trabalhojavacks.Veiculo.Locacao;
import locadora.trabalhojavacks.Veiculo.MarcaVeiculo;
import locadora.trabalhojavacks.Veiculo.Veiculo;

/**
 *
 * @author Cristopher
 */
public class Van extends Veiculo {
    
    private ModeloVan modelo;
    
    public Van(ModeloVan modelo,CategoriaVeiculo categoria, MarcaVeiculo marca, String placa, EstadoVeiculo estado, double valorDeCompra, int ano, Locacao locacao) {
        super(categoria, marca, placa, estado, valorDeCompra, ano, locacao);
        this.modelo = modelo;
    }
    
    public ModeloVan getModelo(){
      return this.modelo;
    
}
     @Override
    public double getValorDiariaLocacao() {
        CategoriaVeiculo categoria = this.getCategoria();
        switch (categoria) {
            case POPULAR:
                return 200.00;
            case INTERMEDIARIO:
                return 400.00;
            case LUXO:
                return 600.00;
            default:
                return 0;
        }
    }
}
    
