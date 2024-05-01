public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String primeiroNome = "Camille";
        String segundoNome = "Klein";
        String meuNome = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(meuNome);
    }

    public Static nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}

// Todas as classes, as primeiras letras maiusculas
// classe esta no diretorio scr
// variaveis comecam com letra minuscula,mas tb camelcase
// final MAISCULA

//variaveis devem conterb apenas letras, _, $ ou numeros, mas iniciae com lketra 