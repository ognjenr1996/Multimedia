
package media;


public class Television {
    private int volume = 0;
    private int currentProgram = 1;
    private boolean turnOn = false;
    
    
    public int getVolume() {
        return this.volume;
    }
    
    public void setVolume(int newVolume) {
        this.volume = newVolume;
    }
    
    
    public int getCurrentProgram() {
        return this.currentProgram;
    }
    
    public void setCurrentProgram(int newcurrentProgram) {
        this.currentProgram = newcurrentProgram;
    }
    
    
    public boolean getTurnOn() {
        return this.turnOn;
    }
    
    public void setTurnOn(boolean newturnOn) {
        this.turnOn = newturnOn;
    }
}

   