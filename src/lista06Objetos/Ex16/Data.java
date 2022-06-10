package lista06Objetos.Ex16;

import java.text.Format;

public class Data {
    private int dia = 1;
    private int mes = 1;
    private int ano = 2022;

    public Data(int dia, int mes, int ano){
        if(validaDia(dia)) {
            this.dia = dia;
        }
        if(validaMes(mes)){
            this.mes = mes;
        }
        if(validaAno(ano)){
            this.ano = ano;
        }
    }

    public boolean validaDia(int dia){
        if(dia<1 || dia>31){
            return false;
        }
        return true;
    }

    public boolean validaMes(int mes){
        if(mes<1 || mes>12){
            return false;
        }
        return true;
    }

    public boolean validaAno(int ano){
        if(ano<2000 || ano>2022){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String format = String.format("[DATA]:%02d/%02d/%d ", dia, mes, ano);
        return format ;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(validaDia(dia)){
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(validaMes(mes)){
            this.mes = mes;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(validaAno(ano)){
            this.ano = ano;
        }
    }
}
