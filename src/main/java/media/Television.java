
package media;


public class Television {
    private int volume = 0;
    private int currentProgram = 1;
    private boolean turnOn;
    

    
    
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
   
    
    public void info() {
        System.out.println("Program na televizoru je: "+ this.getCurrentProgram());
        System.out.println("Jačina zvuka je: " + this.getVolume());
        System.out.println("Televizor je upaljen: "+ this.getTurnOn());
    }
}

   