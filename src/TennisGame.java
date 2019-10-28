public class TennisGame {
    public static final int love =0;
    public static final int fiffteen =1;
    public static final int thirty =2;
    public static final int fourty =3;
    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int tempScore=0;
        if (player1Score==player2Score)
        {
            switch (player1Score)
            {
                case love:
                    score = "Love-All";
                    break;
                case fiffteen:
                    score = "Fifteen-All";
                    break;
                case thirty:
                    score = "Thirty-All";
                    break;
                case fourty:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (player1Score>=4 || player2Score>=4)
        {
            int minusResult = player1Score-player2Score;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = player1Score;
                else { score+="-"; tempScore = player2Score;}
                switch(tempScore)
                {
                    case love:
                        score+="Love";
                        break;
                    case fiffteen:
                        score+="Fifteen";
                        break;
                    case thirty:
                        score+="Thirty";
                        break;
                    case fourty:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}
