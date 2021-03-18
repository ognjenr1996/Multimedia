
package media;


public class Radio {
    private double fmFrequency;
    private int amFrequency;
    private char band = 'F';
    
    
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
    
}
