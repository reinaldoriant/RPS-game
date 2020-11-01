interface Callback{
    fun hasil(hasil:String)
}

class Main{
    companion object:Callback{
        @JvmStatic
        fun main(args:Array<String>){
            do {
                println("==================")
                println("GAME SUIT SUIT ASEK")
                println("==================")
                println("Pilih dulu nomer satu atau dua. karena aku gamau di duain")
                println("1. Gaskeun")
                println("2. Keluar aja")
                print("Pilihanku : ")
                val a: Int= readLine()!!.toInt()
                if(a==1)
                {
                    playgame()
                }
                else if (a!=1)
                {
                    println("\nSalah bos milihmu !!!\n")
                }
            }
            while (a<2||a!=1)

        }
        private fun playgame(){
            println("==================")
            println("Masukkan antara Gunting, Batu, dan Kertas")
            print("Pemain 1 input : ")
            val a= readLine()!!
            print("Pemain 2 input : ")
            val b= readLine()!!
            val suit=Modelsuit(a,b)
            val controller=Controllersuit(this)
            controller.setSuit(suit)
            controller.hasilsuit()
        }
        override fun hasil(hasil: String) {
            print("HASILNYA ADALAH ")
            println(hasil)
        }
    }
}