package creation.builder;

import creation.builder.builders.CarBuilder;
import creation.builder.builders.CarManualBuilder;
import creation.builder.cars.Car;
import creation.builder.cars.Manual;
import creation.builder.components.Director;

/**
 * 建造者模式是一种创建型设计模式， 使你能够分步骤创建复杂对象。
 */
/**
 * @ClassName: Demo
 * @Description: 分步制造汽车
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
