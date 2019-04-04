package mate.academy.homeWork1.homeEx1;

public class Score {
    public static void main(String[] args) {

        System.out.println(matchResult(2, 0, 2, 0));

        System.out.println(matchResult(2, 0, 1, 0));

        System.out.println(matchResult(0, 2, 2, 0));

    }

    private static int matchResult(int firstTeamScore, int secondTeamScore, int firstRate, int secondRate) {
        return (firstTeamScore == firstRate && secondTeamScore == secondRate)
                ? 2 : ((firstTeamScore > secondTeamScore && firstRate > secondRate)
                || (firstTeamScore < secondTeamScore && firstRate < secondRate))
                ? 1 : 0;
    }
}
