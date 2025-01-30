import java.time.LocalDate
import java.time.Period
import kotlin.math.pow

class Paciente {

    var nome: String = ""
    var dataNascimento: LocalDate? = null
    var peso: Int = 0
    var altura: Double = 0.0

    private fun calcularImc(): Double{
        return peso / altura.pow(2)
    }

    fun exibirDados(){
        println("---------------------------")
        println("RESULTADOS")
        println("---------------------------")
        println("NOME: $nome")
        println("PESO: $peso")
        println("ALTURA: $altura")
        println("IMC: ${calcularImc()}")
        println("IDADE: ${calcularIdade()}")
        println("---------------------------")
    }
    fun calcularIdade(): Int{

        var hoje = LocalDate.now()
        var nascimento = Period.between(dataNascimento, hoje).years
        return nascimento
    }

}

