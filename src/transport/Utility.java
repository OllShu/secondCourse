package transport;

public class Utility {
    public static String checkParameters (String parameter) {
        if (parameter == null || parameter.isBlank()) parameter = "default";
        return parameter;
    }

    public static int checkYear (int parameter) {
        if (parameter <= 0) parameter = 2000;
        return parameter;
    }

    public static double checkEngineVolume(double parameter) {
        if (parameter <= 0) parameter = 1.5;
        return parameter;
    }
    public static int checkNumberOfSeats (int parameter) {
        if (parameter < 3 || parameter>10) parameter = 3;
        return parameter;
    }
    public static String settingTheSeason (String month) {
        String season;
        checkingTheCorrectnessOfMonth(month);
        if (month == "декабрь" || month == "январь" || month == "февраль") season="зима";
        else season="лето";
        return season;
    }
    public static String checkingTheCorrectnessOfMonth (String month) {
        String[] monthOfYear = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август",
                "сентябрь", "октябрь", "ноябрь", "декабрь"};
        for (int i=0; i<monthOfYear.length; i++) {
            if (month!=monthOfYear[i]) System.out.println("Месяц введен неверно");
        }
        return month;
    }

    public static void changeTiresForSeasons (boolean value){

    }


}
