package br.com.etecia.myapp;

public class Escuderia {
    //variáveis globais:
    private String titulo;
    private int imgCar;

    //criando construtor vazio
    public Escuderia() {
    }

    //criando o getter and setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImgCar() {
        return imgCar;
    }

    public void setImgCar(int imgCar) {
        this.imgCar = imgCar;
    }
}
