package ddwu.mobile.test.anylearn

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ddwu.mobile.test.anylearn.databinding.ScriptSaveChoiceBinding

class ScriptSaveChoice : AppCompatActivity() {

    lateinit var sscBinding : ScriptSaveChoiceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sscBinding = ScriptSaveChoiceBinding.inflate(layoutInflater)
        setContentView(sscBinding.root)

        sscBinding.saveBtn.setOnClickListener{
            val intent = Intent(this, ScriptNameInput::class.java)
            startActivity(intent)
        }
    }
}