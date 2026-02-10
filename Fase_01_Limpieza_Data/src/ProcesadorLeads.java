public class ProcesadorLeads {
    public static void main(String[] args) {

        // --- 1. ENTRADA DE DATOS ---
        String nombreEntrada = " Mateo Cañibano "; 
        String emailEntrada = " mateo@outlook.fr "; // Prueba con cualquier dominio

        // --- 2. NORMALIZACIÓN ---
        String nombreLimpio = nombreEntrada.trim();
        String emailLimpio = emailEntrada.trim().toLowerCase();

        // --- 3. VALIDACIÓN Y DETECCIÓN ---
        boolean nombreEsValido = nombreLimpio.length() >= 3;
        
        // Definimos qué consideramos "Estándar / Público"
        boolean esPublico = emailLimpio.contains("@gmail.") || 
                            emailLimpio.contains("@hotmail.") || 
                            emailLimpio.contains("@outlook.") || 
                            emailLimpio.contains("@yahoo.");

        // --- 4. MATRIZ DE SEGMENTACIÓN ACTUALIZADA ---
        String categoria;

        if (!nombreEsValido) {
            categoria = "INVÁLIDO (Nombre insuficiente)";
        } 
        else if (esPublico) {
            // Si el email es de los conocidos como gratuitos
            categoria = "B2C (Cliente Particular)";
        } 
        else {
            // Si el nombre es válido y NO es un email público,
            // por descarte, lo consideramos cuenta de empresa.
            categoria = "B2B (Empresa / Corporativo)";
        }

        // --- 5. SALIDA ---
        System.out.println("======= CLASIFICACIÓN DE LEAD =======");
        System.out.println("EMAIL: [" + emailLimpio + "]");
        System.out.println("CATEGORÍA: " + categoria);
        System.out.println("=====================================");
    }
}