package io.github.adrianulbona.jlog;

import java.util.Optional;
import java.util.function.BiFunction;

/**
 * Created by adrianulbona on 04/11/2017.
 */
public interface Unifier<V> extends BiFunction<Optional<V>, Optional<V>, Optional<Unification<V>>> {

}
