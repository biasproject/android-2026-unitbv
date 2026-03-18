package cst.unitbvfmi2026

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cst.unitbvfmi2026.ui.theme.UnitBvFMI2026Theme

enum class Colors(id: Int, nameResId: Int) {
	RED(0, R.string.red),
	YELLOW(1, R.string.yellow),
	GREEN(2, R.string.green)
}

object ClassUser {
	private val name: String = "John"
	public var name2: String? = null

	val nameL: String by lazy {
		"ss"
	}

	lateinit var nameI: String

	fun playWithNames() {
		nameI = name2?.let {
			"Do something"
		} ?: "Do something else"

		nameL.length

		nameI.length
	}
}

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			UnitBvFMI2026Theme {
				Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
					Greeting(
						name = "Android",
						modifier = Modifier.padding(innerPadding)
					)
				}
			}
		}

		Log.e("MainActivity", "onCreate")
	}

	override fun onStart() {
		super.onStart()
		Log.e("MainActivity", "onStart")
	}

	override fun onResume() {
		super.onResume()
		Log.e("MainActivity", "onResume")
	}

	override fun onPause() {
		super.onPause()
		Log.e("MainActivity", "onPause")
	}

	override fun onStop() {
		super.onStop()
		Log.e("MainActivity", "onStop")
	}

	override fun onDestroy() {
		super.onDestroy()
		Log.e("MainActivity", "onDestroy")
	}
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
	Text(
		text = "Hello $name!",
		modifier = modifier
	)
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
	UnitBvFMI2026Theme {
		Greeting("Android")
	}
}