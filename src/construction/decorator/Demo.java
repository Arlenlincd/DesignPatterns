package construction.decorator;

import construction.decorator.decorators.*;

/**
 * 装饰是一种结构设计模式， 允许你通过将对象放入特殊封装对象中来为原对象增加新的行为。
 * 装饰可通过以当前类或对象为参数的创建方法或构造函数来识别。
 */
/**
 * @ClassName: Demo
 * @Description: 加密和压缩装饰
 *                  最初的业务逻辑类仅能读取和写入纯文本的数据。
 *                  此后，我们创建了几个小的封装器类，以便在执行标准操作后添加新的行为。
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
