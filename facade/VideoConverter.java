import java.io.File;
import java.nio.Buffer;

public class VideoConverter {
    public File convert(String filename, String format)
    {   MPEG4CompressionCodec destinationCodec1;
        OggCompressionCodec destinationCodec2;

        VideoFile file=new VideoFile(filename);
        CodecFactory sourceCodec=new CodecFactory.extract(file);
        if(format.equals("mp4"))
             destinationCodec1=new MPEG4CompressionCodec();
        else
            destinationCodec2=new OggCompressionCodec();

        String buffer=BitrateReader.read(filename,sourceCodec);
        File result= new File(BitrateReader.read(filename, sourceCodec));
        result=(new AudioMixer()).fix(result);
        System.out.println(filename+" with "+format+" format "+"is saved");
        return new File(String.valueOf(result));

    }

    public String save(File filename,String format)
    {
        System.out.println(filename+"saved!");
        return format;
    }
}
