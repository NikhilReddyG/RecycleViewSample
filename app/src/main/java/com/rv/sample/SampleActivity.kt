package test

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import com.rv.sample.R
import kotlinx.android.synthetic.main.activity_sample.*

class SampleActivity : AppCompatActivity() {

    val mListOfTypes : ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)

        loadCompaniesList()

        sampleRV.layoutManager = LinearLayoutManager(this)
        sampleRV.adapter = SampleAdapter(mListOfTypes, this)
        sampleRV.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

    }

    fun loadCompaniesList() {
        mListOfTypes.add("CupCake")
        mListOfTypes.add("Oreo")
        mListOfTypes.add("Dragon")
        mListOfTypes.add("CBP")
        mListOfTypes.add("Teli-vision")
        mListOfTypes.add("Music")
    }
}
