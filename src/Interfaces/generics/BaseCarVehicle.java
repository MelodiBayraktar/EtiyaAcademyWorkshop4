package Interfaces.generics;

public class BaseCarVehicle<TEntity> implements Vehicle<TEntity> {
    @Override
    public void start(TEntity entity) {
        System.out.println("Car started");
    }

    @Override
    public void stop(TEntity entity) {
        System.out.println("Car stopped");
    }
}
