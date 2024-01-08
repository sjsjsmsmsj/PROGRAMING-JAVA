public class BasicArray {
    public static void main(String[] args) {
        //playWithPrimitiveArray();
        playWithPrimitiveArrayV2();
    }
    public static void playWithPrimitiveArray() {
        float v[] = {0, 0, 5, 3};
        System.out.println("The array has values of (printed by individual)");
        v[0] = 6868;
        System.out.println(v[0]);
        for(int i = 0; i < 4; i ++) {
            System.out.println(v[i]);
        }

        // N = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, ......}
        // v x E N, what is x? 
        // any x in N
        // x = 0, x = 1, x = 2, x = 3, x = 4 , .......
        // v is scan digital array
        // use for browser all values of N
        // v x e N, x = N[0], x = N[1], x = N[2], ......
        System.out.println("v x e N");
        for (float x : v) {
            System.out.println(x);
        }
    }
    public static void playWithPrimitiveArrayV2() {
        double arr[] = new double[365];
        arr[0] = 1;
        arr[2] = 3;
        arr[1] = 2;
        for(int i = 0; i < arr.length; i ++) {
            System.out.println(arr[i]);
        }
        System.out.println("v x E arr");
        for (double x : arr) {
            System.out.print(x + " ");
        }
        // despite primitive array 
        // Array name is variable huge  
        // An array manage variables 
        // array dot is run length(because v x E array)
        
    }
}