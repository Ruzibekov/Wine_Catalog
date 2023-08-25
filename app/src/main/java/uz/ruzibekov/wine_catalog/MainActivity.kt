package uz.ruzibekov.wine_catalog

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import uz.ruzibekov.wine_catalog.data.model.CatalogData
import uz.ruzibekov.wine_catalog.ui.navigation.MainNavGraph
import uz.ruzibekov.wine_catalog.ui.theme.AppColor
import uz.ruzibekov.wine_catalog.ui.theme.WineCatalogTheme
import java.io.IOException
import java.io.InputStream

class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        fetch()

        setContent {
            WineCatalogTheme {

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(AppColor.Background)
                ) {

                    val navController = rememberNavController()

                    MainNavGraph.Default(navController = navController)
                }
            }
        }
    }

    private fun fetch() {
        val json = loadJSONFromAsset("wines_catalog.json")
        val type = object : TypeToken<List<CatalogData>>() {}.type

        val list = Gson().fromJson<List<CatalogData>>(json, type)

        viewModel.fetch(list)
    }

    fun loadJSONFromAsset(path: String): String? {
        return try {
            val `is`: InputStream = assets.open(path)
            val size = `is`.available()
            val buffer = ByteArray(size)
            Log.i("RRR", buffer.toString())
            `is`.read(buffer)
            `is`.close()
            String(buffer)
        } catch (ex: IOException) {
            ex.printStackTrace()
            return null
        }
    }
}