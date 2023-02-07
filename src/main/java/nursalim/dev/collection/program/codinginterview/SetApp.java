package nursalim.dev.collection.program.codinginterview;

public class SetApp {
    public static void main(String[] args) {

    }

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
}
