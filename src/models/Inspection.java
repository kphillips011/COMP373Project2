public class Inspection extends Reservation {

    boolean passed;

    public Inspection() { 
        super(); 
        this.passed = true;
    }

    public void passInspection() { this.passed = true; }

    public void failInspection() { this.passed = false;}
}