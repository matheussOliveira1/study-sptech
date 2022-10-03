/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testando;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscosGroup;
import com.github.britooo.looca.api.group.sistema.Sistema;
import java.util.List;

/**
 *
 * @author zagreu
 */
public class testeLOOCA {

    public static void main(String[] args) {

        Looca looca = new Looca();
        Sistema syst = looca.getSistema();
        
        //Testando funcionalidades da API Looca:
        
        /*
        //Informações maquina/sistema
        System.out.println(syst);
        System.out.println("-".repeat(50));
        System.out.println(looca.getSistema().getFabricante());
        System.out.println(looca.getSistema().getArquitetura());
        System.out.println(looca.getSistema().getInicializado());
        System.out.println(looca.getSistema().getSistemaOperacional());
        System.out.println(looca.getSistema().getTempoDeAtividade());
        System.out.println(looca.getSistema().getPermissao());
        
        System.out.println("-".repeat(50));
        System.out.println("-".repeat(50));
        
        //Informações memoria ram:
        System.out.println(looca.getMemoria());
        System.out.println(looca.getMemoria().getEmUso());
        System.out.println(looca.getMemoria().getDisponivel());
        System.out.println(looca.getMemoria().getTotal());
        
        System.out.println("-".repeat(50));
        System.out.println("-".repeat(50));
        
        //Informações cpu:
        System.out.println(looca.getProcessador());
        System.out.println(looca.getProcessador().getId());
        System.out.println(looca.getProcessador().getIdentificador());
        System.out.println(looca.getProcessador().getFabricante());
        System.out.println(looca.getProcessador().getFrequencia());
        System.out.println(looca.getProcessador().getMicroarquitetura());
        System.out.println(looca.getProcessador().getNome());
        System.out.println(looca.getProcessador().getNumeroCpusFisicas());
        System.out.println(looca.getProcessador().getNumeroCpusLogicas());
        System.out.println(looca.getProcessador().getNumeroPacotesFisicos());
        System.out.println(looca.getProcessador().getUso());
        
        System.out.println("-".repeat(50));
        System.out.println("-".repeat(50));
        
        //Informações disco(HD/SSD)
        //System.out.println(looca.getGrupoDeDiscos());
        
        System.out.println(looca.getGrupoDeDiscos().getTamanhoTotal());
        System.out.println("-".repeat(50));
        System.out.println(looca.getGrupoDeDiscos().getVolumes());
        System.out.println("-".repeat(50));
        System.out.println(looca.getGrupoDeDiscos().getQuantidadeDeDiscos());
        System.out.println("-".repeat(50));
        System.out.println(looca.getGrupoDeDiscos().getQuantidadeDeVolumes());
        
        System.out.println("-".repeat(50));
        System.out.println("-".repeat(50));
        
        //Informações processos:
        //System.out.println(looca.getGrupoDeProcessos().getProcessos());
        
        //Pegando grupo de discord de forma organizada:
      
        
        DiscosGroup grupoDeDiscos = looca.getGrupoDeDiscos();

        List<Disco> discos = grupoDeDiscos.getDiscos();
        
        System.out.println("-".repeat(100));
        System.out.println(looca.getProcessador().getId()); //SERIAL
        System.out.println("-".repeat(100));
        System.out.println(discos.get(1));
        System.out.println("-".repeat(100));
        System.out.println(looca.getSistema());
        
        
        System.out.println(discos.get(1).getNome());
        System.out.println(discos.get(1).getModelo());
        System.out.println(discos.get(1).getSerial());
        System.out.println(discos.get(1).getBytesDeEscritas());
        System.out.println(discos.get(1).getTamanho());
        System.out.println(discos.get(1).getTamanhoAtualDaFila());
        */
        
        //Informações memoria ram:
        
        System.out.println(looca.getMemoria());
        System.out.println(looca.getMemoria().getEmUso());
        System.out.println(looca.getMemoria().getDisponivel());
        System.out.println(looca.getMemoria().getTotal());
        
        System.out.println(looca.getGrupoDeDiscos());
    }
}
