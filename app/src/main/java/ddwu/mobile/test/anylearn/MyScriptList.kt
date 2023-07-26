package ddwu.mobile.test.anylearn

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ddwu.mobile.test.anylearn.databinding.MyScriptListBinding

class MyScriptList : AppCompatActivity() {

    lateinit var mslBinding : MyScriptListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mslBinding = MyScriptListBinding.inflate(layoutInflater)
        setContentView(mslBinding.root)
    }
}