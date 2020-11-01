class Controllersuit (private val listener: Callback) {
    private var suit:Modelsuit?=null
    fun hasilsuit(){
        if (suit!!.pemain1.toLowerCase()!="batu"&&suit!!.pemain1.toLowerCase()!="gunting"&&suit!!.pemain1.toLowerCase()!="kertas"){
            val hasil ="Salah inputan boss!!"
            listener.hasil(hasil)
        }
        else if (suit!!.pemain2.toLowerCase()!="batu"&&suit!!.pemain2.toLowerCase()!="gunting"&&suit!!.pemain2.toLowerCase()!="kertas"){
            val hasil ="Salah inputan boss!!"
            listener.hasil(hasil)
        }
        else if(suit!!.pemain1.toLowerCase() == suit!!.pemain2.toLowerCase()){
            val hasil="Seri nih hasilnyaa!!"
            listener.hasil(hasil)
        }
        else if (suit!!.pemain1.toLowerCase() == "batu") {
            if(suit!!.pemain2.toLowerCase() == "gunting"){
                val hasil="Kamu Menang Pemain 1!! Yah.. Kamu Kalah Pemain 2!!"
                listener.hasil(hasil)
            }else{
                val hasil="Kamu Menang Pemain 2!! Yah.. Kamu Kalah Pemain 1!!"
                listener.hasil(hasil)
            }
        }
        else if (suit!!.pemain1.toLowerCase() == "gunting") {
            if (suit!!.pemain2.toLowerCase() == "kertas") {
                val hasil="Kamu Menang Pemain 1!! Yah.. Kamu Kalah Pemain 2!!"
                listener.hasil(hasil)
            } else {
                val hasil="Kamu Menang Pemain 2!! Yah.. Kamu Kalah Pemain 1!!"
                listener.hasil(hasil)
            }
        }
        else if (suit!!.pemain1.toLowerCase() == "kertas") {
            if (suit!!.pemain2.toLowerCase() == "batu") {
                val hasil="Kamu Menang Pemain 1!! Yah.. Kamu Kalah Pemain 2!!"
                listener.hasil(hasil)
            } else {
                val hasil="Kamu Menang Pemain 2!! Yah.. Kamu Kalah Pemain 1!!"
                listener.hasil(hasil)
            }
        }
    }
    fun setSuit(suit: Modelsuit) {
        this.suit=suit
    }
}