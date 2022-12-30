
package logica;


public class Paciente {
    private int id_paciente;
    private String nombre;
    private int edad;
    private String raza;
    private String tamanhio;
    private String especie;
    private String sexo;
    private String observaciones;
    private String nombre_duenhio;
    private String direccion;
    private int contacto;

    public Paciente() {
        
    }
    
    public Paciente(int id_paciente, String nombre, int edad, String raza, String tamanhio, String especie, String sexo, String observaciones, String nombre_duenhio, String direccion, int contacto) {
        this.id_paciente = id_paciente;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tamanhio = tamanhio;
        this.especie = especie;
        this.sexo = sexo;
        this.observaciones = observaciones;
        this.nombre_duenhio = nombre_duenhio;
        this.direccion = direccion;
        this.contacto = contacto;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanhio() {
        return tamanhio;
    }

    public void setTamanhio(String tamanhio) {
        this.tamanhio = tamanhio;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getNombre_duenhio() {
        return nombre_duenhio;
    }

    public void setNombre_duenhio(String nombre_duenhio) {
        this.nombre_duenhio = nombre_duenhio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }
    
    



}
