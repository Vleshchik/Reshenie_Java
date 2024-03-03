package ru.spb.reshenie.javatasks.files;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ScreenCaptureExample {
    public static void captureScreen(String filePath) {
        try {
            Robot robot = new Robot();
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
            ImageIO.write(screenFullImage, "png", new File(filePath));
        } catch (AWTException | IOException e) {
            e.printStackTrace();
        }
    }
}