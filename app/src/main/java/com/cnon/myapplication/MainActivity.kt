package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.io.File
import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        println(applicationContext.filesDir)

        // dosyanın telefondaki yerini gösterir
        var dd1= File(applicationContext.filesDir, "sinem2.txt")

        try {

            var dosya = FileWriter(dd1,true);
            // append true olursa dosyaya ekleme yapar false olursa üstüne yazar

            dosya.write("sinan\n")


            dosya.close()
            println("Dosyaya yazma işlemi bitmiştir")

        }
        catch (e: Exception)
        {
            println("Dosyaya yazılamadı: "+e)


        }


        var dosya : FileReader? = null
        println("............................")

        var rtyhg: String=""

        try {
            dosya = FileReader( "${applicationContext.filesDir}/sinem2.txt")
            var oku :Int =0
            while(oku!=-1)
            {

                //rtyhg+=oku
                print(oku.toChar())
                oku = dosya.read()
            }
            println(rtyhg)
        }
        catch(e : Exception)
        {
            println("Dosya okunamadı: $e")
        }
        finally {
            dosya?.close()
            println("............................")
        }
    }
}