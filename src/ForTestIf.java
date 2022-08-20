public class ForTestIf {
    public static void main(String[] args) {

        // int valor = 250;
        for (int valor = 290; valor <= 500; valor++){
            if(valor > 300 && valor <= 500){
                valor += valor * 0.25;
                System.out.println("the value get 25% " + valor);
            } else if (valor < 300 ) {
                valor += valor * 0.5;
                System.out.println("the value get 5% " + valor);

            } else {
                valor += valor * 0.10;

                System.out.println("the value get 10% " + valor);

            }
        }
    }
}
