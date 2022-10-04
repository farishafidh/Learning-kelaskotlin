fun main(){
    val lamaParkir: Int
    val lamaParkir1: Int
    val biayaParkir: Double
    val biayaParkirTemp1: Double
    val biayaParkirTemp2: Double

    //rule biaya parkir

    val tarifDasar = 1.0
    val tarifBerikutnya = 0.5
    val maxTarifPerHari = 15

    lamaParkir = 8
    if(lamaParkir<=5){
        biayaParkirTemp1 = tarifDasar*lamaParkir
    }else{
        biayaParkirTemp2 = tarifDasar*5
        lamaParkir1 = lamaParkir-5
        biayaParkirTemp1 = biayaParkirTemp2 + (tarifBerikutnya*lamaParkir1)
    }

    biayaParkir = biayaParkirTemp1

    println("Lama Parkir: $lamaParkir")
    println("Biaya Parkir: $biayaParkir")
}