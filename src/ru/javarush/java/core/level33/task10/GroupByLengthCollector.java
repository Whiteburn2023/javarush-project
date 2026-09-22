package ru.javarush.java.core.level33.task10;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class GroupByLengthCollector implements Collector<String, Map<Integer, List<String>>, Map<Integer, List<String>>> {

    //supplier — создаёт новый контейнер для сбора элементов (например, новый список или карту)
    @Override
    public Supplier<Map<Integer, List<String>>> supplier() {
        return HashMap::new;
    }

    //accumulator — добавляет очередной элемент в контейнер.
    @Override
    public BiConsumer<Map<Integer, List<String>>, String> accumulator() {
        return (map, s) -> map
                .computeIfAbsent(s.length(), k -> new ArrayList<>())
                .add(s);
    }

    //combiner — объединяет два контейнера (важно для параллельных стримов!).
    @Override
    public BinaryOperator<Map<Integer, List<String>>> combiner() {
        return (map1, map2) -> {
            map2.forEach((key, list) ->
                    map1.merge(key, list, (a, b) -> {
                        a.addAll(b);
                        return a;
                    }));
            return map1;
        };
    }

    //finisher — превращает контейнер в итоговый результат (например, делает его неизменяемым или преобразует в другой тип).
    @Override
    public Function<Map<Integer, List<String>>, Map<Integer, List<String>>> finisher() {
        return Function.identity();
    }

    //characteristics — набор флагов, описывающих свойства коллектора (например, поддерживает ли параллелизм, изменяет ли тип результата и т. д.).
    @Override
    public Set<Characteristics> characteristics() {
        return Set.of(Characteristics.IDENTITY_FINISH);
    }
}
