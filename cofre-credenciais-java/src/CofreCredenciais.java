import java.util.Scanner;

public class CofreCredenciais {
    import java.util.HashMap;
    import java.util.Map;
    import java.util.Scanner;

    public class CofreCredenciais {

        private static final Map<String, String> cofre = new HashMap<>();

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcao;
            do {
                System.out.println("\n--- COFRE DE CFREDENCIAIS---");
                System.out.println("1. SALVAR nova credenciais");
                System.out.println("2. Buscar senha de um serviço");
                System.out.println("3. Sair");
                System.out.println("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextline();
                if (opcao == 1) {

                }
                System.out.print("Digite o nome do serviço (github"):
                String serviço = scanner.nextline();
                System.out.print("Digite a senha para este serviço!");
                String senha = scanner.nextline();

                if (ValidarSenha(senha)) {
                    cofre.put(servico, senha);
                    System.out.println("Credencial salva com sucesso!");
                } else {
                    System.out.println("ERRO:A senha não atende aos requisitos de segurança!");
                }

            } else if (opcao == 2) {
                System.out.print("Digite o nome do serviço que deseja buscar: ");
                String servico = scanner.nextline();

                if (cofre.containskey(servico)) {
                    System.out.println("Senha encontrada: " + cofre.get(servico)):
                } else {
                    System.out.println("serviço não cadastrado."):
                }
            }

        }  while(opcao !=3);
                System.out.println("Cofre fechado com segura.");
                scanner.close();
    }
    public static boolean validarSenha(String senha)
        if(senha.length() < 8)

    {
        System.out.println("-> A senha deve ter menos 8 caracteres.");
        return false;
    }


            }
            boolean temMaiuscula = false;
            boolean temMInuscula = false;
            boolean temNumero = false;

            for (char c: senha.toCHARArray()){
        if(character.

isUppercase(c))temMaiuscula =true;
        else if(character.

isLowercase(c))temMinuscula =true;
        else if(character.

isDigit(c))temNumero =true;
        if(!temMaiusculo)System.out.

println("-> A senha deve conter pelo menos uma letra maiuscula.");
        if(!temMinuscula)System.out.

println("-> A senha deve conter pelo menos uma letra minuscula.");
        if(!temNumero)Sytem.out.

println("-> A senha deve conter pelo menos um numero.");

        return temMaiuscula &&temMinuscula &&temNumero;

            }

        }
    }
}
