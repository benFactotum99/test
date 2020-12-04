package auto;

import oggetti.OggettoLanciato;
import optional.Optional;


public abstract class Veicolo {

    private String targa;
    private String marca;
    private String modello;

    public Veicolo(String targa, String marca, String modello){
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
    }

    public String getTarga(){
        return targa;
    }

    public String getMarca(){
        return marca;
    }

    public String getModello(){
        return modello;
    }

    public abstract int getNumOptional();
    public abstract void setNumOptional(int numOptional);
    public abstract void setOptional(Optional optional);

    public String toString() {
        return "\ntarga: " + this.getTarga() +
                "\nmarca: " + this.getMarca() +
                "\nmodello: " + this.getModello();
    }
}
