/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Senha {
    private int numero;
    private String tipo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   @Override
    public String toString() {
        return this.getTipo()+this.getNumero();
    }

    
    public Senha() {
        this.numero=0;
        this.tipo="";
    }
    
    public Senha(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }
    
}
