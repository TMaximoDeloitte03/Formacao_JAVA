public class Menu {
    public static int menu () {
        System.out.println("\nMáquina de bubidas. Adequada a menores (sem alcóol)!" );
        System.out.println("1 - Coca-Cola -> 70 cêntimos \n2 - Pepsi -> 65 cêntimos \n3 - Ice Tea -> 60 cêntimos \n0 - Sair");
        return LerInteiro.lerInteiro(0,12345);
    }

    public static Maquina novaMaquina() {
        System.out.println("\n\nBem-vindo à sua máquina de venda automática de bubidas!");
        System.out.println("Por favor indique a quantidade de Coca-Cola, Pepsi e Ice Tea que deseja depositar na máquina!");
        System.out.print("Coca-Cola:\t");
        long inicialCocaCola = LerInteiro.lerInteiro(0,100);
        System.out.print("Pepsi:\t\t");
        long inicialPepsi = LerInteiro.lerInteiro(0,100);
        System.out.print("Ice Tea:\t");
        long inicialIceTea = LerInteiro.lerInteiro(0,100);
        System.out.println("Se a alguma altura quizer reiniciar a máquina, ou seja colocar mais bebidas e retirar o dinheiro da caixa, pressione 12345 no menu principal!");

        return new Maquina(inicialCocaCola, inicialPepsi, inicialIceTea, 0);
    }
}
