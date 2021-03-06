package org.dnltsk.intellij.geocode.plugin.nominatim;

import org.dnltsk.intellij.geocode.plugin.Address;
import org.dnltsk.intellij.geocode.plugin.LonLat;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class NominatimReverseGeocoderTest {

    private static NominatimReverseGeocoder reverseGeocoder;

    @BeforeClass
    public static void setUp() {
        reverseGeocoder = new NominatimReverseGeocoder();
    }

    @Test
    public void Beijing_can_get_reverse_geocoded() {
        LonLat beijingLonLat = new LonLat();
        beijingLonLat.lon = 116.383333;
        beijingLonLat.lat = 39.933333;
        Address beijingAddress = reverseGeocoder.lonLatToAddress(beijingLonLat);
        assertThat(beijingAddress.displayName, containsString("Beijing"));
    }

}