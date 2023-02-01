interface SeaСreature {
    fun eating()
}


class Salmon: SeaСreature {
    override fun eating() {
        println("Пожалуй съем пару мелких рыбешек")
    }
}

class SeaHorse : SeaСreature {
    override fun eating() {
        println("Как на счет креветок?")
    }
}

class Shark : SeaСreature {
    override fun eating() {
        println("Обожаю людей!")
    }
}


class CreatureFactory {
    fun makeCreature(type: CreatureType): SeaСreature? {
        return when (type) {
            CreatureType.SALMON -> Salmon()
            CreatureType.SEA_HORSE -> SeaHorse()
            CreatureType.SHARK -> Shark()
            else -> null
        }
    }
}

enum class CreatureType {
    SALMON,
    SEA_HORSE,
    SHARK
}

fun main() {
    val factory = CreatureFactory()
    val creature1 = factory.makeCreature(CreatureType.SHARK)
    creature1?.eating()
    val creature2 = factory.makeCreature(CreatureType.SEA_HORSE)
    creature2?.eating()
    val creature3 = factory.makeCreature(CreatureType.SALMON)
    creature3?.eating()
}