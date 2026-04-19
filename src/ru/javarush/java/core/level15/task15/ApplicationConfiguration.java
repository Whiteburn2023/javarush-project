package ru.javarush.java.core.level15.task15;

public class ApplicationConfiguration {
    public static final String APPLICATION_DEFAULT_LANGUAGE;

    static {
        String lang = System.getenv("APP_LANG");
        if (System.getenv("APP_LANG") != null){
            APPLICATION_DEFAULT_LANGUAGE = lang;
        } else {
            APPLICATION_DEFAULT_LANGUAGE = "en";
        }

    }
}
