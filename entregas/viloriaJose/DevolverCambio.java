import java.util.Scanner;

class DeveloperCambio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int billete100;
        int billete50;
        int billete20;
        int billete10;
        int billete5;
        int moneda2;
        int moneda1;
        int restante;

        final int PRECIO_UNO;
        PRECIO_UNO = 232;

        int dineroIngresado;

        System.out.println("Debes pagar " + PRECIO_UNO + "€, ingrese el dinero:");

        dineroIngresado = scanner.nextInt();

        boolean puedePagar;
        int cambio;

        puedePagar = (dineroIngresado >= PRECIO_UNO);
        cambio = dineroIngresado - PRECIO_UNO;

        System.out.println(puedePagar ? "Tu cambio es " + cambio + "€" : "No tienes suficiente dinero");

        cambio = puedePagar ? cambio : 0;

        billete100 = cambio / 100;
        restante = cambio % 100;
        billete50 = restante / 50;
        restante = restante % 50;
        billete20 = restante / 20;
        restante = restante % 20;
        billete10 = restante / 10;
        restante = restante % 10;
        billete5 = restante / 5;
        restante = restante % 5;
        moneda2 = restante / 2;
        moneda1 = restante % 2;
        System.out.println(billete100 + " billete(s) de 100 € ");
        System.out.println(billete50 + " billete(s) de 50 € ");
        System.out.println(billete20 + " billete(s) de 20 € ");
        System.out.println(billete10 + " billete(s) de 10 € ");
        System.out.println(billete5 + " billete(s) de 5 € ");
        System.out.println(moneda2 + " moneda(s) de 2 € ");
        System.out.println(moneda1 + " moneda(s) de 1 €");

        final int PRECIO_DOS;
        PRECIO_DOS = 1;

        System.out.println("Debes pagar " + PRECIO_DOS + "€, ingrese el dinero:");

        dineroIngresado = scanner.nextInt();
        puedePagar = dineroIngresado >= PRECIO_DOS;
        cambio = dineroIngresado - PRECIO_DOS;

        System.out.println(puedePagar ? "Tu cambio es " + cambio + "€" : "No tienes suficiente dinero");

        cambio = puedePagar ? cambio : 0;

        billete100 = cambio / 100;
        restante = cambio % 100;
        billete50 = restante / 50;
        restante = restante % 50;
        billete20 = restante / 20;
        restante = restante % 20;
        billete10 = restante / 10;
        restante = restante % 10;
        billete5 = restante / 5;
        restante = restante % 5;
        moneda2 = restante / 2;
        moneda1 = restante % 2;
        System.out.println(billete100 + " billete(s) de 100 € ");
        System.out.println(billete50 + " billete(s) de 50 € ");
        System.out.println(billete20 + " billete(s) de 20 € ");
        System.out.println(billete10 + " billete(s) de 10 € ");
        System.out.println(billete5 + " billete(s) de 5 € ");
        System.out.println(moneda2 + " moneda(s) de 2 € ");
        System.out.println(moneda1 + " moneda(s) de 1 €");

        final int PRECIO_TRES;
        PRECIO_TRES = 37;

        System.out.println("Debes pagar " + PRECIO_TRES + "€, ingrese el dinero:");

        dineroIngresado = scanner.nextInt();
        puedePagar = dineroIngresado >= PRECIO_TRES;
        cambio = dineroIngresado - PRECIO_TRES;

        System.out.println(puedePagar ? "Tu cambio es " + cambio + "€" : "No tienes suficiente dinero");

        cambio = puedePagar ? cambio : 0;

        billete100 = cambio / 100;
        restante = cambio % 100;
        billete50 = restante / 50;
        restante = restante % 50;
        billete20 = restante / 20;
        restante = restante % 20;
        billete10 = restante / 10;
        restante = restante % 10;
        billete5 = restante / 5;
        restante = restante % 5;
        moneda2 = restante / 2;
        moneda1 = restante % 2;
        System.out.println(billete100 + " billete(s) de 100 € ");
        System.out.println(billete50 + " billete(s) de 50 € ");
        System.out.println(billete20 + " billete(s) de 20 € ");
        System.out.println(billete10 + " billete(s) de 10 € ");
        System.out.println(billete5 + " billete(s) de 5 € ");
        System.out.println(moneda2 + " moneda(s) de 2 € ");
        System.out.println(moneda1 + " moneda(s) de 1 €");

        final int PRECIO_CUATRO;
        PRECIO_CUATRO = 5;

        System.out.println("Debes pagar " + PRECIO_CUATRO + "€, ingrese el dinero:");

        dineroIngresado = scanner.nextInt();
        puedePagar = dineroIngresado >= PRECIO_CUATRO;
        cambio = dineroIngresado - PRECIO_CUATRO;

        System.out.println(puedePagar ? "Tu cambio es " + cambio + "€" : "No tienes suficiente dinero");

        cambio = puedePagar ? cambio : 0;

        billete100 = cambio / 100;
        restante = cambio % 100;
        billete50 = restante / 50;
        restante = restante % 50;
        billete20 = restante / 20;
        restante = restante % 20;
        billete10 = restante / 10;
        restante = restante % 10;
        billete5 = restante / 5;
        restante = restante % 5;
        moneda2 = restante / 2;
        moneda1 = restante % 2;
        System.out.println(billete100 + " billete(s) de 100 € ");
        System.out.println(billete50 + " billete(s) de 50 € ");
        System.out.println(billete20 + " billete(s) de 20 € ");
        System.out.println(billete10 + " billete(s) de 10 € ");
        System.out.println(billete5 + " billete(s) de 5 € ");
        System.out.println(moneda2 + " moneda(s) de 2 € ");
        System.out.println(moneda1 + " moneda(s) de 1 €");

        System.out.println();

    }
}
