package vcmsa.ci.songmanager

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Input_sceen : AppCompatActivity() {

    private lateinit var addBtn: Button
    private lateinit var reviewBtn: Button
    private lateinit var exitBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_input_sceen)

        addBtn = findViewById(R.id.addBtn)
        reviewBtn = findViewById(R.id.reviewBtn)
        exitBtn = findViewById(R.id.exitBtn)

        addBtn.setOnClickListener{
            val intent = Intent(this, Add_To_Playlist::class.java)
            startActivity(intent)
        }

        reviewBtn.setOnClickListener{
            val intent = Intent(this, Review_playlist::class.java)
            startActivity(intent)
        }

        exitBtn.setOnClickListener{
            finishAffinity()
        }

    }
}