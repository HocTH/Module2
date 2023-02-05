package com.codegym;

public class TennisGame {

    public static final int equivalencePointFrom0 = 0;
    public static final int equivalencePointFrom1 = 1;
    public static final int equivalencePointFrom2 = 2;
    public static final int equivalencePointFrom3 = 3;

    public static String getScore(String nameFirstPlayer, String nameSecondPlayer, int scoreOfFirstPLayer, int scoreOfSecondPlayer) {
        String score = "";
        int tempScore= 0;
        if (scoreOfFirstPLayer==scoreOfSecondPlayer)
        {
            switch (scoreOfFirstPLayer)
            {
                case equivalencePointFrom0:
                    score = "Love-All";
                    break;
                case equivalencePointFrom1:
                    score = "Fifteen-All";
                    break;
                case equivalencePointFrom2:
                    score = "Thirty-All";
                    break;
                case equivalencePointFrom3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (scoreOfFirstPLayer>=4 || scoreOfSecondPlayer>=4)
        {
            int pointDifference = scoreOfFirstPLayer-scoreOfSecondPlayer;
            if (pointDifference==1) score ="Advantage player1";
            else if (pointDifference ==-1) score ="Advantage player2";
            else if (pointDifference>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = scoreOfFirstPLayer;
                else { score+="-"; tempScore = scoreOfSecondPlayer;}
                switch(tempScore)
                {
                    case equivalencePointFrom0:
                        score+="Love";
                        break;
                    case equivalencePointFrom1:
                        score+="Fifteen";
                        break;
                    case equivalencePointFrom2:
                        score+="Thirty";
                        break;
                    case equivalencePointFrom3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}