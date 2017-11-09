package camelcase.searchemall

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.fragment_test.*
import kotlinx.android.synthetic.main.fragment_test.view.*

class FragmentTest : Fragment(){
    var url: String? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_test,container,false)
        view.webview.webViewClient = WebViewClient()
        view.webview.loadUrl(url)
        return view
    }

    override fun onPause() {
        super.onPause()
        webview.onPause()
    }
}