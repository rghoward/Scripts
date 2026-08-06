package io.intercom.android.sdk.api;

import defpackage.d91;
import defpackage.g2b;
import defpackage.g52;
import defpackage.ol8;
import defpackage.tm5;
import defpackage.vd9;
import defpackage.vl5;
import defpackage.wq6;
import defpackage.ys3;
import io.ably.lib.http.HttpConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class KotlinXConvertorFactory {
    public static final int $stable = 0;
    public static final KotlinXConvertorFactory INSTANCE = new KotlinXConvertorFactory();

    private KotlinXConvertorFactory() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b getConvertorFactory$lambda$0(vl5 vl5Var) {
        vl5Var.getClass();
        vl5Var.b = true;
        vl5Var.a = true;
        return g2b.a;
    }

    public final g52.a getConvertorFactory() {
        ol8 ol8Var = wq6.e;
        return new ys3(wq6.a.a(HttpConstants.ContentTypes.JSON), new vd9.a(tm5.a(new d91(1))));
    }
}
