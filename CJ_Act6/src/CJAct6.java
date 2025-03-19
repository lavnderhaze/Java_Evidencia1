public class CJAct6 {

    // asignación del nombre del alumno y de las calificaciones
    static String nombreAlumno = "Pedro";
    static double[] calificaciones = {40, 52, 55, 58, 43};
    
        // método double para obtener el promedio
        public static double promedioCalificaciones(double [] array) {

            // declaración de variables
            double promedio;
            double suma = 0;
    
            // recorrido del arreglo para ir sumando sus valores
            for (double i : array){
                suma += i;
            }
    
            /* sacamos el promedio dividiendo la suma entre la
             * cantidad de calificaciones */ 
            promedio = suma / array.length;
            
            return promedio;
        }

        // método char para obtener la calificación en letra
        public static char calificacionFinal(double promedio){

            //declaración de variables
            char calificacion = 0;

            /* if else para comprobar el promedio y asignarle
             * una calificación según el valor */
            if (promedio <= 50) {
                calificacion = 'F';
            } else if (promedio >= 51 && promedio <= 60) {
                calificacion = 'E';
            } else if (promedio >= 61 && promedio <= 70) {
                calificacion = 'D';
            } else if (promedio >= 71 && promedio <= 80) {
                calificacion = 'C';
            } else if (promedio >= 81 && promedio <= 90) {
                calificacion = 'B';
            } else if (promedio >= 91 && promedio <= 100) {
                calificacion = 'A';
            }

            return calificacion;
        }
    
        // método main para la ejecución del programa
        public static void main(String[] args) throws Exception {
    
            /* declaración de variables para almacenar los resultados 
             * de los métodos */
            double promedio = promedioCalificaciones(calificaciones);
            char calificacion = calificacionFinal(promedio);

            // impresiones finales
            System.out.println("Nombre del estudiante: "+ nombreAlumno);
            System.out.println("Calificación 1: " + calificaciones[0]);
            System.out.println("Calificación 2: " + calificaciones[1]);
            System.out.println("Calificación 3: " + calificaciones[2]);
            System.out.println("Calificación 4: " + calificaciones[3]);
            System.out.println("Calificación 5: " + calificaciones[4]);
            System.out.println("Promedio: " + promedio);
            System.out.println("Calificación: " + calificacion);
    }
}
