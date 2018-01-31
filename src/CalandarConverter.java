public class CalandarConverter {
    int MONDAY=1;
    int THUSDAY=2;
    int WENDSDAY=3;
    int THRUSDAY=4;
    int FRIDAY=5;
    int SATURDAY=6;
    int SUNDAY=7;



   static String convertDayToString(int dayNumber){

        String day= "Poniedziałek";

        switch(dayNumber){
            case 1:
                day="Poniedziałek";
                break;
            case 2:
                day = "Wtorek";
                break;
            case 3:
                day = "Sroda";
                break;
            case 4:
                day = "Czwartek";
                break;
            case 5:
                day = "Piątek";
                break;
            case 6:
                day = "Sobota";
                break;
            case 7:
                day = "Niedziela";
                break;
        }
        return day;
    }
}
