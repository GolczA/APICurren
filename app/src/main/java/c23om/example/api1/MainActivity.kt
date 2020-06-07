package c23om.example.api1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.*
import java.io.IOException


class MainActivity : AppCompatActivity() {

    //private var client : OkHttpClient = OkHttpClient()

    //private var portayna : String? = null
    var currencyPair : String? = null
    var nameC : String? = null


    //private  var urlds : String = "https://currate.ru/api/?get=rates&pairs=$currencyPair&key=a1c28973be7be6e19e1eaac3c2babefc"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /*fun bTT (view: View){
        rt = jpy.text.toString()
        t1?.text = rt
    }*/

    fun eurrub (view: View) {
        val randomIntent = Intent(this, MainActivity2::class.java)
        currencyPair = "EURRUB"
        nameC = "Евро - "
        randomIntent.putExtra(MainActivity2.NAME_CURR, nameC)
        randomIntent.putExtra(MainActivity2.CURR_PAIR, currencyPair)
        startActivity(randomIntent)
    }
    fun usdrub (view: View) {
        currencyPair = "USDRUB"
        nameC = "Доллар - "
        val randomIntent = Intent(this, MainActivity2::class.java)
        randomIntent.putExtra(MainActivity2.NAME_CURR, nameC)
        randomIntent.putExtra(MainActivity2.CURR_PAIR, currencyPair)
        startActivity(randomIntent)
    }
    fun btcrub (view: View) {
        currencyPair = "BTCRUB"
        nameC = "Биткоин - "
        val randomIntent = Intent(this, MainActivity2::class.java)
        randomIntent.putExtra(MainActivity2.NAME_CURR, nameC)
        randomIntent.putExtra(MainActivity2.CURR_PAIR, currencyPair)
        startActivity(randomIntent)
    }
    fun jpyrub (view: View) {
        currencyPair = "JPYRUB"
        nameC = " Иена - "
        val randomIntent = Intent(this, MainActivity2::class.java)
        randomIntent.putExtra(MainActivity2.NAME_CURR, nameC)
        randomIntent.putExtra(MainActivity2.CURR_PAIR, currencyPair)
        startActivity(randomIntent)
    }
    fun grprub (view: View) {
        currencyPair = "GBPRUB"
        nameC = " Фунт Стерлиногов - "
        val randomIntent = Intent(this, MainActivity2::class.java)
        randomIntent.putExtra(MainActivity2.NAME_CURR, nameC)
        randomIntent.putExtra(MainActivity2.CURR_PAIR, currencyPair)
        startActivity(randomIntent)
    }


    /*fun toastMe(view: View) {
        //val myToast = Toast.makeText(this, message, duration);
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }*/





    /*fun run(cur: String, t:TextView, name:String){
        val url : String = "https://currate.ru/api/?get=rates&pairs=$cur&key=a1c28973be7be6e19e1eaac3c2babefc"
        val request = Request.Builder()
                .url(url)
                .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {}
            override fun onResponse(call: Call, response: Response){
                t.text = (name + response.body()?.string().toString().substring(50,56) + " руб ")//= println(response.body()?.string())
            }
        })



    }*/



}