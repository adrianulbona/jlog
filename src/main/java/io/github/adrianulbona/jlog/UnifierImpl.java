package io.github.adrianulbona.jlog;

import java.util.Optional;

/**
 * Created by adrianulbona on 04/11/2017.
 */
public class UnifierImpl<V> implements Unifier<V> {

	@Override
	public Optional<Unification<V>> apply(Optional<V> left, Optional<V> right) {
		if (!left.isPresent() && !right.isPresent()) {
			return Optional.empty();
		}
		if (!left.isPresent()) {
			return Optional.of(new Unification<>(right, right));
		}
		if (!right.isPresent()) {
			return Optional.of(new Unification<>(left, left));
		}
		return left.flatMap(valueLeft -> right.filter(valueLeft::equals)
				.map(__ -> new Unification<>(left, right)));
	}
}
