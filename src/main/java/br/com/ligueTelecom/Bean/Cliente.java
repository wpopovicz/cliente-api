/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ligueTelecom.Bean;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author popovicz
 */
//@Entity
//@Table(name = "CLIENTE")
@XmlRootElement
public class Cliente implements Serializable {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(length = 10, nullable = false, unique = true)
    private int id;
    private String name;
    private String email;
    private String rg;
    private String cpf;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        this.name = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Cliente() {
    }

    public Cliente(int id, String name, String email, String rg, String cpf) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.rg = rg;
        this.cpf = cpf;
    }
    
    @Override
	public String toString() {
		StringBuilder cliente = new StringBuilder();
		cliente.append("{ ");
		cliente.append(getId());
		cliente.append(", ");
		cliente.append(getName());
		cliente.append(", ");
		cliente.append(getEmail());
		cliente.append(", ");
		cliente.append(getRg());
		cliente.append(", ");
                cliente.append(getCpf());
		cliente.append(" }");

		return cliente.toString();
	}    
    
}
