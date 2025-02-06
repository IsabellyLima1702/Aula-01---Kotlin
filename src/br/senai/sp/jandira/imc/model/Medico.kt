package br.senai.sp.jandira.imc.model

class Medico {

    var nome: String = ""
    var especialidades: ArrayList<String> = ArrayList<String>()
    var crm: String = ""

    fun exibirFichaDoMedico(){
        println("---------------------------")
        println("NOME: $nome")
        println("CRM: $crm")
        println("Especialidades:")
        println("---------------------------")
        for(especialidade in especialidades){
            println("    -$especialidade")
        }
        println("===========================")
    }
}