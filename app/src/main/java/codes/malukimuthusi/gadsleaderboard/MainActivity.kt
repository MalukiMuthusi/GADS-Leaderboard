package codes.malukimuthusi.gadsleaderboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.core.content.ContextCompat
import codes.malukimuthusi.gadsleaderboard.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewPagerAdapter = ViewPagerAdapter(this)
        binding.pager.adapter = viewPagerAdapter

        TabLayoutMediator(binding.tabLayout, binding.pager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = getString(R.string.learning_leaders)
                    tab.icon = ContextCompat.getDrawable(this, R.drawable.top_learner)
                }
                1 -> {
                    tab.text = getString(R.string.skill_iq_leaders)
                    tab.icon = ContextCompat.getDrawable(this, R.drawable.skill_iq_trimmed)
                }
            }
        }.attach()

    }
}