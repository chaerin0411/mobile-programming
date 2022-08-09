package aca.dongyang.project6_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* 예제6-27 Kotlin 코드4 */
        webView1.webViewClient = CookWebViewClient()

        var webSet = webView1.settings
        webSet.builtInZoomControls = true

        btnGo.setOnClickListener {
            webView1.loadUrl(edtUrl.text.toString())
        }

        btnBack.setOnClickListener {
            webView1.goBack()
        }
    }
}

/* 예제6-25 Kotlin 코드2 */
class CookWebViewClient : WebViewClient() {
    /* 예제6-26 Kotlin 코드3 */
    override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
        return super.shouldOverrideUrlLoading(view, url)
    }
}
