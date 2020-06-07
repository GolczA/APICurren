package c23om.example.api1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*
import okhttp3.*
import java.io.IOException

class MainActivity2 : AppCompatActivity() {

    companion object {
        const val NAME_CURR = "Nam_Cur"
        const val  CURR_PAIR = "Curr_Pair"
    }
    private var client:OkHttpClient = OkHttpClient()

    var course1: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var nameC = intent.getStringExtra(NAME_CURR)
        var currencyPair = intent.getStringExtra(CURR_PAIR)

        course1 = findViewById(R.id.course)

        run (currencyPair, course, nameC)
    }


    fun run(cur: String, t:TextView, name:String) {
        val url: String =
            "https://currate.ru/api/?get=rates&pairs=$cur&key=a1c28973be7be6e19e1eaac3c2babefc"
        val request = Request.Builder()
            .url(url)
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {}
            override fun onResponse(call: Call, response: Response) {
                t.text = (name + response.body()?.string().toString().substring(50, 56) + " руб ")//= println(response.body()?.string())
            }
        })
    }
}