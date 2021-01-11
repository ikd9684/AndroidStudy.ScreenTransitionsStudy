package jp.co.excite_software.s_ikeda.screen_transitions_study

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction


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

    fun backFragment() {
        supportFragmentManager.popBackStack()
    }

    fun nextFragment(fragment: Fragment) {
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
//        transaction.setCustomAnimations(
//            R.anim.nav_up_enter_anim,
//            R.anim.nav_up_exit_anim,
//            R.anim.nav_up_pop_enter_anim,
//            R.anim.nav_up_pop_exit_anim
//        )
        transaction.addToBackStack(null)
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }
}
