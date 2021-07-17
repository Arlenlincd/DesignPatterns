package construction.facade.media_library;

/**
 * @ClassName: VideoFile
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1);
    }

    public String getCodecType() {
        return codecType;
    }

    public String getName() {
        return name;
    }
}
