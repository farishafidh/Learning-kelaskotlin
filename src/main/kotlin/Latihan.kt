fun main(){
    var lamaParkir: Int
    var biayaParkir: Float

    //rule biaya parkir

    val tarifDasar = 1.0
    val tarifBerikutnya = 0.5
    val maxTarifPerHari = 15

    lamaParkir = 8
    if(lamaParkir<=5){
        biayaParkir = (tarifDasar*lamaParkir).toFloat()
    } else if (lamaParkir>5 && lamaParkir<24) {
        biayaParkir = 5 + (tarifBerikutnya * (lamaParkir - 5)).toFloat()
    } else{
        biayaParkir = 15 + ((lamaParkir-24)*tarifBerikutnya).toFloat()
    }

    println("Lama Parkir: $lamaParkir")
    println("Biaya Parkir: $biayaParkir")
}