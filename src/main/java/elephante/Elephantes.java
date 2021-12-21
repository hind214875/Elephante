/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elephante;

import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class Elephantes {

    public static void main(String[] args) {
        //declaracion attributos
        Scanner sc = new Scanner(System.in);
        int teldaAraña, pisoElephante, sumPisoElephantes = 0, contoreElephantes = 1;

        do {
            System.out.println("Introduce el piso que suporte la telda de Araña");
            teldaAraña = sc.nextInt();
        } while (teldaAraña < 0 || teldaAraña > 109);

        do {
            do {
                System.out.println("Introduce el piso los elephantes");
                pisoElephante = sc.nextInt();
                if (pisoElephante != 0) {
                    sumPisoElephantes += pisoElephante;
                    if(sumPisoElephantes<teldaAraña){
                         contoreElephantes++;
                    }  
                }
            } while (pisoElephante != 0);

            if (sumPisoElephantes > teldaAraña) {
                System.out.println("Se pudieron montar los " + contoreElephantes + " premiros porque con el " + (contoreElephantes+1) + " se rompa la tilda");
            } else if (sumPisoElephantes < teldaAraña) {
                System.out.println("Se pudieron montar los " + contoreElephantes + " porque porque la tela no se rompió y ya no había más elefantes en la cola");
            }
        } while (pisoElephante < 0 || pisoElephante > 109);

    }
}
