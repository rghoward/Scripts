package defpackage;

import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class rv7 {
    public final boolean a;
    public final boolean b;
    public final js7<Boolean, Boolean> c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final List<String> k;
    public final String l;
    public final List<l89> m;
    public final List<l89> n;
    public final zc8 o;

    public rv7(boolean z, boolean z2, js7<Boolean, Boolean> js7Var, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, List<String> list, String str, List<l89> list2, List<l89> list3, zc8 zc8Var) {
        list.getClass();
        str.getClass();
        zc8Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = js7Var;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = list;
        this.l = str;
        this.m = list2;
        this.n = list3;
        this.o = zc8Var;
    }

    public static rv7 a(rv7 rv7Var, boolean z, js7 js7Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, List list, String str, ArrayList arrayList, ArrayList arrayList2, zc8 zc8Var, int i) {
        boolean z9 = rv7Var.a;
        boolean z10 = (i & 2) != 0 ? rv7Var.b : z;
        js7 js7Var2 = (i & 4) != 0 ? rv7Var.c : js7Var;
        boolean z11 = (i & 8) != 0 ? rv7Var.d : z2;
        boolean z12 = (i & 16) != 0 ? rv7Var.e : z3;
        boolean z13 = (i & 32) != 0 ? rv7Var.f : z4;
        boolean z14 = (i & 64) != 0 ? rv7Var.g : z5;
        boolean z15 = (i & 128) != 0 ? rv7Var.h : z6;
        boolean z16 = (i & 256) != 0 ? rv7Var.i : z7;
        boolean z17 = (i & 512) != 0 ? rv7Var.j : z8;
        List list2 = (i & 1024) != 0 ? rv7Var.k : list;
        String str2 = (i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? rv7Var.l : str;
        List<l89> list3 = (i & 4096) != 0 ? rv7Var.m : arrayList;
        List<l89> list4 = (i & 8192) != 0 ? rv7Var.n : arrayList2;
        zc8 zc8Var2 = (i & 16384) != 0 ? rv7Var.o : zc8Var;
        rv7Var.getClass();
        js7Var2.getClass();
        list2.getClass();
        str2.getClass();
        list3.getClass();
        list4.getClass();
        zc8Var2.getClass();
        return new rv7(z9, z10, js7Var2, z11, z12, z13, z14, z15, z16, z17, list2, str2, list3, list4, zc8Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv7)) {
            return false;
        }
        rv7 rv7Var = (rv7) obj;
        return this.a == rv7Var.a && this.b == rv7Var.b && xj5.a(this.c, rv7Var.c) && this.d == rv7Var.d && this.e == rv7Var.e && this.f == rv7Var.f && this.g == rv7Var.g && this.h == rv7Var.h && this.i == rv7Var.i && this.j == rv7Var.j && xj5.a(this.k, rv7Var.k) && xj5.a(this.l, rv7Var.l) && xj5.a(this.m, rv7Var.m) && xj5.a(this.n, rv7Var.n) && xj5.a(this.o, rv7Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + ho2.a(ho2.a(ru3.c(ho2.a(uo2.a(uo2.a(uo2.a(uo2.a(uo2.a(uo2.a(uo2.a((this.c.hashCode() + uo2.a(Boolean.hashCode(this.a) * 31, this.b, 31)) * 31, this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), this.i, 31), this.j, 31), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerformanceLayoutUiState(isPerformanceLayoutVisible=");
        sb.append(this.a);
        sb.append(", isPerformanceLayoutCanBeExpanded=");
        sb.append(this.b);
        sb.append(", isPerformanceLayoutExpanded=");
        sb.append(this.c);
        sb.append(", isCompletedCheckboxEnabled=");
        sb.append(this.d);
        sb.append(", isScoringDetailsTitleVisible=");
        e4.a(sb, this.e, ", isScoreDescriptionTextVisible=", this.f, ", isPerformanceTextVisible=");
        e4.a(sb, this.g, ", isMediaAttachmentsListVisible=", this.h, ", isFileAttachmentsListVisible=");
        e4.a(sb, this.i, ", isCompletedCheckboxChecked=", this.j, ", scoreDescription=");
        sb.append(this.k);
        sb.append(", performanceText=");
        sb.append(this.l);
        sb.append(", mediaAttachments=");
        sb.append(this.m);
        sb.append(", fileAttachments=");
        sb.append(this.n);
        sb.append(", score=");
        sb.append(this.o);
        sb.append(")");
        return sb.toString();
    }

    public rv7() {
        this(0);
    }

    public /* synthetic */ rv7(int i) {
        Boolean bool = Boolean.FALSE;
        js7 js7Var = new js7(bool, bool);
        zc8 zc8Var = new zc8(0);
        hf3 hf3Var = hf3.t;
        this(false, false, js7Var, false, false, false, false, false, false, false, hf3Var, BuildConfig.FLAVOR, hf3Var, hf3Var, zc8Var);
    }
}
