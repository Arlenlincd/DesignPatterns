package construction.proxy;

import construction.proxy.downloader.YouTubeDownloader;
import construction.proxy.media_library.ThirdPartyYouTubeClass;
import construction.proxy.proxy.YouTubeCacheProxy;

/**
 * 代理模式是一种结构型设计模式， 让你能够提供对象的替代品或其占位符。
 * 代理控制着对于原对象的访问， 并允许在将请求提交给对象前后进行一些处理。
 */
/**
 * @ClassName: Demo
 * @Description: 缓存代理
 * @Author: arlin
 * @Date: 2021/6/28
 */
public class Demo {

    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
