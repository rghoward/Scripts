package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cx2 implements ra3 {
    @Override // defpackage.ra3
    public final void a(td3 td3Var) {
        td3Var.f(0, td3Var.a.a(), BuildConfig.FLAVOR);
    }

    public final boolean equals(Object obj) {
        return obj instanceof cx2;
    }

    public final int hashCode() {
        return ll8.a(cx2.class).hashCode();
    }

    public final String toString() {
        return "DeleteAllCommand()";
    }
}
