
package main;

import media.Television;
import media.Radio;

public class Main {

   
    public static void main(String[] args) {
       Television samsung = new Television();
       samsung.setVolume(54);
       samsung.setCurrentProgram(43);
       samsung.setTurnOn(true);
       
       
       samsung.info();
       
       Radio tdi = new Radio(93.7, 400, 'F');

       tdi.radioInfo();
       
       
       Radio pink = new Radio(91.5, 600, 'A');
       
       pink.radioInfo();
       
       
       
    }
    
}
