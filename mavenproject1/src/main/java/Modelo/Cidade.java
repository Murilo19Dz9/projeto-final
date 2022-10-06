/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import DAO.CidadeDAO;

/**
 *
 * @author 0062330
 */
public class Cidade {
        private int codigo;
    private String nome;
    private String estado;
    private String cep;
    
    public Cidade(){
        this.codigo = -1;
        this.nome = "";
        this.estado = "";
        this.cep = "";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public void setProximoCodigo(){
        this.codigo = CidadeDAO.ProximoCodigo();
    }
    
    public void Salvar(){
        CidadeDAO.Salvar(this);
    }
}
