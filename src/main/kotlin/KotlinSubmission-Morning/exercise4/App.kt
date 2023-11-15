package id.infinitelearning.KotlinSubmission.exercise4
import sun.security.validator.ValidatorException


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    fun validateAndsayHello(nama: String){
        if (nama.isBlank()){
            throw ValidatorException("Data is blank")
        }else{
            println("Hello $nama")
        }
    }
fun main(){
    try {
        validateAndsayHello("Kholis")
        validateAndsayHello("")
    }catch (error: ValidatorException){
        println("Terjadi Kesalahan ${error.message}")
    }
}