package classes;

public class Passageiro extends Pessoa {
    private int passagemAerea;
    private int numPassaporte;

    public int getPassagemAerea() {
        return passagemAerea;
    }

    public void setCodigoCliente(int passagemAerea) {
        this.passagemAerea = passagemAerea;
    }

    public int getNumPassaporte() {
        return numPassaporte;
    }

    public void setNumPassaporte(int numPassaporte) {
        this.numPassaporte = numPassaporte;
    }

    @Override
    public String cumprimentar() {
        return "Olá capitão, obrigado!";
    }

}
