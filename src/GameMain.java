import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameMain {
    public static void main(String[ ] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
}
class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    public void getWinner(){
        int ganador= Collections.max(players.values());
        for(Map.Entry<String,Integer> entrada : players.entrySet()){
            if(ganador==entrada.getValue()) System.out.println(entrada.getKey());

        }
        
    }

}