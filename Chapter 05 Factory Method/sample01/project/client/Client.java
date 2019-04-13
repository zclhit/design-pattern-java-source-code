package sample01.project.client;

import sample01.project.ImageReader;
import sample01.project.ImageReaderFactory;
import sample01.XMLUtil;

public class Client {
    public static void main(String args[])
    {
        try
        {
            ImageReader ir;
            ImageReaderFactory irf;
            irf = (ImageReaderFactory) XMLUtil.getBean("ImageReaderFactory");
            ir = irf.getReader();
            ir.readImage();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
