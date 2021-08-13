package programas;

import classes.Aeronave;
import classes.Piloto;

public class AppAeronave {
    public static void main(String[] args) {
        Piloto piloto = new Piloto("Thaynara","12345678911","111222333");
        Aeronave aeronave = new Aeronave("ABC1234","AirBoing",piloto);
        
        System.out.printf("O avião do capitão %s , de código de identificação %s , do modelo %s está decolando!.\n", piloto.getNome(), aeronave.getCodigoId(), aeronave.getModelo());
       
    }
}
