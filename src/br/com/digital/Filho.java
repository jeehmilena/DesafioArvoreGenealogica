package br.com.digital;

public class Filho {

    private String pai;
    private String mae;
    private String nome;
    private String sexo;


    public Filho(String nomeMae, String nomePai, String nomeFilho){
        mae = nomeMae;
        pai = nomePai;
        nome = nomeFilho;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
