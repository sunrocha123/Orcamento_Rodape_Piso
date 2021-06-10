import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Orcamento or = new Orcamento();
        Scanner input = new Scanner(System.in);
        ArrayList dadosOrcamento = new ArrayList();

        while (true) {
            System.out.print("\n//////////////\nMENU\n//////////////\n\n");
            System.out.print("1. Novo Orçamento\n2. Orçamentos Realizados\n3. Sair\n");

            int opcao = escolherOpcao();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número do orçamento: ");
                    int nro = input.nextInt();
                    System.out.print("Digite a marca do rodapé: ");
                    String marcaRodape = input.next();
                    System.out.print("Digite a altura: ");
                    float alturaRodape = input.nextFloat();
                    System.out.print("Digite o material do rodapé: ");
                    String materialRodape = input.next();
                    System.out.print("Digite o valor: R$ ");
                    float valorRodape = input.nextFloat();
                    System.out.print("Digite o nome do piso: ");
                    String nomePiso = input.next();
                    System.out.print("Digite a metragem por caixa: ");
                    float metrosporcaixaPiso = input.nextFloat();
                    System.out.print("Digite a marca do piso: ");
                    String marcaPiso = input.next();
                    System.out.print("Digite o valor: R$ ");
                    float valorPiso = input.nextFloat();

                    Piso piso = new Piso(nomePiso, metrosporcaixaPiso, marcaPiso, valorPiso);
                    Rodape rodape = new Rodape(materialRodape, alturaRodape, valorRodape, marcaRodape);

                    or.setNro(nro);
                    or.setPiso(piso);
                    or.setRodape(rodape);

                    dadosOrcamento.add(or);

                    System.out.print("Orçamento criado com sucesso!\n");
                    break;

                case 2:
                    for(int i = 0; i < dadosOrcamento.size(); i++){
                        or = (Orcamento)dadosOrcamento.get(i);
                        System.out.print(or.emissaoPagamento());
                    }
                    break;

                default:
                    System.out.print("\nObrigado por usar nossa ferramenta!");
                    break;
            }
            if (opcao == 3) {
                break;
            }
        }
    }

    public static int escolherOpcao(){
        Scanner input = new Scanner(System.in);
        int opcaoEscolhida;

        while (true) {
            System.out.print("Digite a opção desejada: ");
            opcaoEscolhida = input.nextInt();
            if (opcaoEscolhida >= 1 && opcaoEscolhida <= 3) {
                return opcaoEscolhida;
            } else {
                System.out.print("Opção inválida... digite novamente!\n");
            }
        }
    }
}
