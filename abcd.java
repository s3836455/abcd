package Week8;

public class Practice {
    public static void main(String[] args){
        try {
            int a = 1/0;
        }
        catch (Exception e) {
            System.out.println("sao lai chia cho 0");
        }
        finally {
            System.out.println("hello moto");
            int[] a = new int[10];
            System.out.println(a[10]);
        }
    }
}
