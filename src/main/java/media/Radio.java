
package media;


public class Radio {
    private double fmFrequency;
    private int amFrequency;
    private char band = 'F';
    
    
    
    
    public Radio(double fmFrequency, int amFrequency, char band) {
        this.fmFrequency = fmFrequency;
        this.amFrequency = amFrequency;
        this.band = band;
    }

    
    
    
    public double getFmFrequency() {
        return this.fmFrequency;
    }
    
    public void setFmFrequency(double newfmFrequency) {
        this.fmFrequency = newfmFrequency;
    }
    
    
    public int getAmFrequency() {
        return this.amFrequency;
    }
    
    public void setAmFrequency(int newamFrequency) {
        this.amFrequency = newamFrequency;
    }
    
    
    public char getBand() {
        return this.band;
    }
    
    public void setBand(char newBend) {
        this.band = newBend;
    }
    
    
    public void radioInfo() {
         System.out.println("FM frequency is: " + this.getFmFrequency());
         System.out.println("AM frequency is: " + this.getAmFrequency());
         System.out.println("Band is: " + this.getBand());
    }
}
