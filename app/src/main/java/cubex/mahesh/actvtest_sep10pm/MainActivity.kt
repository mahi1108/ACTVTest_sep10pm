package cubex.mahesh.actvtest_sep10pm

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    /*    var values:Array<String> =
                resources.getStringArray(R.array.countries) */
        var values = mutableListOf<String>()
        values.add("Sri Lanka")
        values.add("Saudi Arebia")
        values.add("South Africa")
        values.add("India")

        var adapter = ArrayAdapter<String>(this@MainActivity,
                android.R.layout.simple_list_item_single_choice, values)
        actv.setAdapter(adapter)
        actv.threshold = 1
    }
}
