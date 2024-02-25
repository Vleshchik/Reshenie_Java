package ru.spb.reshenie.javatasks.collections;

/*
Реализовать список MegaList на основе ArrayList с возможностью:
- фильтрации - void filter( <предикат> ) { ... }
- получения нового отфильтрованного списка MegaList filtered( <предикат> ) { ... }
- обхода - void visit( <посетитель> )
- отслеживания изменений списка - addListener( <обработчик события изменения списка> )
 */
import javafx.collections.ListChangeListener;
import java.util.*;
import java.util.function.*;

public class MegaList<T> extends ArrayList<T> {
    private List<ListChangeListener<T>> listeners = new ArrayList<>();
    public MegaList(List<T> list) {
        super(list);
    }

    public void filter(Predicate<T> predicate) {
        removeIf(predicate.negate());
    }

    public MegaList<T> filtered(Predicate<T> predicate) {
        MegaList<T> filteredList = new MegaList<>(this);
        filteredList.filter(predicate);
        return filteredList;
    }

    public void visit(Consumer<T> visitor) {
        forEach(visitor);
    }


    public void addListener(ListChangeListener<T> listener) {
        listeners.add(listener);
    }

}
