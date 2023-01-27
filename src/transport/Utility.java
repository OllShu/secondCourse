package transport;

import java.util.regex.Pattern;

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

    // здесь пыталась сделать проверку рег.номера на корректность,
    // запуталась с регулярными выражениями
    // в итоге у меня все считает некорректным

     public static String checkRegistrationNumber (String parameter) {
        checkParameters(parameter);

        if (Pattern.matches("[а-яА-Я]{1}[0-9]{3}[а-яА-Я]{3}", parameter)) {
            return parameter;
        } else
            System.out.println("Номер некорректный");
            return "номер некорректный";

    }

    public static String settingTheSeason (String month) {
        String season="";
        if (month == "декабрь" || month == "январь" || month == "февраль") season="зима";
        else if (month == "март" || month == "апрель" || month == "май" || month == "июнь" || month == "июль"
                || month == "август" || month == "август" || month == "сентябрь" || month == "октябрь"
                || month == "ноябрь") season="лето";
        else System.out.println("Месяц введен неверно");
        return season;
    }

    public static void changeTiresForSeasons (String month, boolean winterTires){
        String value = settingTheSeason(month);
        if (value=="лето" && winterTires==true)
            System.out.println("Вам нужно сменить шины на сезонные - летние");
        else if (value=="зима" && winterTires==false) {
            System.out.println("Вам нужно сменить шины на сезонные - зимние");
        }
    }

    public static int checkMaxSpeed (int parameter) {
        if (parameter < 0 || parameter > 1000) {
            System.out.println("Значение максимальной скорости некорректно");
            parameter = 0;
        }
        else parameter = parameter;
        return parameter;
    }

}
