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
public abstract class Veiculo implements Veiculo1 {
   private CategoriaVeiculo categoria;
   private MarcaVeiculo marca;
   private String placa;
   private EstadoVeiculo estado;
   private int ano;
   private double valorDeCompra;
   private Locacao locacao;

   
    public Veiculo(CategoriaVeiculo categoria, MarcaVeiculo marca, String placa, EstadoVeiculo estado, double valorDeCompra, int ano, Locacao locacao) {
        this.categoria = categoria;
        this.marca = marca;
        this.placa = placa;
        this.estado = estado;
        this.valorDeCompra = valorDeCompra;
        this.ano = ano;
        this.locacao= locacao;
    }
    
   @Override
    public void locar(int dias, Calendar data, Cliente cliente) {
        if (this.estado.estadoLocado()) return;
        this.locacao = new Locacao(dias, getValorDiariaLocacao(), data, cliente);
        this.estado = EstadoVeiculo.LOCADO;
    }
   @Override
    public void vender(){
        this.estado = EstadoVeiculo.VENDIDO;
    }
    
    @Override
    public void devolver() {
        this.estado = EstadoVeiculo.DISPONIVEL;
        this.locacao = null;
    }
    
   @Override
    public EstadoVeiculo getEstado(){
       return this.estado;
   }
   @Override
    public int getAno(){
       return this.ano;
   }
   
   @Override
    public MarcaVeiculo getMarca(){
       return this.marca;
   }
    
   @Override
    public CategoriaVeiculo getCategoria(){
        return this.categoria;
    }
   
    
    public int calculaIdade() {
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        return anoAtual - this.ano;
    }
    
   @Override
     public double getValorDeVenda() {
        double valorDeVenda = this.valorDeCompra - (calculaIdade() * 0.15 * this.valorDeCompra);
            if(valorDeCompra*0.1 > valorDeVenda){
             valorDeVenda = this.valorDeCompra * 0.1;}
             return valorDeVenda;
     }
   @Override
     public abstract double getValorDiariaLocacao();
     
   @Override
     public String getPlaca(){
         return this.placa;
     }

    
    @Override
     public Locacao getLocacao(){
        return this.locacao;
    }
         
 
}

