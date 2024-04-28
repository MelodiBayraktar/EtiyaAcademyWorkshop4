package Interfaces.generics;

public interface Vehicle<TEntity> {
    void start(TEntity entity);
    void stop(TEntity entity);
}
