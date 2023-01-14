public class MinhaClasse {
    public static void main(String[] args) {
    String primeiroNome ="Igor";
    String segundoNome = "Kazuhiko";
    String nomeCompleto =nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
    
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Rsultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}