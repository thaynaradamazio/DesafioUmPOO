package classes;

import java.util.InputMismatchException;

public class Aeronave {
    private String letrasCodigoId;
    private String modelo;
    private int numerosCodigoId;
    private Piloto piloto;

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Aeronave(String codigoId, String modelo) {
        setCodigoId(codigoId);
        this.modelo = modelo;
    }

    public Aeronave(String codigoId, String modelo, Piloto pil) {
        setCodigoId(codigoId);
        this.modelo = modelo;
        setPiloto(piloto);
        piloto.setAviao(this);
    }
  
    public String getCodigoId() {
        if(letrasCodigoId == null) {
            return letrasCodigoId;
        } else {
            return letrasCodigoId + numerosCodigoId;
        }
    }

    public void setCodigoId(String codigoId) {
        if(codigoId != null && codigoId.matches("[A-Z]{3}\\d{4}")) {
            letrasCodigoId = codigoId.substring(0, 3);
            numerosCodigoId = Integer.parseInt(codigoId.substring(3));
        } else {
            throw new InputMismatchException("O código de identificação precisa de 3 letras e 4 números");
        }

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}

