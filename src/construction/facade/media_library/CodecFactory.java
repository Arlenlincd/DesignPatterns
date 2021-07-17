package construction.facade.media_library;

/**
 * @ClassName: CodecFactory
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        }
        else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
