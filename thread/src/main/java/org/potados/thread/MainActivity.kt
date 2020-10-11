package org.potados.thread

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.common.io.ByteStreams
import java.io.BufferedInputStream
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL
import java.nio.ByteBuffer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStringFromUrl("https://api.github.com/zen") {
            Toast.makeText(this, it, Toast.LENGTH_LONG).show()
        }
    }

    private fun getStringFromUrl(url: String, callback: (String) -> Unit) {
        Thread {
            val urlConnection = URL(url).openConnection() as HttpURLConnection

            try {
                val data = streamToString(urlConnection.inputStream)

                Handler(Looper.getMainLooper()).post {
                    callback(data)
                }

            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                urlConnection.disconnect()
            }

        }.start()
    }

    private fun streamToString(stream: InputStream): String {
        return String(ByteStreams.toByteArray(stream))
    }
}
