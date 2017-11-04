package io.github.adrianulbona.jlog;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by adrianulbona on 04/11/2017.
 */
public class UnifierImplTest {

	@Test
	public void testUnificationFails() throws Exception {
		final Optional<Object> left = Optional.of(new Object());
		final Optional<Object> right = Optional.of(new Object());
		final UnifierImpl<Object> unifier = new UnifierImpl<>();
		assertFalse(unifier.apply(left, right).isPresent());
	}

	@Test
	public void testUnificationPasses() throws Exception {
		final Object atom = new Object();
		final Optional<Object> left = Optional.of(atom);
		final Optional<Object> right = Optional.of(atom);
		final UnifierImpl<Object> unifier = new UnifierImpl<>();
		assertTrue(unifier.apply(left, right).isPresent());
	}

	@Test
	public void testUnificationPassesLeftEmpty() throws Exception {
		final Object atom = new Object();
		final Optional<Object> left = Optional.empty();
		final Optional<Object> right = Optional.of(atom);
		final UnifierImpl<Object> unifier = new UnifierImpl<>();
		assertTrue(unifier.apply(left, right).isPresent());
	}

	@Test
	public void testUnificationPassesRightEmpty() throws Exception {
		final Object atom = new Object();
		final Optional<Object> left = Optional.of(atom);
		final Optional<Object> right = Optional.empty();
		final UnifierImpl<Object> unifier = new UnifierImpl<>();
		assertTrue(unifier.apply(left, right).isPresent());
	}

	@Test
	public void testUnificationFailsBothEmpty() throws Exception {
		final Optional<Object> left = Optional.empty();
		final Optional<Object> right = Optional.empty();
		final UnifierImpl<Object> unifier = new UnifierImpl<>();
		assertFalse(unifier.apply(left, right).isPresent());
	}
}