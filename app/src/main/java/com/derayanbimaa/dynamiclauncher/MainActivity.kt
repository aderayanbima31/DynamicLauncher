package com.derayanbimaa.dynamiclauncher

import android.content.ComponentName
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener{
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, DynamicLauncherOne::class.java), PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP)
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, DynamicLauncherTwo::class.java), PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP)
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, DynamicLauncherThree::class.java), PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP)

            Toast.makeText(this@MainActivity, "Launcher DANA has been applied successfully",Toast.LENGTH_SHORT).show()
        }

        btn2.setOnClickListener{
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, DynamicLauncherOne::class.java), PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP)
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, DynamicLauncherTwo::class.java), PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP)
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, DynamicLauncherThree::class.java), PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP)

            Toast.makeText(this@MainActivity, "Launcher DANA Ramadhan has been applied successfully",Toast.LENGTH_SHORT).show()
        }

        btn3.setOnClickListener{
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, DynamicLauncherOne::class.java), PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP)
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, DynamicLauncherTwo::class.java), PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP)
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, DynamicLauncherThree::class.java), PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP)

            Toast.makeText(this@MainActivity, "Launcher DANA Agustusan has been applied successfully",Toast.LENGTH_SHORT).show()
        }
    }
}