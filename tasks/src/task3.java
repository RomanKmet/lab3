public class task3 {
    public static void main(String[] args){
        for(float a=1; a<=10; a++){
            float b = 10 / a;
            if (Math.round(b) == b) {
                System.out.println(a);
            }
        }
    }
}
