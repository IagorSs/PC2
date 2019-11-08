public class TesteRelogio {
    public static void main(String[] args) {
        Relogio a = new Relogio(12);
        Relogio b = new Relogio(24);
        int i;
        //teste relógio formato 12hrs
        for(i=0;i<1441;i++){
            System.out.printf("%s\n",a.exibirHoras());
            a.TicTac();
        }
        //teste relógio formato 24 hrs
        for(i=0;i<1441;i++){
            System.out.printf("%s\n",b.exibirHoras());
            b.TicTac();
        }
    }
}
