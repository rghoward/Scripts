package io.intercom.android.sdk.ui.extension;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.r47;
import defpackage.ty0;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class NavBackStackEntryExtensionKt {
    public static final <T extends Parcelable> T getParcelableObject(r47 r47Var, String str, Class<T> cls, T t) {
        T t2;
        r47Var.getClass();
        str.getClass();
        cls.getClass();
        t.getClass();
        Bundle bundleA = r47Var.A.a();
        return (bundleA == null || (t2 = (T) ty0.a(bundleA, str, cls)) == null) ? t : t2;
    }
}
