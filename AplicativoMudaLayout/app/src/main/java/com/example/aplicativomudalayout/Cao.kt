package com.example.aplicativomudalayout
// implementa a classe cão que herda os //métodos da classe mãe e os reescreve
class Cao : Animal( ) {
    override public fun tipo () : String
    {
        return "cao"
    }
    override public fun come() : String
    {
        return "osso"
    }
    override public fun som (): String
    {
        return "au au "
    }
}
