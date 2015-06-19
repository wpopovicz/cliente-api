/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ligueTelecom.Bean;


import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author popovicz
 */
//@Entity
//@Table(name = "QUARTO")
@XmlRootElement
public class Quarto{ //implements Serializable {

   // @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
   // @Column(length = 10, nullable = false, unique = true)
    private Long id;
    private String nome;
    private String custo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCusto() {
        return custo;
    }

    public void setCusto(String custo) {
        this.custo = custo;
    }

    public Quarto() {
    }

    @Override
    public String toString() {
        return "Quarto{" + "id=" + id + ", nome=" + nome + ", custo=" + custo + '}';
    }

}
