package io.intercom.android.sdk.blocks.messengercard;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import defpackage.el5;
import defpackage.g2b;
import defpackage.kk0;
import defpackage.t72;
import defpackage.u72;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.data.IntercomEvent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class CardWebView extends WebView {
    private t72 eventScope;

    public CardWebView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ g2b lambda$setUp$0(IntercomEvent intercomEvent) {
        if (intercomEvent == IntercomEvent.CardUpdated.INSTANCE) {
            reload();
        }
        return g2b.a;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        t72 t72Var = this.eventScope;
        if (t72Var != null) {
            el5 el5Var = (el5) t72Var.getCoroutineContext().d0(el5.a.t);
            if (el5Var != null) {
                el5Var.k(null);
            }
            this.eventScope = null;
        }
        super.destroy();
    }

    public void setUp() {
        getSettings().setAllowFileAccess(false);
        this.eventScope = u72.b();
        Injector.get().getDataLayer().listenToEvents(this.eventScope, new kk0(1, this));
    }

    public CardWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
