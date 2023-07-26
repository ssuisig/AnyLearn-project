package ddwu.mobile.test.anylearn

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ddwu.mobile.test.anylearn.databinding.WithaiLevelBinding

class WithaiLevel : AppCompatActivity() {

    lateinit var wlBinding : WithaiLevelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        wlBinding = WithaiLevelBinding.inflate(layoutInflater)
        setContentView(wlBinding.root)

        wlBinding.levelFinishBtn.setOnClickListener{
            val intent = Intent(this, ScriptSaveChoice::class.java)
            startActivity(intent)
        }
    }
}