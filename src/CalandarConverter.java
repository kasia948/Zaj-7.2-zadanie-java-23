public class CalandarConverter {
    static final int MONDAY=1;
    static final int THUSDAY=2;
    static final int WENDSDAY=3;
    static final int THRUSDAY=4;
    static final int FRIDAY=5;
    static final int SATURDAY=6;
    static final int SUNDAY=7;

   static String convertDayToString(int dayNumber){

        String day= "Poniedziałek";

        switch(dayNumber){
            case MONDAY:
                day="Poniedziałek";
                break;
            case THUSDAY:
                day = "Wtorek";
                break;
            case WENDSDAY:
                day = "Sroda";
                break;
            case THRUSDAY:
                day = "Czwartek";
                break;
            case FRIDAY:
                day = "Piątek";
                break;
            case SATURDAY:
                day = "Sobota";
                break;
            case SUNDAY:
                day = "Niedziela";
                break;
        }
        return day;
    }
}