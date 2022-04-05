open class Pokemon(var especie: String) {
    var level = (0..100).random()
    open var nome: String = "Pokemon"
    var ataque = level * 5
    var vida = level * 5

    fun atacar(): Boolean {
        var ataqueEfetivo = ataque * 1.3
        vida - ataqueEfetivo

        println("$nome perdeu $ataqueEfetivo pontos de vida")

        if (vida <= 0) {
            println("$nome foi derrotado")
            return true
        } else {
            return false
        }
    }
}

class PokemonEletrico : Pokemon("Eletrico") {
    val opcoesPokemonEletrico: Set<String> = setOf("Zeraora", "Pikachu", "Helioptile", "Tynamo")
    override var nome = opcoesPokemonEletrico.random()
}

class PokemonFogo : Pokemon("Fogo") {
    val opcoesPokemonFogo: Set<String> = setOf("Growlithe", "Vulpix", "Oricorio", "Charmander")
    override var nome = opcoesPokemonFogo.random()
}

class PokemonAgua : Pokemon("Agua") {
    val opcoesPokemonAgua: Set<String> = setOf("Psyduck", "Blastoise", "Poliwhirl", "Poliwag")
    override var nome = opcoesPokemonAgua.random()
}


