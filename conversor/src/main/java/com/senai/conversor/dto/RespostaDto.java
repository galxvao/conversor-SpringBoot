package com.senai.conversor.dto;


public class RespostaDto {
    private Integer valorOriginal;
    private String tipoConversao;
    private Integer valorConvertido;

    public Integer getValorOriginal() {
        return valorOriginal;
    }

    public void setValorOriginal(Integer valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public String getTipoConversao() {
        return tipoConversao;
    }

    public void setTipoConversao(String tipoConversao) {
        this.tipoConversao = tipoConversao;
    }

    public Integer getValorConvertido() {
        return valorConvertido;
    }

    public void setValorConvertido(Integer valorConvertido) {
        this.valorConvertido = valorConvertido;
    }
}
