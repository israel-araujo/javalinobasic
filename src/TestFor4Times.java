public class TestFor4Times {
    public static void main(String[] args) {
        for( int tip = 0; tip <= 10; tip++){
            if(tip %4 == 1){
                System.out.println("Take your tip and Enjoy it:  " + tip);
            }
        }
    }
}
