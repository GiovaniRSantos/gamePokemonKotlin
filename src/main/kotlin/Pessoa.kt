class Pessoa(var dinheiro: Int) {
    val nomeJogador = readLine()!!
    var nome = nomeJogador
    lateinit var pokemonSelecionado: String
    var pokemons = mutableListOf<String>()


    fun selecionarPokemon() {
        var pokemonEletrico = PokemonEletrico()
        var pokemonFogo = PokemonAgua()
        var pokemonAgua = PokemonFogo()

        println("Olá $nome, você poderá escolher agora o Pokemon que irá lhe acompanhar nessa jornada!")
        println("Você possui 3 escolhas: ")
        println("1 - ${pokemonAgua.nome}")
        println("2 - ${pokemonEletrico.nome}")
        println("3 - ${pokemonFogo.nome}")

        var pokemonEscolhido = readLine()!!

        when (pokemonEscolhido) {
            "1" -> {
                pokemonSelecionado = pokemonAgua.nome
                println("O Pokemon ${pokemonSelecionado} será seu companheiro!")
            }
            "2" -> {
                pokemonSelecionado = pokemonEletrico.nome
                println("O Pokemon ${pokemonSelecionado} será seu companheiro!")
            }
            "3" -> {
                pokemonSelecionado = pokemonFogo.nome
                println("O Pokemon ${pokemonSelecionado} será seu companheiro!")
            }
            else -> {
                println("Para prosseguir, você precisa escolher um Pokemon... Reiniciando processo de escolha de Pokemon.")
                var retry = this.selecionarPokemon()
                retry
            }
        }
        pokemons.add(pokemonSelecionado)

    }

    fun mostrarPokemons(): MutableList<String> {
        pokemons.forEach { println("Estes são seus pokemons: ${pokemons}.") }
        return pokemons
    }

    fun escolherPokemon(pokemon: String): Any {
        if (pokemon in pokemons) {
            println("${nome} escolheu o pokemon ${pokemon}.")
            return pokemon
        } else {
            return println("ERRO: Pokemon não encontrado.")
        }
    }

    fun mostrarDinheiro() {
        println("Você possui $${dinheiro} em sua conta.")
    }

    fun ganharDinheiro(quantidade: Int) {
        dinheiro = +quantidade
        print("Você ganhou $${quantidade}.\n")
        this.mostrarDinheiro()
    }
}


fun iniciarPessoa() {
    var pessoa = Pessoa(0)
    pessoa.selecionarPokemon()
    pessoa.mostrarPokemons()
    var escolherPokemon = readLine()!!
    pessoa.escolherPokemon(escolherPokemon)
    pessoa.ganharDinheiro(100)
}
