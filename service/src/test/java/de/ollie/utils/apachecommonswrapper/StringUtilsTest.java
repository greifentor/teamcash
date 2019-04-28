package de.ollie.utils.apachecommonswrapper;

import org.junit.Test;

/**
 * Unit tests for class "StringUtils".
 *
 * @author ollie
 *
 */
public class StringUtilsTest {

	@Test(expected = UnsupportedOperationException.class)
	public void constructor_ThrowsAnException() {
		new StringUtils();
	}

}