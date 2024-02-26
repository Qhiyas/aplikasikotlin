package com.example.aplikasikotlin

fun main(args: Array<String>) {
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    biodata("Qhiyas Adi Saputra","2A","Magetan")
    hobby("Menonton","Memancing emosi orang")
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
}

fun biodata(nama: String, kelas:String ,Alamat:String){
    val biodata = """
        nama = $nama
        kelas = $kelas 
        Alamat= $Alamat
    """
    print(biodata)
}

fun hobby(nama:String, desc:String){
    println("hobby = $nama")
    println(desc)

}
