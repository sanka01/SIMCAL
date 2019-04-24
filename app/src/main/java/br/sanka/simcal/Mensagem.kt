package br.sanka.simcal

import java.util.*

class Mensagem constructor(data : Date, texto: String, origem : Dispositivo, tipo : Int) {
    var data : Date = data
    var texto: String = texto
    var origem : Dispositivo = origem
    var tipo : Int = tipo

    companion object {
        const val   Log : Int = 0
        const val   Acao : Int = 1
        const val   Error : Int = 2
        const val   Aviso : Int = 3
        const val   Status : Int = 4
        const val   Requisicao : Int = 5
        const val   Resposta : Int = 6
    }


}