package day53_FunctionalInterface.practices.task1;


import java.util.List;

@FunctionalInterface
public interface ListFunction<T,R> {
    R apply(List<T> list);
}

