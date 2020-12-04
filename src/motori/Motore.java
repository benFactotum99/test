package motori;

public abstract class Motore {

    private String modello;
    private String marca;
    private double cilindrata;
    private double cilindri;

    public Motore(String modello, String marca, double cilindrata, double cilindri){
        this.modello = modello;
        this.marca = marca;
        this.cilindrata = cilindrata;
        this.cilindri = cilindri;
    }

    public String getModello(){
        return modello;
    }

    public String getMarca(){
        return marca;
    }

    public double getCilindrata(){
        return cilindrata;
    }
    public double getCilindri(){
        return cilindri;
    }

    public abstract double getPotenza();

    public String toString(){
        return "\nmodello del motore: " + this.getModello() +
               "\nmarca del motore: " + this.getMarca() +
               "\ncilindrata: " + this.getCilindrata() +
               "\ncilindri: " + this.getCilindri();
    }

}
