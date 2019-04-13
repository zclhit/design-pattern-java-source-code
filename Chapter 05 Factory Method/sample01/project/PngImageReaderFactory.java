package sample01.project;

public class PngImageReaderFactory implements ImageReaderFactory {
    @Override
    public ImageReader getReader() {
        System.out.println("Png Image Reader Factory start product Image Reader");
        return new PngImageReader();
    }
}
