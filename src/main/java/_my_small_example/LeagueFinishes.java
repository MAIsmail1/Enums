package _my_small_example;

public class LeagueFinishes {

    public static void main(String[] args) {
        Football football = Football.EIGHTH;

        if (football == Football.FIRST){
            System.out.println("Congrats, you have won the title and qualified for the UCL group stages!");
        }

        switch (football){
            case FIRST:
                System.out.println("Congrats, you have won the title and qualified for the UCL group stages!");
                break;
            case SECOND:
                System.out.println("Unlucky with the title challenge. You have qualified for the UCL group stages!");
                break;
            case THIRD:
                System.out.println("Congrats, you have qualified for the UCL group stages!");
                break;
            case FOURTH:
                System.out.println("Congrats, you have qualified for the UCL qualifying round!");
                break;
            case FIFTH:
                System.out.println("Congrats, you have qualified for the UEL group stages!");
                break;
            case SIXTH:
                System.out.println("Congrats, you have qualified for the UEL qualifying round!");
                break;
            case SEVENTH:
                System.out.println("Congrats, you have qualified for the UEFA Conference League group stages!");
                break;
            default:
                System.out.println("Sorry, you have not qualified for a European competition!");
        }
    }

}
