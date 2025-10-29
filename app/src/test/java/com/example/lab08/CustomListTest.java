package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
// This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }


    //failign test:

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City edm = new City("Edmonton", "AB");
        list.addCity(edm);
        list.deleteCity(edm);
        assertFalse(list.hasCity(edm));
        City cal = new City("Calgary", "AB");
        assertThrows(IllegalArgumentException.class, () -> list.deleteCity(cal));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        assertEquals(0, list.countCities());
        list.addCity(new City("Calgary", "AB"));
        assertEquals(1, list.countCities());
    }


}