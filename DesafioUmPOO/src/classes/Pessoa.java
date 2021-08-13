package classes;

import java.util.InputMismatchException;

public abstract class Pessoa {
    
    private String nome;
    private String cpf;
    private String rg;
    private char sexo;
    
    public Pessoa(String nome, String cpf, String rg){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    public Pessoa(){
        
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null && cpf.matches("\\d{11}")) {
            this.cpf = cpf;
        } else {
            throw new InputMismatchException("O CPF deve ter 11 dígitos");
        }
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        if (cpf != null && cpf.matches("\\d{9}")) {
            this.rg = rg;
        } else {
            throw new InputMismatchException("O RG precisa ter 9 dígitos");
        }
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if ("MmFf".indexOf(sexo) > -1) {
            this.sexo = sexo;
        } else {
            throw new InputMismatchException("Sexo deve ser M ou F");
        }
    }
    
    public String getCpfFormatado() {
        if (cpf != null) {
            return cpf.substring(0, 3) + "." +
                   cpf.substring(3, 6) + "." +
                   cpf.substring(6, 9) + "-" +
                   cpf.substring(9);
        } else {
            return null;
        }
    }

    public String getRgFormatado() {
        if (rg != null) {
            return rg.substring(0, 2) + "." +
                   rg.substring(2, 5) + "." +
                   rg.substring(5, 8) + "-" +
                   rg.substring(8);
        } else {
            return null;
        }
    }
    

    public abstract String cumprimentar();
}
