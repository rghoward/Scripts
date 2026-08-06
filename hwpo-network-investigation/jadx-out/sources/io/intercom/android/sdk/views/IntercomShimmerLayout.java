package io.intercom.android.sdk.views;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.jn9;
import defpackage.mn9;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class IntercomShimmerLayout extends mn9 {
    private static final jn9 SHIMMER_CONFIG;

    static {
        jn9.a aVar = new jn9.a();
        aVar.a.m = 0.0f;
        SHIMMER_CONFIG = aVar.f(0.01f).d(1500L).e(0.6f).g(100L).a();
    }

    public IntercomShimmerLayout(Context context) {
        super(context);
        init();
    }

    private void init() {
        setShimmer(SHIMMER_CONFIG);
    }

    public IntercomShimmerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public IntercomShimmerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
