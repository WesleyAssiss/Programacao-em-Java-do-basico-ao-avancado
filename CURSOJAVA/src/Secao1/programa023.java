package Secao1;


import java.util.Scanner;

/* Faça um programa para leia o horário (hora, minuto e segundo) de início e a duração, em
segundos, de uma experiência biológica. O programa deve resultar com o novo horário (hora,
minuto e segundo) do termino da mesma. */
public class programa023 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horas = 15, minutos = 30, segundos = 59;
        int duracao = 10800;
        int h, m, s;
        int hf, mf, sf;
        
        
        System.out.println("A hora inicial e: " + horas + ":" + minutos + ":" + segundos);

        System.out.println("\nA hora de duracao da experiencia em segundos e: " + duracao);

        h = duracao / 3600;
        m = (duracao - (h * 3600)) / 60;
        s = duracao - (h * 3600) - (m * 60);
        
        hf = h + horas;
        mf = m + minutos;
        sf = s + segundos;
        System.out.println("\nA experiencia terminara as: "  + hf + ":"+ mf + ":" + sf);

        
    }
}
