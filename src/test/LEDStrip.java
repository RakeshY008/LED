package test;

public class LEDStrip {

    private LED[] ledStrip;

    private int lengthOfStrip(){
        return ledStrip.length;
    }
    private int numberOfDefectiveLEDs(){
        int counter = 0;
        for (LED led: ledStrip){
            if(led.isWorking() == false){
                counter ++;
            }
        }
        return counter;
    }


    public LEDStrip(LED[] ledStrip){
        this.ledStrip = ledStrip;
    }

    public LED[] getLedStrip() {
        return ledStrip;
    }
    public void setLedStrip(LED[] ledStrip) {
        this.ledStrip = ledStrip;
    }

}
