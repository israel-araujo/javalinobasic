public class TestaEnum {
    public static void main(String[] args) {

        Prioridade pMin = Prioridade.MIN;
        Prioridade pMax = Prioridade.MAX;

        System.out.println(pMin.name());
        System.out.println(pMax.name());

        System.out.println(pMax.ordinal());
        System.out.println(pMin.ordinal());

        System.out.println(pMin.getValor());
        System.out.println(pMax.getValor());


        /**
        System.out.println(Thread.MAX_PRIORITY);
        Thread t = new Thread(() -> System.out.println("runing ..."));
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
         **/
    }
}
