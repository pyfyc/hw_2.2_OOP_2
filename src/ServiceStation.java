public class ServiceStation {
    public void check(Car car) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            updateTyre(car);
            car.checkEngine();
        }
    }

    public void check(Bicycle bicycle) {
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            updateTyre(bicycle);
        }
    }

    public void check(Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            updateTyre(truck);
            truck.checkEngine();
            truck.checkTrailer();
        }
    }

    private void updateTyre(Vehicle vehicle) {
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
    }
}
