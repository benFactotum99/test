package motori;

public class MotoreDisel extends Motore implements Motori {
    private final int costantePotDisel = 20;

    public MotoreDisel(String modello, String marca, double cilindrata, double cilindri){
        super(modello, marca, cilindrata, cilindri);

    }

    public double getPotenza(){
        return super.getCilindrata() / super.getCilindri() / costantePotDisel;
    }

    @Override
    public String toString(){
        return "\nMotore: disel\n" + super.toString() + "\npotenza: " + this.getPotenza();
    }
}
