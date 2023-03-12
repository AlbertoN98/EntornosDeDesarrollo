package es.iesmz.tests;

public class DiasLluvia {
        private boolean[][] registro;

        public DiasLluvia() {
            // Inicializamos la matriz de registro con todos los valores a false
            registro = new boolean[12][31];
        }

        public boolean registroDia(int dia, int mes, boolean lluvia) {
            // Comprobamos que el día y el mes son válidos
            if (mes < 1 || mes > 12 || dia < 1 || dia > diasDelMes(mes)) {
                return false;
            }
            // Registramos la lluvia para este día y retornamos true
            registro[mes - 1][dia - 1] = lluvia;
            return true;
        }

        private int diasDelMes(int mes) {
            int dias = 0;
            switch(mes) {
                case 2:
                    dias = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    dias = 30;
                    break;
                default:
                    dias = 31;
                    break;
            }
            return dias;
        }
        public static int diaDelAnio(int dia, int mes, int anio) {
            int[] diasPorMes = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
            int diaDelAnio = diasPorMes[mes - 1] + dia;

            if (esBisiesto(anio) && mes > 2) {
                diaDelAnio++;
            }

            return diaDelAnio;
        }

        private static boolean esBisiesto(int anio) {
            return (anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0;
        }


        public boolean consultarDia(int dia, int mes) {
            // Comprobamos que el día y el mes son válidos
            if (mes < 1 || mes > 12 || dia < 1 || dia > diasDelMes(mes)) {
                return false;
            }
            // Retornamos si ha llovido o no en este día
            return registro[mes - 1][dia - 1];
        }
        public int contarDiasLluviosos() {
            int contador = 0;
            // Recorremos la matriz de registro y contamos los días en los que ha llovido
            for (int mes = 0; mes < 12; mes++) {
                for (int dia = 0; dia < diasDelMes(mes+1); dia++) {
                    if (registro[mes][dia]) {
                        contador++;
                    }
                }
            }
            return contador;
        }
        public int trimestreLluvioso() {
            int[] trimestres = new int[4]; // un arreglo para guardar los días lluviosos de cada trimestre

            // Contar los días lluviosos de cada trimestre
            for (int mes = 1; mes < 13; mes++) {
                int diasDelMes = diasDelMes(mes);
                for (int dia = 1; dia <= diasDelMes; dia++) {
                    if (registro[mes - 1][dia - 1]) { // Si ha llovido ese día
                        if (mes <= 3) {
                            trimestres[0]++; // Añadir un día lluvioso al primer trimestre
                        } else if (mes <= 6) {
                            trimestres[1]++; // Añadir un día lluvioso al segundo trimestre
                        } else if (mes <= 9) {
                            trimestres[2]++; // Añadir un día lluvioso al tercer trimestre
                        } else {
                            trimestres[3]++; // Añadir un día lluvioso al cuarto trimestre
                        }
                    }
                }
            }

            // Determinar qué trimestre tuvo más días lluviosos
            int trimestreMaximo = 1;
            int diasMaximos = trimestres[0];
            for (int i = 1; i < 4; i++) {
                if (trimestres[i] > diasMaximos) {
                    trimestreMaximo = i + 1;
                    diasMaximos = trimestres[i];
                }
            }

            return trimestreMaximo;
        }
        public int primerDiaLluvia() {
            int primerDia = -1;
            for (int mes = 1; mes <= 12; mes++) {
                for (int dia = 1; dia <= diasDelMes(mes); dia++) {
                    if (registro[mes - 1][dia - 1]) {
                        primerDia = diaDelAnio(dia, mes, 2023);
                        break;
                    }
                }
                if (primerDia != -1) {
                    break;
                }
            }
            return primerDia;
        }
}
