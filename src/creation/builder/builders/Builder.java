package creation.builder.builders;

import creation.builder.cars.CarType;
import creation.builder.components.Engine;
import creation.builder.components.GPSNavigator;
import creation.builder.components.Transmission;
import creation.builder.components.TripComputer;

/**
 * @ClassName: Builder
 * @Description: 通用生成器接口
 * @Author: arlin
 * @Date: 2021/6/27
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
