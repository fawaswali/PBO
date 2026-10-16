package Teori_5;

public class Main_Bank {
    public static void main(String[] args) {
        Deposito dp = new Deposito(12000000, 4);

        System.out.println("Saldo awal: " + dp.getSaldo());
        System.out.println("Nilai bunga deposito: " + dp.getNilaiBunga());
        System.out.println("Total deposito: " + (dp.getSaldo() + dp.getNilaiBunga()));
    }
}
