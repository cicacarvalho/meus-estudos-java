import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("=== COFRE DE CREDENCIAIS ===");
        System.out.println("Digite o nome do site:");
        String site = teclado.nextLine();
        System.out.println("Digite seu usuario:");
        String usuario = teclado.nextLine();
        System.out.println("Digite uma senha ficticia:");
        String senha =teclado.nextLine();
        if (senha.length() >= 8){
            System.out.println("Senha Forte!");
        }else {
            System.out.println("Senha Fraca! Use pelo menos 8 caracteres.");

        }
        System.out.println("=== DADOS CADASTRADOS ===");
        System.out.println("Senha cadastrada com sucesso!");
        System.out.println("Site: " + site);
        System.out.println("Usuario: " + usuario);

        teclado.close();


    }
}



