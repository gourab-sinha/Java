package Module4;

import Module4.Interfaces.ButtonType;
import Module4.Interfaces.GameRemote;
import Module4.Interfaces.Remote;
import Module4.Interfaces.TVRemote;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Remote tvRemote = new TVRemote();

        System.out.println("TV Remote");
        ArrayList<String> detail = tvRemote.control(ButtonType.Down);
        for (String value: detail) {
            System.out.println(value);
        }
        tvRemote.control(ButtonType.Up);
        for (String value: detail) {
            System.out.println(value);
        }
        tvRemote.control(ButtonType.Down);
        for (String value: detail) {
            System.out.println(value);
        }
        tvRemote.setOn(false);

        System.out.println("Game Remote");
        Remote gameRemote = new GameRemote();
        detail= gameRemote.control(ButtonType.Down);
        System.out.println(detail.get(0));

        printData(gameRemote.control(ButtonType.Up).get(0));
        printData(gameRemote.control(ButtonType.Down).get(0));
        printData(gameRemote.control(ButtonType.Down).get(0));
        printData(gameRemote.control(ButtonType.Down).get(0));
        printData(gameRemote.control(ButtonType.Right).get(0));
        printData(gameRemote.control(ButtonType.Right).get(0));
        printData(gameRemote.control(ButtonType.Right).get(0));
    }

    public static void printData(String detail){
        System.out.println(detail);
    }
}
