package Module4.Interfaces;

public abstract class Remote implements Control{
    public boolean isOn;
    public Remote(){
        this.isOn=true;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean isOn() {
        return isOn;
    }

}
