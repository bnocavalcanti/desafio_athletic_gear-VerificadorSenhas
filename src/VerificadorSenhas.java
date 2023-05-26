

public class VerificadorSenhas {
    public static void main(String[] args) {
        String[] senhas = {"senha123", "Senha456!", "senhaforte#1", "SENHA789"};

        for (String senha : senhas) {
            if (verificarSenhaForte(senha)) {
                System.out.println("Senha forte: " + senha);
            }
        }
    }

    public static boolean verificarSenhaForte(String senha) {
        if (senha.length() < 7) {
            return false;
        }

        boolean possuiLetraMaiuscula = false;
        boolean possuiLetraMinuscula = false;
        boolean possuiCaracterEspecial = false;

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                possuiLetraMaiuscula = true;
            } else if (Character.isLowerCase(c)) {
                possuiLetraMinuscula = true;
            } else if (!Character.isLetterOrDigit(c)) {
                possuiCaracterEspecial = true;
            }
        }

        return possuiLetraMaiuscula && possuiLetraMinuscula && possuiCaracterEspecial;
    }
}
