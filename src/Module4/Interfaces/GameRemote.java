package Module4.Interfaces;

import java.util.ArrayList;
import java.util.List;

public class GameRemote extends Remote{
    private int[][] board;
    private int x;
    private int y;
    private ArrayList<String> detail = new ArrayList<>();
    public GameRemote(){
        board = new int[3][3];
        this.x=0;
        this.y=0;
    }

    private void setX(int x) {
        if(this.x + x>=0 && this.x + x<3)
            this.x += x;
    }

    private void setY(int y) {
        if(this.y + y>=0 && this.y + y<3)
            this.y += y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public ArrayList<String> control(ButtonType buttonType) {
        switch (buttonType){
            case Up:
                setX(-1);
                break;
            case Down:
                setX(1);
                break;
            case Right:
                setY(1);
                break;
            case Left:
                setY(-1);
                break;
        }
        board[this.x][this.y] += 1;
        if(detail.isEmpty()){
            detail.add(board.toString());
        }
        else{
            detail.set(0, board.toString());
        }
        return detail;
    }
}
