package io.intercom.android.sdk.blocks.messengercard;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.app.e;
import com.intercom.twig.BuildConfig;
import defpackage.aa;
import defpackage.egb;
import defpackage.fib;
import io.intercom.android.sdk.R;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
class MessengerCardAlertDialogBuilder extends e.a {
    public MessengerCardAlertDialogBuilder(Context context, Map<String, Object> map, int i, WebView webView) {
        super(context);
        setUp(context, map, i, webView);
    }

    private void setUp(Context context, final Map<String, Object> map, int i, final WebView webView) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.intercom_webview_card_input, (ViewGroup) null, false);
        setTitle((CharSequence) map.get("label"));
        final AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) viewInflate.findViewById(R.id.input);
        autoCompleteTextView.setText((CharSequence) map.get("currentValue"));
        autoCompleteTextView.setHint((CharSequence) map.get("placeholder"));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        WeakHashMap<View, fib> weakHashMap = egb.a;
        autoCompleteTextView.setBackgroundTintList(colorStateListValueOf);
        setView(viewInflate);
        setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.blocks.messengercard.MessengerCardAlertDialogBuilder.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                MessengerCardAlertDialogBuilder.this.sendResultToWebview(webView, autoCompleteTextView.getText().toString(), map);
                ((InputMethodManager) autoCompleteTextView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(autoCompleteTextView.getWindowToken(), 0);
                dialogInterface.dismiss();
            }
        });
        setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.blocks.messengercard.MessengerCardAlertDialogBuilder.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                ((InputMethodManager) autoCompleteTextView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(autoCompleteTextView.getWindowToken(), 0);
                dialogInterface.cancel();
            }
        });
    }

    public void sendResultToWebview(WebView webView, String str, Map<String, Object> map) {
        String strReplaceAll;
        try {
            strReplaceAll = URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            strReplaceAll = BuildConfig.FLAVOR;
        }
        StringBuilder sbA = aa.a("window.fallbackApp.bridgeEvent('UPDATE_TEXT', { value:'", strReplaceAll, "', id:'");
        sbA.append(map.get("id"));
        sbA.append("'})");
        webView.evaluateJavascript(sbA.toString(), null);
    }
}
