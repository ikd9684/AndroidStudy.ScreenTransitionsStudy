package jp.co.excite_software.s_ikeda.screen_transitions_study

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import jp.co.excite_software.s_ikeda.screen_transitions_study.ui.main.FirstFragment


class FragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        //FragmentTransactionを生成して処理を開始
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        //レイアウトコンテナにFragmentを展開
        transaction.replace(R.id.container, FirstFragment())
        //処理実行
        transaction.commit()
    }
}
