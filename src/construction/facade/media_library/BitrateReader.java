package construction.facade.media_library;

/**
 * @ClassName: BitrateReader
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: writing file...");
        return buffer;
    }
}
