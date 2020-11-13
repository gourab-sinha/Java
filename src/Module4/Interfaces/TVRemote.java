package Module4.Interfaces;

import java.util.ArrayList;
import java.util.List;

public class TVRemote extends Remote {
    private int currentChannel = 0;
    private int currentVolume = 0;
    private ArrayList<String> detail = new ArrayList<>();
    @Override
    public ArrayList<String> control(ButtonType buttonType) {
        switch (buttonType){
            case Up:
                nextChannel();
                break;
            case Down:
                previousChannel();
                break;
            case Right:
                increaseVolume();
                break;
            case Left:
                decreaseVolume();
                break;
        }

        if(detail.isEmpty()){
            detail.add(this.currentChannel+"");
            detail.add(this.currentVolume+"");
        }
        else{
            detail.set(0,this.currentChannel+"");
            detail.set(1,this.currentVolume+"");
        }
        return detail;
    }

    public int getCurrentVolume(){
        return this.currentVolume;
    }

    public int getCurrentChannel(){
        return this.currentChannel;
    }

    private void increaseVolume(){
        if(this.currentVolume + 1<=100){
            this.currentVolume+=1;
        }
    }

    private void decreaseVolume(){
        if(this.currentVolume - 1>=0){
            this.currentVolume-=1;
        }
    }

    private void nextChannel(){
        if (this.currentChannel + 1 <= 1000){
            this.currentChannel += 1;
        }
    }

    private void previousChannel(){
        if (this.currentChannel - 1 >= 1){
            this.currentChannel -= 1;
        }
    }
}
