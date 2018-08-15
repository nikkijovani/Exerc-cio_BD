/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.simoneflorincy.contrlole_de_gastos_poo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table (name = "funcionario")
public class Funcionario implements Serializable {

    /**
     * @return the tp_visivel
     */
    public Character getTp_visivel() {
        return tp_visivel;
    }

    /**
     * @param tp_visivel the tp_visivel to set
     */
    public void setTp_visivel(Character tp_visivel) {
        this.tp_visivel = tp_visivel;
    }

    /**
     * @return the nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * @param nick the nick to set
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the funcao_do_funcionario
     */
    public Funcao getFuncao_do_funcionario() {
        return funcao_do_funcionario;
    }

    /**
     * @param funcao_do_funcionario the funcao_do_funcionario to set
     */
    public void setFuncao_do_funcionario(Funcao funcao_do_funcionario) {
        this.funcao_do_funcionario = funcao_do_funcionario;
    }

    /**
     * @return the endereco_do_funcionario
     */
    public Endereco getEndereco_do_funcionario() {
        return endereco_do_funcionario;
    }

    /**
     * @param endereco_do_funcionario the endereco_do_funcionario to set
     */
    public void setEndereco_do_funcionario(Endereco endereco_do_funcionario) {
        this.endereco_do_funcionario = endereco_do_funcionario;
    }

    @Column (name = "nick")
    private String nick;
    @Column (name = "nm_nome")
    private String nome;
    @Column (name = "ds_senha")
    private String senha;
    @Column
    private Funcao funcao_do_funcionario;
    @Column(name = "funcao_cd_funcao")
    @OneToMany(targetEntity = Funcionario.class, fetch = FetchType.EAGER)
    private Endereco endereco_do_funcionario;
    @Column(name = "endereco_cd_endereco")
    @OneToMany(targetEntity = Funcionario.class, fetch = FetchType.EAGER)
    private Character tp_visivel;
    
     //cd_funcionario integer NOT NULL,
 // funcao_cd_funcao integer,//
  //endereco_cd_endereco integer,//
  //nm_funcionario character varying(100),
 // ds_senha character varying(20),
 // nick character varying(30),
 // tp_invisivel character(1),//
}
