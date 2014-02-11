package com.example.robolectricsample;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(manifest="../RobolectricSample/AndroidManifest.xml")
public class MainActivityTest {
	@Test
	public void testStringResource() throws Exception {
		// MainActivity activity 
		String actual = new MainActivity().getResources().getString(R.string.hello_world);
		assertThat(actual, is("Hello world!"));
	}
}
