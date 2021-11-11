public class Integrante {
    int matricula = 0;
    int numeroIntegrante = 0;
    
    public  String  metodo( int numInte,  int valNum){
        String retorno="";
        
        if (numInte==2 && valNum>=100000 && valNum <=999999) {
            retorno="Alumno";
        }else if (numInte==1 && valNum>=1000 && valNum <=9999) {
            retorno="Maestro";
        }
        return retorno;
    }
    

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getNumeroIntegrante() {
        return numeroIntegrante;
    }

    public void setNumeroIntegrante(int numeroIntegrante) {
        this.numeroIntegrante = numeroIntegrante;
    }
}
