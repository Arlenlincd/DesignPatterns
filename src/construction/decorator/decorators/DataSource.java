package construction.decorator.decorators;

/**
 * @ClassName: DataSource
 * @Description: 定义了读取和写入操作的通用数据接口
 * @Author: arlin
 * @Date: 2021/6/27
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
