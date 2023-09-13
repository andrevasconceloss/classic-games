package br.dev.vasconcelos.classicgames.util;

import java.util.logging.Logger;

public class Log {

    private static String getClassName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        if (stackTraceElements.length > 3) {
            return stackTraceElements[3].getClassName();
        }
        return "Classe Desconhecida";
    }

    public static void info(String mensagem) {
        Logger.getLogger(getClassName()).info(mensagem);
    }

    public static void warning(String mensagem) {
        Logger.getLogger(getClassName()).warning(mensagem);
    }

    public static void severe(String mensagem) {
        Logger.getLogger(getClassName()).severe(mensagem);
    }

    public static void finest(String mensagem) {
        Logger.getLogger(getClassName()).finest(mensagem);
    }

    public static void finer(String mensagem) {
        Logger.getLogger(getClassName()).finer(mensagem);
    }

    public static void fine(String mensagem) {
        Logger.getLogger(getClassName()).fine(mensagem);
    }

    public static void config(String mensagem) {
        Logger.getLogger(getClassName()).config(mensagem);
    }

}
