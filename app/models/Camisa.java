package models;

public class Camisa {
    private String cor;
    private String tamanho;
    private String tipo;
    private int codigoCamisa;

    public Camisa(String cor, String tamanho, String tipo, int codigoCamisa){
        this.cor = cor;
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.codigoCamisa = codigoCamisa;

    }

    public String getCor(){
        return cor;

    }

    public String getTamanho(){
        return tamanho;

    }

    public String getTipo(){
        return tipo;

    }

    public int getCodigoCamisa(){
        return codigoCamisa;

    }

    public void setCor(String cor){
        this.cor = cor;

    }

    public void setTamanho(String tamanho){
        this.tamanho = tamanho;

    }

    public void setTipo(String tipo){
        this.tipo = tipo;

    }

    public void setCodigoCamisa(int codigoCamisa){
        this.codigoCamisa = codigoCamisa;

    }

    public void exibirInfo(){
        System.out.println("Camisa:");
        System.out.println("Código: "+codigoCamisa);
        System.out.println("Cor: " +cor);
        System.out.println("Tamanho: " +tamanho);
        System.out.println("Tipo: " +tipo);
        System.out.println("-------------------------");
        
    }

    
}