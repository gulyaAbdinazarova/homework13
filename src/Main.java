public class Main {
    public static void main(String[] args) {

        Class class1 = new Class(5, "java",new int[]{1,2,3,4,5});
        System.out.println(class1.getNumber());
        System.out.println(class1.getSoz());
        for (int a :class1.getMassiv()){
            System.out.print(a+"  ");
        }
    }
}