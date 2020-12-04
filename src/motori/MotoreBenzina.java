package motori;

public class MotoreBenzina extends Motore implements Motori {

    private final int costantePotBenzina = 10;

    public MotoreBenzina(String modello, String marca, double cilindrata, double cilindri){
        super(modello, marca, cilindrata, cilindri);

    }

    public double getPotenza(){
        return super.getCilindrata() / super.getCilindri() / costantePotBenzina;
    }

    @Override
    public String toString(){
        return "\nMotore: benzina" + super.toString() + "\npotenza: " + this.getPotenza();
    }


}
