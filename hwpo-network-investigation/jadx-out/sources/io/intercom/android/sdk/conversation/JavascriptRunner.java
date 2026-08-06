package io.intercom.android.sdk.conversation;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class JavascriptRunner {
    private final Collection<Runnable> actionsAfterLoad;
    private boolean hasLoaded;
    private final WebView webView;

    public JavascriptRunner(WebView webView, Collection<Runnable> collection) {
        this.hasLoaded = false;
        this.webView = webView;
        this.actionsAfterLoad = collection;
    }

    public synchronized void clearPendingScripts() {
        this.actionsAfterLoad.clear();
    }

    public synchronized void reset() {
        this.hasLoaded = false;
        clearPendingScripts();
    }

    public synchronized void run(final String str) {
        try {
            Runnable runnable = new Runnable() { // from class: io.intercom.android.sdk.conversation.JavascriptRunner.1
                @Override // java.lang.Runnable
                public void run() {
                    JavascriptRunner.this.webView.loadUrl("javascript:" + str);
                }
            };
            if (this.hasLoaded) {
                this.webView.post(runnable);
            } else {
                this.actionsAfterLoad.add(runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void runPendingScripts() {
        try {
            this.hasLoaded = true;
            Iterator<Runnable> it = this.actionsAfterLoad.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            clearPendingScripts();
        } catch (Throwable th) {
            throw th;
        }
    }

    public JavascriptRunner(WebView webView) {
        this(webView, new ArrayList());
    }
}
