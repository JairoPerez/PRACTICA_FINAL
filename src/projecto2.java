public class projecto2 {
    public static void main(String[] args) {
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
        int tamano_cadena = 17;
        String aleatorio_texto = "";
        int aleatorio_numero;
        char aleatorio;

        do {
            if (tamano_cadena > caracteres.length()) {
                System.out.println("Solo puede tener 17 carácteres");
            }
        } while (aleatorio_texto.length() < tamano_cadena);
        aleatorio_numero = (int) (Math.random() * caracteres.length());
        aleatorio = caracteres.charAt(aleatorio_numero);
        if (aleatorio_texto.indexOf(aleatorio) == -1) {
            aleatorio_texto += aleatorio;


        }System.out.println(aleatorio);
    }


}



