package construction.decorator.decorators;

/**
 * @ClassName: DataSourceDecorator
 * @Description: 抽象基础装饰
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
