package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class uka implements el0 {
    public final String a;

    public /* synthetic */ uka(int i) {
        this(BuildConfig.FLAVOR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uka) && xj5.a(this.a, ((uka) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sk0.c("ThankYouViewState(subtitle=", this.a, ")");
    }

    public uka() {
        this(0);
    }

    public uka(String str) {
        this.a = str;
    }
}
