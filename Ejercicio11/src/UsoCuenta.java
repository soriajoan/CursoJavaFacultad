public class UsoCuenta {

    public static void main(String[] args) {
        CuentaCorriente Cuenta1 = new CuentaCorriente("Joan",40000.0);
        CuentaCorriente Cuenta2 = new CuentaCorriente("Joaquin",10000.5);
        Cuenta1.transferencias(2500,0);
        Cuenta2.transferencias(0,2500);
        System.out.println("Titular:" + Cuenta1.getNombreTitular());
        System.out.println("Saldo: $ " + Cuenta1.getSaldo());
        System.out.println("Titular:" + Cuenta2.getNombreTitular());
        System.out.println("Saldo: $ " + Cuenta2.getSaldo());

    }
}
