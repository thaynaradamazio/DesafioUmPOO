package classes;

public class Piloto extends Pessoa {
    private int cadastroDoPiloto;
    private String habilitacao;
    private Aeronave aviao;

    public Piloto(String nome, String cpf, String rg) {
        super(nome, cpf, rg);
    }

    public Piloto(String nome, String cpf, String rg, Aeronave aviao){
        super(nome, cpf, rg);
        this.aviao = aviao;
        this.aviao.setPiloto(this);
    }

    public int getCadastroDoPiloto() {
        return cadastroDoPiloto;
    }

    public void setCadastroDoPiloto(int cadastroDoPiloto) {
        this.cadastroDoPiloto = cadastroDoPiloto;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    public Aeronave getAviao() {
        return aviao;
    }

    public void setAviao(Aeronave aviao) {
        this.aviao = aviao;
    }

    @Override
    public String cumprimentar() {
        return "Bem vindo ao embarque, sou o capitão do seu vôo!";
    }
}