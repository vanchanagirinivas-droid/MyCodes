class custom {
    public static void main(String[] args) {
        try {
            int[] arr = {0};
            int a = arr[1]; // This will throw ArrayIndexOutOfBoundsException
            int s = a * a;
            System.out.println("Square is: " + s);
        } 
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error: " + ex);
        }
    }
}