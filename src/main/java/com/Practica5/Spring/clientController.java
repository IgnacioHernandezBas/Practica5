package com.Practica5.Spring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class clientController{
  Cliente cliente;

  @GetMapping("/getCliente") // Al poner / estudiantes en el navegador se va a ejecutar la función getEstudiantes
  public Cliente getClient(){
    return cliente;
  }

  @PostMapping("/login")
  public Cliente clientPost(@RequestBody Cliente cl){
   this.cliente=cl;
   return cl;
  }
}