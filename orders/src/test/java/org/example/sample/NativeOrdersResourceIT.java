package org.example.sample;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeOrdersResourceIT extends OrdersResourceTest {

    // Execute the same tests but in native mode.
}