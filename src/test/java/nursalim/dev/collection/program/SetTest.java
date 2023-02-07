package nursalim.dev.collection.program;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SetTest {

    public static class Set {

        private int size = 0;
        private String[] array = new String[10];

        public boolean add(String value){
            if(contains(value)){
                return false;
            }else{
                ensureCapacity();
                array[size] = value;
                size++;
                return true;
            }
        }

        private void ensureCapacity(){
            if(size >= array.length){
                // resize using create a new temporary
                String[] temporary = new String[array.length * 2];
                for(int i = 0; i < array.length; i++){
                    temporary[i] = array[i];
                }

                array = temporary;
            }
        }

        public boolean contains(String value){
            for(String item : array){
                if(value.equals(item)){
                    return true;
                }
            }
            return false;
        }

        public int size(){
            return size;
        }

        private int indexOf(String value){
            for (int i = 0; i < array.length; i++) {
                if(value.equals(array[i])){
                    return i;
                }
            }

            return 0;
        }

        public boolean remove(String value){
            if(contains(value)){
                // remove
                int indexRemoved = indexOf(value);
                for (int i = indexRemoved; i <= size; i++) {
                    array[i] = array[i+1];
                }

                size--;
            }else{
                return false;
            }
            return true;
        }
    }

    @Test
    void testAdd(){
        Set set = new Set();
        Assertions.assertTrue(set.add("Nursalim"));
        Assertions.assertFalse(set.add("Nursalim"));
        Assertions.assertTrue(set.add("Al Farizi"));
    }

    @Test
    void testContains(){
        Set set = new Set();
        set.add("Nursalim");
        set.add("Al Farizi");

        Assertions.assertTrue(set.contains("Nursalim"));
        Assertions.assertFalse(set.contains("Nani"));
    }

    @Test
    void testSize(){
        Set set = new Set();
        Assertions.assertEquals(0, set.size);

        set.add("Nursalim");
        Assertions.assertEquals(1, set.size);

        set.add("Nursalim");
        Assertions.assertEquals(1, set.size);

        set.add("Al Farizi");
        Assertions.assertEquals(2, set.size);
    }

    @Test
    void testRemove(){
        Set set = new Set();
        set.add("Nursalim");
        set.add("Al Farizi");
        set.add("Nani");
        set.add("Indriyani");
        set.add("Beji");
        set.add("Budi");

        Assertions.assertEquals(6, set.size());

        set.remove("Al Farizi");
        Assertions.assertEquals(5, set.size());

        Assertions.assertTrue(set.contains("Nursalim"));
        Assertions.assertTrue(set.contains("Nani"));
        Assertions.assertTrue(set.contains("Indriyani"));
        Assertions.assertTrue(set.contains("Beji"));
        Assertions.assertTrue(set.contains("Budi"));
        Assertions.assertFalse(set.contains("Al Farizi"));
    }

    @Test
    void testGrowth(){
        Set set = new Set();
        for(int i = 0; i < 100; i++){
            set.add("Item ke - " + i);
        }

        Assertions.assertEquals(100, set.size());
    }
}
