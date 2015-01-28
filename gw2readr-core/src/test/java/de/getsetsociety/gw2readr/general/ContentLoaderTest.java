package de.getsetsociety.gw2readr.general;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContentLoaderTest {

	@Test
	public void testMaskingControlSequences() {
		assertEquals("\\n", ContentLoader.maskControlSequences("\n"));
	}

}
