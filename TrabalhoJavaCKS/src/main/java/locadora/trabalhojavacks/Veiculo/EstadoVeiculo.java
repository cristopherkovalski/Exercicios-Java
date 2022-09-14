/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.trabalhojavacks.Veiculo;

/**
 *
 * @author T-GAMER
 */
public enum EstadoVeiculo {
    LOCADO,
    VENDIDO,
    DISPONIVEL,
    NOVO;


public Boolean estadoLocado(){
    return this == LOCADO;
}
}