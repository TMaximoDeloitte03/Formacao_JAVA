public class Main {
    public static void main(String[] args) {

        Maquina maquina = Menu.novaMaquina();
        long pago;
        int cancelamento;
        int reiniciar;
        long cocaColaDepoisReiniciar;
        long pepsiDepoisReiniciar;
        long iceTeaDepoisReiniciar;
        int produtoAComprar;

        do {
            produtoAComprar = Menu.menu();
            switch (produtoAComprar) {
                case 1 -> {
                    if(maquina.getContadorCocaCola()!=0) {
                        long valorDado1 = 0;
                        long valorCocaCola = 70;
                        boolean compraAceite = false;
                        do {
                            System.out.println("Valor do produto: " + valorCocaCola + " cêntimos\nValor inserido:\t" + valorDado1 + " cêntimos");
                            pago = LerInteiro.lerInteiro(5, 50);

                            if (pago == 50 || pago == 20 || pago == 10 || pago == 5) {
                                valorDado1 = valorDado1 + pago;
                                do {

                                        if (valorDado1 == valorCocaCola) {
                                            System.out.println("Inseridos " + pago + " cêntimos");
                                            compraAceite = true;
                                        } else if (valorDado1 < valorCocaCola) {
                                            long faltaPagar = valorCocaCola - valorDado1;
                                            System.out.println("Falta pagar " + faltaPagar + " cêntimos");
                                        } else if (maquina.getCasheNoBau() > valorDado1 - valorCocaCola) {
                                            long troco = valorDado1 - valorCocaCola;
                                            System.out.println("O troco é de " + troco + " cêntimos");
                                            compraAceite = true;
                                        } else if (maquina.getCasheNoBau() < valorDado1 - valorCocaCola) {
                                            System.out.println("Máquina não tem troco, insira um valor exato.");
                                            valorDado1 = 0;
                                        }
                                } while (pago != 50 && pago != 20 && pago != 10 && pago != 5);
                            } else {
                                System.out.println("A máquina só aceita moedas de 5, 10, 20 ou 50 cêntimos!");
                            }
                        }
                        while (!compraAceite);

                        System.out.println("Deseja cancelar o seu pedido?\n1 - Sim\t\t\t2 - Não");
                        cancelamento = LerInteiro.lerInteiro(1, 2);

                        switch (cancelamento) {
                            case 1 -> {
                                System.out.println("Compra cancelada. Devolvemos os " + valorDado1 + " introduzidos.");
                                //System.out.println(maquina.getContadorCocaCola() + "   " + maquina.getCasheNoBau());
                            }
                            case 2 -> {
                                System.out.println("O seu produto está na gaveta e o troco está na ranhura. Obrigado pela preferência!");
                                maquina.menosCocaCola();
                                maquina.maisCasheNoBau(valorCocaCola);
                                //System.out.println(maquina.getContadorCocaCola() + "   " + maquina.getCasheNoBau());
                            }
                        }
                    }
                    else
                    {
                        System.out.println("A máquina não tem Coca-Cola disponível. Por favor tente mais tarde!");
                    }
                }
                case 2 -> {
                    if(maquina.getContadorPepsi() != 0) {
                        long valorDado2 = 0;
                        long valorPepsi = 65;
                        boolean compraAceite = false;
                        do {
                            System.out.println("Valor do produto: " + valorPepsi + " cêntimos\nValor inserido:\t" + valorDado2 + " cêntimos");
                            pago = LerInteiro.lerInteiro(5, 50);

                            if (pago == 50 || pago == 20 || pago == 10 || pago == 5) {
                                valorDado2 = valorDado2 + pago;
                                do {

                                    if (valorDado2 == valorPepsi) {
                                        System.out.println("Inseridos " + pago + " cêntimos");
                                        compraAceite = true;
                                    } else if (valorDado2 < valorPepsi) {
                                        long faltaPagar = valorPepsi - valorDado2;
                                        System.out.println("Falta pagar " + faltaPagar + " cêntimos");
                                    } else if (maquina.getCasheNoBau() > valorDado2 - valorPepsi) {
                                        long troco = valorDado2 - valorPepsi;
                                        System.out.println("O troco é de " + troco + " cêntimos");
                                        compraAceite = true;
                                    } else if (maquina.getCasheNoBau() < valorDado2 - valorPepsi) {
                                        System.out.println("Máquina não tem troco, insira um valor exato.");
                                        valorDado2 = 0;
                                    }
                                } while (pago != 50 && pago != 20 && pago != 10 && pago != 5);
                            } else {
                                System.out.println("A máquina só aceita moedas de 5, 10, 20 ou 50 cêntimos!");
                            }
                        }
                        while (!compraAceite);

                        System.out.println("Deseja cancelar o seu pedido?\n1 - Sim\t\t\t2 - Não");
                        cancelamento = LerInteiro.lerInteiro(1, 2);

                        switch (cancelamento) {
                            case 1 -> {
                                System.out.println("Compra cancelada. Devolvemos os " + valorDado2 + " introduzidos.");
                                //System.out.println(maquina.getContadorCocaCola() + "   " + maquina.getCasheNoBau());
                            }
                            case 2 -> {
                                System.out.println("O seu produto está na gaveta e o troco está na ranhura. Obrigado pela preferência!");
                                maquina.menosPepsi();
                                maquina.maisCasheNoBau(valorPepsi);
                                //System.out.println(maquina.getContadorCocaCola() + "   " + maquina.getCasheNoBau());
                            }
                        }
                    }
                    else {
                        System.out.println("A máquina não tem Pepsi disponível. Por favor tente mais tarde!");
                    }
                }
                case 3 -> {
                    if(maquina.getContadorIceTea() != 0) {
                        long valorDado3 = 0;
                        long valorIceTea = 60;
                        boolean compraAceite = false;
                        do {
                            System.out.println("Valor do produto: " + valorIceTea + " cêntimos\nValor inserido:\t" + valorDado3 + " cêntimos");
                            pago = LerInteiro.lerInteiro(5, 50);

                            if (pago == 50 || pago == 20 || pago == 10 || pago == 5) {
                                valorDado3 = valorDado3 + pago;
                                do {

                                    if (valorDado3 == valorIceTea) {
                                        System.out.println("Inseridos " + pago + " cêntimos");
                                        compraAceite = true;
                                    } else if (valorDado3 < valorIceTea) {
                                        long faltaPagar = valorIceTea - valorDado3;
                                        System.out.println("Falta pagar " + faltaPagar + " cêntimos");
                                    } else if (maquina.getCasheNoBau() > valorDado3 - valorIceTea) {
                                        long troco = valorDado3 - valorIceTea;
                                        System.out.println("O troco é de " + troco + " cêntimos");
                                        compraAceite = true;
                                    } else if (maquina.getCasheNoBau() < valorDado3 - valorIceTea) {
                                        System.out.println("Máquina não tem troco, insira um valor exato.");
                                        valorDado3 = 0;
                                    }
                                } while (pago != 50 && pago != 20 && pago != 10 && pago != 5);
                            } else {
                                System.out.println("A máquina só aceita moedas de 5, 10, 20 ou 50 cêntimos!");
                            }
                        }
                        while (!compraAceite);

                        System.out.println("Deseja cancelar o seu pedido?\n1 - Sim\t\t\t2 - Não");
                        cancelamento = LerInteiro.lerInteiro(1, 2);

                        switch (cancelamento) {
                            case 1 -> {
                                System.out.println("Compra cancelada. Devolvemos os " + valorDado3 + " introduzidos.");
                                //System.out.println(maquina.getContadorCocaCola() + "   " + maquina.getCasheNoBau());
                            }
                            case 2 -> {
                                System.out.println("O seu produto está na gaveta e o troco está na ranhura. Obrigado pela preferência!");
                                maquina.menosIceTea();
                                maquina.maisCasheNoBau(valorIceTea);
                                //System.out.println(maquina.getContadorCocaCola() + "   " + maquina.getCasheNoBau());
                            }
                        }
                    }
                    else {
                        System.out.println("A máquina não tem Ice Tea disponível. Por favor tente mais tarde!");
                    }
                }
                case 12345 -> {
                    System.out.println("Tem a certeza que deseja reiniciar os valores da máquina?\n1 - Sim\t\t\t\t2 - Não");
                    reiniciar=LerInteiro.lerInteiro(1,2);
                    switch (reiniciar){
                        case 1 -> {
                            System.out.println("Por favor indique a quantidade de Coca-Cola, Pepsi e Ice Tea que deseja depositar na máquina!");
                            System.out.print("Coca-Cola:\t");
                            cocaColaDepoisReiniciar = LerInteiro.lerInteiro(0,100);
                            System.out.print("Pepsi:\t\t");
                            pepsiDepoisReiniciar = LerInteiro.lerInteiro(0,100);
                            System.out.print("Ice Tea:\t");
                            iceTeaDepoisReiniciar= LerInteiro.lerInteiro(0,100);

                            System.out.println("Os valores da máquina foram reiniciados.");
                            System.out.println("No armazenamento estavam " + maquina.getContadorCocaCola() + " Coca-Colas, " + maquina.getContadorPepsi() + " Pepsis, " + maquina.getContadorIceTea() + " Ice Teas e " + maquina.getCasheNoBau() + " centimos (" + ((float)maquina.getCasheNoBau()/100) + " euros) ");
                            maquina.setContadorCocaCola(cocaColaDepoisReiniciar);
                            maquina.setContadorPepsi(pepsiDepoisReiniciar);
                            maquina.setContadorIceTea(iceTeaDepoisReiniciar);
                            maquina.setCasheNoBau(0);
                        }
                        case 2 -> {
                            System.out.println("Máquina e valores não reiniciados!");
                        }
                    }
                }

                case 0 -> {
                    System.out.println("Volte sempre!!!");
                }
                default -> {
                    System.out.println("Valor não presente");
                }
            }
        }
        while (produtoAComprar != 0);
    }
        }