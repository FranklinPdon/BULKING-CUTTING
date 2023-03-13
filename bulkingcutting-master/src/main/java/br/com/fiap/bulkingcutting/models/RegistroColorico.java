package br.com.fiap.bulkingcutting.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RegistroColorico {

    private Tipo tipo; // Enum momentaneo 
    private String descricao;
    private LocalDate data;
    private BigDecimal calorias;


    public RegistroColorico(Tipo tipo, String descricao, LocalDate data, BigDecimal calorias) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.data = data;
        this.calorias = calorias;
    }


    public Tipo getTipo() {
        return tipo;
    }


    public String getDescricao() {
        return descricao;
    }


    public LocalDate getData() {
        return data;
    }


    public BigDecimal getCalorias() {
        return calorias;
    }


    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public void setData(LocalDate data) {
        this.data = data;
    }


    public void setCalorias(BigDecimal calorias) {
        this.calorias = calorias;
    }


   


    
    
    
    

    
}