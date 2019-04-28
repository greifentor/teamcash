package de.ollie.utils.apachecommonswrapper;

/**
 * A wrapper for the apache commons frame work.
 *
 * @author ollie
 *
 */
public class StringUtils {

	StringUtils() {
		throw new UnsupportedOperationException("should not be instantiated.");
	}

	/**
	 * Calls the StringUtils.left method.
	 */
	public static String left(String s, int len) {
		return org.apache.commons.lang3.StringUtils.left(s, len);
	}

	/**
	 * Calls the StringUtils.rightPad method.
	 */
	public static String rightPad(String s, int padding) {
		return org.apache.commons.lang3.StringUtils.rightPad(s, padding);
	}

}