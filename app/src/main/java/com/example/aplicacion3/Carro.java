package com.example.aplicacion3;

import java.io.Serializable;
public class Carro implements Serializable {
      private String color;
      private String tamano;
      private String peso;
      private String n_sillas;
      private String ano;
      private String placa;
      private String kilometraje;

      Carro() {
           this.color="";
           this.tamano="";
           this.peso="";
           this.n_sillas="";
           this.ano="";
           this.placa="";
           this.kilometraje="";
      }
      Carro(String color, String tamano, String peso, String n_sillas, String ano, String placa){
            this.color = color;
            this.tamano = tamano;
            this.n_sillas = n_sillas;
            this.ano = ano;
            this.placa = placa;
            this.peso = peso;
            this.kilometraje = kilometraje;
      }

      public String getColor() {

            return color;
      }

      public void setColor(String color) {

            this.color = color;
      }

      public String getTamano() {


            return tamano;
      }

      public void setTamano(String tamano)
      {
            this.tamano = tamano;
      }

      public String getPeso() {


            return peso;
      }

      public void setPeso(String peso) {

            this.peso = peso;
      }

      public String getN_sillas() {


            return n_sillas;
      }

      public void setN_sillas(String n_sillas) {


            this.n_sillas = n_sillas;
      }

      public String getAno() {
            return ano;
      }

      public void setAno(String ano) {


            this.ano = ano;
      }

      public String getPlaca() {

            return placa;
      }

      public void setPlaca(String placa) {

            this.placa = placa;
      }
}
