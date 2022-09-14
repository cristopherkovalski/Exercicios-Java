/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.trabalhojavacks.Veiculo.automovel;

import locadora.trabalhojavacks.Veiculo.CategoriaVeiculo;
import locadora.trabalhojavacks.Veiculo.EstadoVeiculo;
import locadora.trabalhojavacks.Veiculo.Locacao;
import locadora.trabalhojavacks.Veiculo.MarcaVeiculo;
import locadora.trabalhojavacks.Veiculo.Veiculo;

/**
 *
 * @author T-GAMER
 */
public class Automovel extends Veiculo {
    
    private ModeloAutomovel modelo;

    public Automovel(ModeloAutomovel modelo,CategoriaVeiculo categoria, MarcaVeiculo marca, String placa, EstadoVeiculo estado, double valorDeCompra, int ano, Locacao locacao) {
        super(categoria, marca, placa, estado, valorDeCompra, ano, locacao);
        this.modelo = modelo;
    }

    public ModeloAutomovel getModelo() {
        return modelo;
    }

    @Override
    public double getValorDiariaLocacao() {
        CategoriaVeiculo categoria = this.getCategoria();
        switch (categoria) {
            case POPULAR:
                return 100.00;
            case INTERMEDIARIO:
                return 300.00;
            case LUXO:
                return 450.00;
            default:
                return 0;
        }
    }
}
    

