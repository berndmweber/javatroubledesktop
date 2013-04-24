/**
 * @file:   com.innovail.trouble.core - JavaTroubleDesktopApplication.java
 * @date:   Feb 26, 2012
 * @author: bweber
 */
package com.innovail.trouble.dektop.core;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import com.innovail.trouble.core.JavaTroubleApplication;

/**
 * 
 */
public class JavaTroubleDesktopApplication {

    /**
     * @param args
     */
    public static void main (String[] args) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title   = "JavaTrouble";
        cfg.useGL20 = false;
        cfg.width   = 1280;
        cfg.height  = 755;
        
        new LwjglApplication(new JavaTroubleApplication(), cfg);
    }

}
