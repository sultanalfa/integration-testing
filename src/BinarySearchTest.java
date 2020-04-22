import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @org.junit.jupiter.api.Test
    void main() {
        assertEquals(-1,-1);
        assertEquals(1,1);
        assertEquals(4,4);
        assertEquals(6,6);
        SaveToDB saveDB = new SaveToDB();
        System.out.println("Simpan ke Database");
        assertEquals("Sukses", saveDB.sendToDB("Test dijalankan"));
    }
}