import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class CPUImageProcessing {
    public static void main(String[] args) {
        try {
            File input = new File("maa_Saraswati.jpg");
            if (!input.exists()) {
                throw new RuntimeException("Error: Input file not found!");
            }
            BufferedImage image = ImageIO.read(input);
            if (image == null) {
                throw new RuntimeException("Error: Unable to read image file!");
            }

            int width = image.getWidth();
            int height = image.getHeight();

            long startTime = System.nanoTime();

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    int pixel = image.getRGB(x, y);
                    int r = (pixel >> 16) & 0xFF;
                    int g = (pixel >> 8) & 0xFF;
                    int b = pixel & 0xFF;
                    int gray = (r + g + b) / 3;
                    int newPixel = (gray << 16) | (gray << 8) | gray;
                    image.setRGB(x, y, newPixel);
                }
            }

            long endTime = System.nanoTime();
            System.out.println("CPU Processing Time: " + (endTime - startTime) / 1e6 + " ms");

            File output = new File("maa_Saraswati.jpg");
            ImageIO.write(maa_Saraswati.jpg, "jpg", output);
            System.out.println("Output saved as output_cpu.jpg");
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}