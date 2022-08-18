public class TestWhile4Times {
    public static void main(String[] args) {
        int tip = 0;
        while (tip <= 10){
            if(tip == 10){
                System.out.println("*** Good Tips ***");
                System.out.println("                 ");
                System.out.println("                 ");
                System.out.println("Good job guys ... Guys ..  " + tip);
            }
            System.out.println("                      ");
            System.out.println("                      ");
            System.out.println("paying tips to Waiters: " + tip);
            tip++;

        }
    }
}
