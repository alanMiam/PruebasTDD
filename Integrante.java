public class Integrante {
    int numeroIntegrante = 0;
    String matriculaStr ="";
    
    public  String  metodo( int numInte,  int valNum){
        String retorno="ERROR";
        String matriculaSt;
        
        if (numInte==2 && valNum>=100000 && valNum <=999999) {
            matriculaSt="al"+valNum;
            retorno="Alumno";
        }else if (numInte==1 && valNum>=1000 && valNum <=9999) {
            matriculaSt=valNum+"";
            retorno="Maestro";
        }else if (numInte==3 && valNum>=1 && valNum<=99) {
            matriculaSt="in"+valNum;
            retorno="Intendencia";
        }
        
        return retorno;
    }

    public String getMatriculaStr() {
        return matriculaStr;
    }

    public void setMatriculaStr(String matriculaStr) {
        this.matriculaStr = matriculaStr;
    }
    

    public int getNumeroIntegrante() {
        return numeroIntegrante;
    }

    public void setNumeroIntegrante(int numeroIntegrante) {
        this.numeroIntegrante = numeroIntegrante;
    }
}
