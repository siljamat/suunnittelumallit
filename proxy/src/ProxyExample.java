import java.util.ArrayList;
import java.util.List;

public class ProxyExample {
    public static void main(String[] arguments) {
        List<Image> photoLibrary = new ArrayList<>();

        photoLibrary.add(new ProxyImage("HiRes_10MB_Photo1"));
        photoLibrary.add(new ProxyImage("HiRes_10MB_Photo2"));
        photoLibrary.add(new ProxyImage("LowRes_2MB_Photo"));

        // Print information about the contents of the photo folder
        System.out.println("Contents of the photo folder:");
        for (Image image : photoLibrary) {
            image.showData();
        }

        // Browse the photos folder and display the images (loaded if needed)
        System.out.println("Browse the photos folder:");
        for (Image image : photoLibrary) {
            image.displayImage();
        }
    }
}