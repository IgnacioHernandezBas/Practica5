package com.Practica5.Spring;

public class Cliente{
  private String nombre;
  private String correo;
  private String password;

  public Cliente(String nombre, String correo, String password) {
    this.nombre = nombre;
    this.correo = correo;
    this.password = password;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getCorreo() {
    return this.correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public String toString() {
    return "{" +
      " nombre='" + getNombre() + "'" +
      ", correo='" + getCorreo() + "'" +
      ", password='" + getPassword() + "'" +
      "}";
  }
  
}