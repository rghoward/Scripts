package io.intercom.android.sdk.utilities.commons;

import defpackage.qi1;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface TimeProvider {
    public static final TimeProvider SYSTEM = new qi1();

    long currentTimeMillis();
}
