import Classes.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpresaCadernos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String [] infosTipo = {"Nome", "Codigo", "Idade", "Salario"};
        String [] infosGerente  = new String[4];
        String [] infosFabricante = new String[5];
        String [] infosCaderno = new String[3];

        try {

            for (int p = 0; p < 4; p++) {
                System.out.println("Digite o " + infosTipo[p] + " do gerente: ");
                switch (p) {
                    case 2 -> infosGerente[p] = String.valueOf(teclado.nextInt());
                    case 3 -> infosGerente[p] = String.valueOf(teclado.nextDouble());
                    default -> infosGerente[p] = teclado.next();
                }
            }

            Funcionarios gerente = new Gerente(infosGerente[0], infosGerente[1],
                                               Integer.parseInt(infosGerente[2]), Double.parseDouble(infosGerente[3]),
                                               TipoPessoa.PESSOA_JURIDICA);

            System.out.println("###################");
            System.out.println(gerente);
            System.out.println("###################");


            infosTipo = new String[]{"nome", "codigo", "idade", "salario", "qtd de cadernos fabricados"};

                for(int p = 0; p < 5; p++) {
                    System.out.println("Digite o " + infosTipo[p] + " do fabricante: ");
                    switch (p) {
                        case 2, 4 -> infosFabricante[p] = String.valueOf(teclado.nextInt());
                        case 3 -> infosFabricante[p] = String.valueOf(teclado.nextDouble());
                        default -> infosFabricante[p] = teclado.next();
                    }
                }


        Funcionarios fabricante = new Fabricante(infosFabricante[0], infosFabricante[1],
                Integer.parseInt(infosFabricante[2]), Double.parseDouble(infosFabricante[3]),
                Integer.parseInt(infosFabricante[4]), TipoPessoa.PESSOA_JURIDICA);

        System.out.println("###################");
        System.out.println(fabricante);
        System.out.println("###################");

        infosTipo = new String[]{"modelo do caderno", "paginas", "qtd de matérias"};


                for (int p = 0; p < 3; p++) {
                    System.out.println("Digite o " + infosTipo[p] + " do caderno: ");
                    switch (p) {
                        case 1,2 -> infosCaderno[p] = String.valueOf(teclado.nextInt());
                        default -> infosCaderno[p] = teclado.next();
                    }
                }

                Cadernos caderno = new Cadernos(infosCaderno[0],
                        Integer.parseInt(infosCaderno[1]), Integer.parseInt(infosCaderno[2]),
                        Figurinhas.SIM);

                    System.out.println("###################");
                    System.out.println(caderno);
                    System.out.println("###################");

                }catch (InputMismatchException e){
                System.out.println("*** O TIPO DE VALOR INSERIDO ESTA ERRADO ***");
                System.out.println("(Informe centavos com virgula)");

        }

        }}