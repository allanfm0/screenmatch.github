package br.com.screenmatch.model;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
public class Episodios {
    private Integer temporadas;
    private String titulo;
    private Integer numeroEpisodios;
    private Double avaliacao;
    private LocalDate dataLancamento;


    public Episodios(Integer numeroTemporadas, DadosEpisodio dadosEpisodio){
        this.temporadas = numeroTemporadas;
        this.titulo = dadosEpisodio.title();
        this.numeroEpisodios = dadosEpisodio.number();

        try {
            this.avaliacao = Double.valueOf(dadosEpisodio.rating());

        }catch (NumberFormatException ex){
            this.avaliacao = 0.0;
        }

        try {
            this.dataLancamento = LocalDate.parse(dadosEpisodio.released());
        }catch (DateTimeParseException ex){
            this.dataLancamento = null;
        }

    }

    public Integer getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Integer temporadas) {
        this.temporadas = temporadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(Integer numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString() {
        return "temporada = " + temporadas +
                ", titulo = '" + titulo + '\'' +
                ", numero de episodios = " + numeroEpisodios +
                ", avaliação = " + avaliacao +
                ", data de lançamento = " + dataLancamento;
    }
}
