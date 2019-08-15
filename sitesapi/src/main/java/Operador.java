public class Operador {
    public static <T extends Comparable<T>> T min(T[] arr){
        T aux = arr[0];
        for(int i =1; i<arr.length; i++){
            if(aux.compareTo(arr[i]) <0){
                aux = arr[i];
            }
        }
        return aux;
    }
    public static <T extends Comparable<T>> T max(T[] arr){
        T aux = arr[0];
        for(int i =1; i<arr.length; i++){
            if(aux.compareTo(arr[i]) >0){
                aux = arr[i];
            }
        }
        return aux;
    }
    public static <T extends Comparable<T>> int buscapocision(T[] arr, T obj){
        int i = -1;
        for(int j = 0; j<arr.length; j++){
            if(arr[j].equals(obj)){
                i = j;
            }
        }

        return i;
    }
    public static <T extends Comparable<T>> T[] ordenar(T[] arr){
        final int N=arr.length;
        for(int i=N-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j].compareTo(arr[j+1]) > 0){
                    T temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        return arr;
    }

}
