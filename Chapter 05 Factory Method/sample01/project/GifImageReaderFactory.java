package sample01.project;

public class GifImageReaderFactory implements ImageReaderFactory{
    @Override
    public ImageReader getReader(){
        System.out.println("gif image reader factory is producing gif image reader");
        return new GifImageReader();
    }
}
