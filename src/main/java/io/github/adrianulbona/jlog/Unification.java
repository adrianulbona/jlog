package io.github.adrianulbona.jlog;

import lombok.Data;

import java.util.Optional;

/**
 * Created by adrianulbona on 04/11/2017.
 */
@Data
public class Unification<V> {

	private final Optional<V> left;
	private final Optional<V> right;
}
