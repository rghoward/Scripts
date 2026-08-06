package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tj7 implements el0 {
    public static final a Companion = new a();
    public static final tj7 c = new tj7(hf3.t, false);
    public final List<pr8> a;
    public final boolean b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public tj7(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj7)) {
            return false;
        }
        tj7 tj7Var = (tj7) obj;
        return this.a.equals(tj7Var.a) && this.b == tj7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + uo2.a(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "OnboardingSettingsSecondPageViewState(benchmarks=" + this.a + ", isContentVisible=" + this.b + ", isProgress=false)";
    }
}
