package br.senai.sp.jandira.imc

import br.senai.sp.jandira.imc.model.Consulta
import br.senai.sp.jandira.imc.model.Medico
import br.senai.sp.jandira.imc.model.Paciente
import java.time.LocalDate
import java.time.LocalTime
import java.time.Period

fun main() {
    println("Olá mundo!!")

    var nomeEscola = "senai"

    nomeEscola = "sesi"

    nomeEscola = "10"

    var idade = 19

    var email: String
    var preco: Double
    preco = 11.0

    var peso: Int
    peso = -129

    var aprovado = true
    var ligado:  Boolean

    ligado = false

    var dataNascimento = LocalDate.of(2008, 4, 17)
    println(dataNascimento.dayOfWeek)
    println(LocalTime.now())

    var hoje = LocalDate.now()
    idade = Period.between(dataNascimento,hoje).years
    println(idade)

    var dataAbertura = LocalDate.of(2026,6,11)
    var dias = Period.between(hoje, dataAbertura).days
    println(dias)

    println("---------------------------")

    var paciente1 = Paciente()
    paciente1.nome = "Ana Maria"
    paciente1.peso = 53
    paciente1.altura = 1.70
    paciente1.dataNascimento = LocalDate.of(2003,8,14)
    paciente1.exibirDados()

    var paciente2 = Paciente()
 paciente2.nome = "Isabelly Lima"
 paciente2.peso = 53
 paciente2.altura = 1.63
 paciente2.dataNascimento = LocalDate.of(2008,4,17)
 paciente2.exibirDados()

    //Criar um objeto Médico
    var medico1 = Medico()
    medico1.nome = "Paula Oliveira"
    medico1.crm =  "33333-09"
    medico1.especialidades.add("Clínico Geral")
    medico1.especialidades.add("Cardiologista")
    medico1.especialidades.add("Dermatologista")
    medico1.exibirFichaDoMedico()

    //Criar consulta
    var consulta1 = Consulta() //Para atribuir valor sendo o atributo privado
    consulta1.marcarConsulta(900.0,
        medico1,
        paciente1,
        LocalDate.of(2025,2,23),
        LocalTime.of(10, 30)
    )
    consulta1.mostrarConsulta()



    //Criar lista de frutas
//    var frutas = ArrayList<String>()
//    frutas.add("Banana")
//    frutas.add("Melancia")
//    frutas.add("Uva")
//    frutas.add("Manga")
//
//    println(frutas.count()) // Uma forma de contar a quantidade de frutas
//    println(frutas.size) // Otra forma de contar a quantidade
//
//    println(frutas[2]) // Para localizar qual é a fruta 2
//
//    frutas[1] = "Melão" // Para mudar o nome da fruta 1
//    println(frutas[1])
//
//    println(frutas) // Exibir todas as frutas
//
//    println("---------------------------")
//    for(fruta in frutas){
//        println(fruta)
//    }
//    println("---------------------------")
//
//    var i = 0
//    while(i < frutas.count()){ //Para aparecer as frutas em sequencia; uma embaixo da outra e numerado.
//        println("$i - ${frutas[i]}")
//        i++
//    }
//    println("---------------------------")
//
//    var contador = 1
//    while(contador <= 10){
//        println("$contador - SENAI")
//        contador++
//        //contador += 2 -> Para sair os números de dois em dois
//    }
//    println("---------------------------")
//
//    for(voltas in 1..100 step 3){ //intervalo de voltas. A parte do step é para aparecer os números de 3 em 3
//        println("$voltas - SESI")
//
//    }
}