public class Bicycle extends AbstractVehicle {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void check() {
        System.out.println("Обслуживаем велосипед");
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }

}
