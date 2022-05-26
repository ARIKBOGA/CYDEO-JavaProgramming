package day53_FunctionalInterface.practices.task2;

@FunctionalInterface
public interface ArrayFunction<T, R> {
    R apply(T[] array);
}
