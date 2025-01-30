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
}