package model

    open class Carro {
        var modelo: String =  ""
        get() {
            return field.uppercase()
        }

        var ano: Int = 0
            set(value)  {
                field = if (value >=0) value else 0
            }
        open fun acelerar(){
            println("Vrum-vrum")

        }

        var kilometragem: Double = 140.0

        fun rodar(km: Double) {
            kilometragem += km

        }

        fun consultarKm(): Double {
            return kilometragem
        }

    }