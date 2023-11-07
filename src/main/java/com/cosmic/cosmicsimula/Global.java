package com.cosmic.cosmicsimula;
import javafx.stage.Screen;


/**
 * The Global class contains global data and constants used throughout the application.
 * It groups all data that needs to be accessed globally.
 */
public class Global {

    /**
     * The width of the game window.
     */
    final public static double widgetWidth = (int) Screen.getPrimary().getBounds().getWidth();

    /**
     * The height of the game window.
     */
    final public static double widgetHeight = (int) Screen.getPrimary().getBounds().getHeight();
}
