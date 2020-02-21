package examenprimerp;

public class Alumnos {
    
    public String nom, ape, mat, sexo, edad, peso;
    
    public Alumnos(String nom, String ape, String mat, String sexo, String edad, String peso) {
        this.nom = nom;
        this.ape = ape;
        this.mat = mat;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNom() {
        return nom;
    }

    public String getApe() {
        return ape;
    }

    public String getMat() {
        return mat;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEdad() {
        return edad;
    }

    public String getPeso() {
        return peso;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    
    
}
