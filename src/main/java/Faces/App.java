package Faces;

/**
 * Hello world!
 *
 */
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import ImageUtils.ImageUtil;
import com.github.sarxos.webcam.Webcam;
import ImageUtils.ImageUtil.*;



public class App
{
   public static void main(String args[]) throws IOException {
       System.out.println("hello");
       Webcam webcam = Webcam.getDefault();
       webcam.setViewSize(new Dimension(640, 480));
       webcam.open();
       BufferedImage img=webcam.getImage();
       ImageIO.write(webcam.getImage(), "PNG", new File("picture.png"));
       System.out.println("Snapshot taken from cam and stored at "+new File("").getAbsolutePath()+"\\picture.png");

       BufferedImage img2 = ImageIO.read(new File("D:\\workspace\\Recognition\\picture.png"));
       BufferedImage img3 = ImageIO.read(new File("D:\\workspace\\Recognition\\dog.png"));
       BufferedImage newImg;
       String imgstr;
       String imgstr3;
       imgstr = ImageUtil.encodeToString(img2, "png");
       imgstr3 = ImageUtil.encodeToString(img3, "png");
       //imgstr.replaceFirst("^.*;base64,", "");
       //imgstr.replaceFirst("^.*;base64,", "");

       System.out.println("test :"+imgstr.equalsIgnoreCase(imgstr3));
       newImg = ImageUtil.decodeToImage(imgstr);
       ImageIO.write(newImg, "png", new File("D:\\workspace\\Recognition\\CopyOfTestImage.png"));
        /* Test image to string and string to image finish */

   }
}
