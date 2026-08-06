package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class t59 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final List<String> e;
    public final List<l89> f;
    public final List<l89> g;
    public final long h;

    public t59(boolean z, boolean z2, boolean z3, String str, List<String> list, List<l89> list2, List<l89> list3, long j) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = list;
        this.f = list2;
        this.g = list3;
        this.h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t59)) {
            return false;
        }
        t59 t59Var = (t59) obj;
        return this.a == t59Var.a && this.b == t59Var.b && this.c == t59Var.c && xj5.a(this.d, t59Var.d) && xj5.a(this.e, t59Var.e) && xj5.a(this.f, t59Var.f) && xj5.a(this.g, t59Var.g) && this.h == t59Var.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + ho2.a(ho2.a(ho2.a(ru3.c(uo2.a(uo2.a(Boolean.hashCode(this.a) * 31, this.b, 31), this.c, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        return "ScoreInfoLayoutUiState(isLayoutVisible=" + this.a + ", isMediaAttachmentsListVisible=" + this.b + ", isFileAttachmentsListVisible=" + this.c + ", description=" + this.d + ", tags=" + this.e + ", mediaAttachments=" + this.f + ", fileAttachments=" + this.g + ", updatedAt=" + this.h + ")";
    }

    public t59() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ t59(int i) {
        hf3 hf3Var = hf3.t;
        this(false, false, false, BuildConfig.FLAVOR, hf3Var, hf3Var, hf3Var, 0L);
    }
}
