package vcmsa.ci.myassignmentfinal

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btnSelect = findViewById<Button>(R.id.btnSelect)

        btnSelect.setOnClickListener {
            val btnClear = findViewById<Button>(R.id.btnClear)
            val inputdayText = findViewById<EditText>(R.id.inputdayText)
            val txtSuggest = findViewById<TextView>(R.id.txtSuggest)
            btnClear?.setOnClickListener{
                txtSuggest.text=""
                inputdayText.text.clear()

            }
            val daytime = inputdayText.text.toString()
            if(daytime !=null){

                if (daytime == ""){
                    txtSuggest.text = "Please enter time of day: Morning,Evening,Afternoon"
                } else
                    if (daytime == "Morning")
                        txtSuggest.text ="Bacon and eggs with apple juice"
                    else
                        if (daytime == "Mid-morning" ) {
                            txtSuggest.text = "Avocado and toast "
                        }else
                            if (daytime == "Lunch") {
                                txtSuggest.text = "Chicken wraps"
                            } else
                                if (daytime == "Lunch snack") {
                                    txtSuggest.text ="Fruit salad"
                                }else
                                    if (daytime == "Dinner") {
                                        txtSuggest.text ="Pap and wors"
                                    } else
                                        txtSuggest.text="Please enter valid day time"
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

//private fun clear() {
// TODO("Not yet implemented")








