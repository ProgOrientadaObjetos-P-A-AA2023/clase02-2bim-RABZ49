package paquete4;

public class EstudiantePresencial extends Estudiante {

    private int numeroCreditos;
    private double costoCredito;
    private double matriculaPresencial;

    public EstudiantePresencial(String n, String a, String iden, int ed) {
        super(n, a, iden, ed);
        
    }

    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroCreditos(numero: Real)
    public void establecerNumeroCreditos(int numero) {
        numeroCreditos = numero;
    }

    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(double valor) {
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaPresencial()
    public void calcularMatriculaPresencial() {
        matriculaPresencial = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public int obtenerNumeroCreditos() {
        return numeroCreditos;
    }

    // 6. Método obtenerCostoCredito() : Real
    public double obtenerCostoCredito() {
        return costoCredito;
    }

    // 7. Método obtenerMatriculaPresencial() : Real
    public double obtenerMatriculaPresencial() {
        return matriculaPresencial;
    }

    @Override
    public String toString() {

        String cadenaFinal = String.format("%s", super.toString());

        cadenaFinal = String.format("%s\n"
                + "Costo creditos: %.2f\n"
                + "Número de Creditos: %d\n"
                + "Total Matricula: %.2f\n",
                cadenaFinal,
                obtenerCostoCredito(),
                obtenerNumeroCreditos(),
                obtenerMatriculaPresencial());

        return cadenaFinal;
    }
}
