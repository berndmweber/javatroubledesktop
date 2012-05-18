/**
 * @file:   com.innovail.trouble.core - JavaTroubleDesktopApplication.java
 * @date:   Feb 26, 2012
 * @author: bweber
 */
package com.innovail.trouble.dektop.core;

import com.badlogic.gdx.backends.jogl.JoglApplication;

import com.innovail.trouble.core.JavaTroubleApplication;

/**
 * 
 */
public class JavaTroubleDesktopApplication {

    /**
     * @param args
     */
    public static void main (String[] args) {
        new JoglApplication(new JavaTroubleApplication(), "Trouble", 1280, 755, false);
    }

}
