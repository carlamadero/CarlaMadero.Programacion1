public class Halloween {
    private static final int NUMERO_EDIFICIOS = 10;
    private static final int NUMERO_PISOS = 5;
    private static final int NUMERO_CASAS = 4;
    private static final int PROBABILIDAD_ABIERTA = 70;
    private static final int NUMERO_MAX_CARAMELOS_ANA = 15;
    private static final int PROBABILIDAD_CARAMELOS_ANA = 60;
    private static final int NUMERO_MAX_CARAMELOS_BRUNO = 25;
    private static final int PROBABILIDAD_CARAMELOS_BRUNO = 90;
    private static final int NUMERO_MAX_CARAMELOS_CARMEN = 20;
    private static final int PROBABILIDAD_CARAMELOS_CARMEN = 80;

    private static int caramelosAna = 0;
    private static int caramelosBruno = 0;
    private static int caramelosCarmen = 0;

    private static int totalCaramelos = 0;
    private static int totalCasasVisitadas = NUMERO_EDIFICIOS * NUMERO_PISOS * NUMERO_CASAS;
    private static int casasConCaramelos = 0;

    private static int maxCaramelosEdificio = 0;
    private static int edificioMasGeneroso = 0;
    private static int maxCaramelosPiso = 0;
    private static int edificioPisoMasGeneroso = 0;
    private static int pisoMasGeneroso = 0;

    public static void main(String[] args) {
        recorrerEdificio();
        System.out.println("Ana tiene " + caramelosAna + " caramelos");
        System.out.println("Bruno tiene " + caramelosBruno + " caramelos");
        System.out.println("Carmen tiene " + caramelosCarmen + " caramelos");

        calcularPromedioCaramelosPorEdificio();
        calcularPorcentajeCasasConCaramelos();
        System.out.println("El edificio más generoso fue el edificio " + edificioMasGeneroso + " con " + maxCaramelosEdificio + " caramelos.");
        System.out.println("El piso que más caramelos dio fue el piso " + pisoMasGeneroso + " del edificio " + edificioPisoMasGeneroso + " con " + maxCaramelosPiso + " caramelos.");
    }

    public static void recorrerEdificio() {
        for (int i = 1; i <= NUMERO_EDIFICIOS; i++) {
            int caramelosEdificio = 0; // Caramelos acumulados en el edificio actual

            for (int j = 1; j <= NUMERO_PISOS; j++) {
                int caramelosPiso = 0; // Caramelos acumulados en el piso actual

                for (int k = 1; k <= NUMERO_CASAS; k++) {
                    if (Math.random() * 100 < PROBABILIDAD_ABIERTA) { // Casa abierta
                        int caramelosCasa = 0;

                        if (caramelosAna < NUMERO_MAX_CARAMELOS_ANA) {
                            if (Math.random() * 100 < PROBABILIDAD_CARAMELOS_ANA) {
                                int caramelos = (int) (Math.random() * 2) + 1;
                                caramelosAna += caramelos;
                                caramelosCasa += caramelos;
                            }
                        }

                        if (caramelosBruno < NUMERO_MAX_CARAMELOS_BRUNO) {
                            if (Math.random() * 100 < PROBABILIDAD_CARAMELOS_BRUNO) {
                                int caramelos = (int) (Math.random() * 3) + 2;
                                caramelosBruno += caramelos;
                                caramelosCasa += caramelos;
                            }
                        }

                        if (caramelosCarmen < NUMERO_MAX_CARAMELOS_CARMEN) {
                            if (Math.random() * 100 < PROBABILIDAD_CARAMELOS_CARMEN) {
                                int caramelos = 1;
                                if (j == 4 || j == 5) { // Pisos 4 y 5
                                    caramelos += 1;
                                }
                                caramelosCarmen += caramelos;
                                caramelosCasa += caramelos;
                            }
                        }

                        // Sumar caramelos recolectados en la casa actual a los totales del piso y edificio
                        caramelosPiso += caramelosCasa;
                        caramelosEdificio += caramelosCasa;
                        totalCaramelos += caramelosCasa;

                        // Contar la casa si dio caramelos
                        if (caramelosCasa > 0) {
                            casasConCaramelos++;
                        }
                    }
                }

                // Actualizar el piso más generoso si el actual tiene más caramelos
                if (caramelosPiso > maxCaramelosPiso) {
                    maxCaramelosPiso = caramelosPiso;
                    edificioPisoMasGeneroso = i;
                    pisoMasGeneroso = j;
                }
            }

            // Actualizar el edificio más generoso si el actual tiene más caramelos
            if (caramelosEdificio > maxCaramelosEdificio) {
                maxCaramelosEdificio = caramelosEdificio;
                edificioMasGeneroso = i;
            }
        }
    }

    public static void calcularPromedioCaramelosPorEdificio() {
        double promedio = (double) totalCaramelos / NUMERO_EDIFICIOS;
        System.out.println("Promedio de caramelos por edificio: " + promedio);
    }

    public static void calcularPorcentajeCasasConCaramelos() {
        double porcentaje = (double) casasConCaramelos / totalCasasVisitadas * 100;
        System.out.println("Porcentaje de casas que dieron caramelos: " + porcentaje + "%");
    }
}
