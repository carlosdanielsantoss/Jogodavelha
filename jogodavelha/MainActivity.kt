import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.example.jogodavelha.MaquinaActivity
import com.example.jogodavelha.PlayerActivity
import com.example.jogodavelha.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonTwoPlayers: Button = findViewById(R.id.buttonTwoPlayers)
        val buttonVsMachine: Button = findViewById(R.id.buttonVsMachine)

        buttonTwoPlayers.setOnClickListener {
            val intent = Intent(this, PlayerActivity::class.java)
            startActivity(intent)
        }

        buttonVsMachine.setOnClickListener {
            val intent = Intent(this, MaquinaActivity::class.java)
            startActivity(intent)
        }
    }
}
