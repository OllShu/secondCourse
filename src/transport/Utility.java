package transport;

public class Utility {
    private static String checkParameters (String parameter) {
        if (parameter == null || parameter.isEmpty()) parameter = "default";
        return parameter;
    }

    private static int checkYear (int parameter) {
        if (parameter <= 0) parameter = 2000;
        return parameter;
    }

    private static double checkEngineVolume(double parameter) {
        if (parameter <= 0) parameter = 1.5;
        return parameter;
    }
}
