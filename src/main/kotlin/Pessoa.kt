class Pessoa {
    val nomeJogador = readLine()!!
    var nome = nomeJogador
    lateinit var pokemonSelecionado: String


    fun escolherPokemon() {
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
                var retry = this.escolherPokemon()
                retry
            }
        }

    }
}


fun iniciarPessoa() {
    var pessoa = Pessoa()
    pessoa.escolherPokemon()
}
