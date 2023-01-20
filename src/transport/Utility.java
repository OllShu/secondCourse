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

    /*public static boolean checkWinterTires (int parameter) {
        if () parameter = 3;
        return parameter;
    }

     */
}
