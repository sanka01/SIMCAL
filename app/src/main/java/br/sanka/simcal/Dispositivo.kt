package br.sanka.simcal

class Dispositivo constructor(nome: String,comodo: Comodo){
    var status : Boolean = false
    var mensagem : ArrayList<Mensagem> = arrayListOf()

    fun MudaEstado(){
        status = !status
    }


}