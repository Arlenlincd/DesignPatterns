package creation.builder.builders;

import creation.builder.cars.CarType;
import creation.builder.cars.Manual;
import creation.builder.components.Engine;
import creation.builder.components.GPSNavigator;
import creation.builder.components.Transmission;
import creation.builder.components.TripComputer;

/**
 * @ClassName: CarManualBuilder
 * @Description: 汽车手册生成器
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class CarManualBuilder implements Builder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}