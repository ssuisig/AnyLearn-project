package ddwu.mobile.test.anylearn

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ddwu.mobile.test.anylearn.databinding.ScriptNameInputBinding

class ScriptNameInput : AppCompatActivity() {

    lateinit var sniBinding : ScriptNameInputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sniBinding = ScriptNameInputBinding.inflate(layoutInflater)
        setContentView(sniBinding.root)

        sniBinding.nameInputListBtn.setOnClickListener{
            val intent = Intent(this, MyScriptList::class.java)
            startActivity(intent)
        }
    }
}