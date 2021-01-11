package jp.co.excite_software.s_ikeda.screen_transitions_study

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import jp.co.excite_software.s_ikeda.screen_transitions_study.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imageButtonBackToActivity.setOnClickListener {
            (requireActivity() as? FragmentActivity)?.let { activity ->
                activity.finish()
            }
        }
        binding.buttonTo2ndFragment.setOnClickListener {
            (requireActivity() as? FragmentActivity)?.let { activity ->
                activity.nextFragment(SecondFragment())
            }
        }
    }
}