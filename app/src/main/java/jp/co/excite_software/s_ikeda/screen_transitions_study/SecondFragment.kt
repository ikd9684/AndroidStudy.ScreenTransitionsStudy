package jp.co.excite_software.s_ikeda.screen_transitions_study

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import jp.co.excite_software.s_ikeda.screen_transitions_study.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imageButtonBackTo1st.setOnClickListener {
            (requireActivity() as? FragmentActivity)?.let { activity ->
                activity.backFragment()
            }
        }
        binding.buttonTo3rdFragment.setOnClickListener {
            (requireActivity() as? FragmentActivity)?.let { activity ->
                activity.nextFragment(ThirdFragment())
            }
        }
    }
}
