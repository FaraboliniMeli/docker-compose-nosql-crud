package br.com.marcello.NoSQLCrud.model.enumerations;

public enum PhoneType {

    COMERCIAL("Comercial"),
    PESSOAL("Pessoal");

    private String type;

    PhoneType(String type) {
        this.type = type;
    }

}
