import java.util.*;

//Försök på att skapa highscore board. Måste anpassas till Astroban och implementeras.
public class ScoreBoard {

    public void createScoreBoard(){
        Players pl = new Players();
        pl.add(new Player("gr", "Player 1", 5));
        pl.add(new Player("gr", "Player 2", 3));
        pl.add(new Player("gr", "Player 3", 7));
        pl.add(new Player("gr", "Player 3", 7));

        pl.display();

        System.out.println("...... total moves ....." + pl.totalMoves());

        System.out.println("...... find player ....." + pl.getPlayer("Player 2"));

        System.out.println("...... No of players ....." + pl.getNumPlayers());

        System.out.println("......update score.....");
        pl.upDateScore("Player 1", 50);

        pl.display();

        System.out.println("players in a team......" + pl.getTeam("gr"));

    }
}




















        /*public void addPlayer(String, int){
            String playerName = " ";
            int highScore = 0;
            Player addPl = new Player(playerName, highScore);
           arrPlayers.add(addPl);

        }


        public List<String> getPlayers() {
            return this.players;
        }
        public boolean addPlayer(Player player){
            return this.addPlayer(player.getPlayerName());

        }
        //initialization for name of players
        Player namePl1 = new Player();
        player.getPlayerName().toString();




        TextView varPlayerName2 = (TextView) findViewById(R.id.text_NamePl2);
        String namePl2;
        namePl2 = varPlayerName2.getText().toString();

        TextView varPlayerName3 = (TextView) findViewById(R.id.text_NamePl3);
        String namePl3;
        namePl3 = varPlayerName3.getText().toString();

        TextView varPlayerName4 = (TextView) findViewById(R.id.text_NamePl4);
        String namePl4;
        namePl4 = varPlayerName4.getText().toString();

        TextView varPlayerName5 = (TextView) findViewById(R.id.text_NamePl5);
        String namePl5;
        namePl5 = varPlayerName5.getText().toString();

        //initialization of scores
        TextView varScorePlayer1 = (TextView) findViewById(R.id.text_ScorePl1);
        String t1;
        t1 = varScorePlayer1.getText().toString();

        TextView varScorePlayer2 = (TextView) findViewById(R.id.text_ScorePl2);
        String t2;
        t2 = varScorePlayer2.getText().toString();

        TextView varScorePlayer3 = (TextView) findViewById(R.id.text_ScorePl3);
        String t3;
        t3 = varScorePlayer3.getText().toString();

        TextView varScorePlayer4 = (TextView) findViewById(R.id.text_ScorePl4);
        String t4;
        t4 = varScorePlayer4.getText().toString();

        TextView varScorePlayer5 = (TextView) findViewById(R.id.text_ScorePl5);
        String t5;
        t5 = varScorePlayer5.getText().toString();


        //transformation scores into integer values
        int iScorePl1;
        iScorePl1 = Integer.parseInt(t1);

        int iScorePl2;
        iScorePl2 = Integer.parseInt(t2);

        int iScorePl3;
        iScorePl3 = Integer.parseInt(t3);

        int iScorePl4;
        iScorePl4 = Integer.parseInt(t4);

        int iScorePl5;
        iScorePl5 = Integer.parseInt(t5);


            //manually construct of the object array list
        arrPlayer.add(new Player(namePl1, iScorePl1));  //position 0
        arrPlayer.add(new Player(namePl2, iScorePl2));  //position 1
        arrPlayer.add(new Player(namePl3, iScorePl3));  //position 2
        arrPlayer.add(new Player(namePl4, iScorePl4));  //position 3
        arrPlayer.add(new Player(namePl5, iScorePl5));  //position 4

        Collections.sort(arrPlayer, new Comparator<Player>() {

            //the sort of the object list by their scores
            @Override
            public int compare(Player o1, Player o2) {
                return Integer.valueOf(o1.highScore).compareTo(o2.highScore);
            }

        });


        //here are displayed in the position place1 to place4 from bigger score to smaller score
        varPosition1.setText(String.valueOf(arrPlayer.get(4)));
        varPosition2.setText(String.valueOf(arrPlayer.get(3)));
        varPosition3.setText(String.valueOf(arrPlayer.get(2)));
        varPosition4.setText(String.valueOf(arrPlayer.get(1)));
        varPosition5.setText(String.valueOf(arrPlayer.get(0)));

        public void printHighScore(ArrayList<Player> arrPlayers){
            System.out.println("Using For Loop\n ");
            for (int i = 0; i < arrPlayers.size();i++)
            {
                System.out.println(arrPlayers.get(i));
            }

        }


    }//end button click
}*/

