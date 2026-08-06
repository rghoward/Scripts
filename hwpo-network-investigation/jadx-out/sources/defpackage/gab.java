package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gab implements el0 {
    public static final a Companion = new a();
    public final List<vy2> a;
    public final ej0 b;
    public final mr0 c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final js7<xn0, m2b> j;
    public final boolean k;
    public final t59 l;
    public final m59 m;
    public final vz7 n;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gab(List<vy2> list, ej0 ej0Var, mr0 mr0Var, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, js7<? extends xn0, ? extends m2b> js7Var, boolean z5, t59 t59Var, m59 m59Var, vz7 vz7Var) {
        this.a = list;
        this.b = ej0Var;
        this.c = mr0Var;
        this.d = str;
        this.e = z;
        this.f = z2;
        this.g = str2;
        this.h = z3;
        this.i = z4;
        this.j = js7Var;
        this.k = z5;
        this.l = t59Var;
        this.m = m59Var;
        this.n = vz7Var;
    }

    public static gab a(gab gabVar, List list, ej0 ej0Var, mr0 mr0Var, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, js7 js7Var, boolean z5, t59 t59Var, m59 m59Var, vz7 vz7Var, int i) {
        List list2 = (i & 1) != 0 ? gabVar.a : list;
        ej0 ej0Var2 = (i & 2) != 0 ? gabVar.b : ej0Var;
        mr0 mr0Var2 = (i & 4) != 0 ? gabVar.c : mr0Var;
        String str3 = (i & 8) != 0 ? gabVar.d : str;
        boolean z6 = (i & 16) != 0 ? gabVar.e : z;
        boolean z7 = (i & 32) != 0 ? gabVar.f : z2;
        String str4 = (i & 64) != 0 ? gabVar.g : str2;
        boolean z8 = (i & 128) != 0 ? gabVar.h : z3;
        boolean z9 = (i & 256) != 0 ? gabVar.i : z4;
        js7 js7Var2 = (i & 512) != 0 ? gabVar.j : js7Var;
        boolean z10 = (i & 1024) != 0 ? gabVar.k : z5;
        t59 t59Var2 = (i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? gabVar.l : t59Var;
        m59 m59Var2 = (i & 4096) != 0 ? gabVar.m : m59Var;
        vz7 vz7Var2 = (i & 8192) != 0 ? gabVar.n : vz7Var;
        gabVar.getClass();
        list2.getClass();
        str3.getClass();
        str4.getClass();
        t59Var2.getClass();
        m59Var2.getClass();
        return new gab(list2, ej0Var2, mr0Var2, str3, z6, z7, str4, z8, z9, js7Var2, z10, t59Var2, m59Var2, vz7Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gab)) {
            return false;
        }
        gab gabVar = (gab) obj;
        return this.a.equals(gabVar.a) && xj5.a(this.b, gabVar.b) && xj5.a(this.c, gabVar.c) && this.d.equals(gabVar.d) && this.e == gabVar.e && this.f == gabVar.f && this.g.equals(gabVar.g) && this.h == gabVar.h && this.i == gabVar.i && xj5.a(this.j, gabVar.j) && this.k == gabVar.k && this.l.equals(gabVar.l) && this.m == gabVar.m && this.n.equals(gabVar.n);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ej0 ej0Var = this.b;
        int iHashCode2 = (iHashCode + (ej0Var == null ? 0 : ej0Var.hashCode())) * 31;
        mr0 mr0Var = this.c;
        int iA = uo2.a(uo2.a(ru3.c(uo2.a(uo2.a(ru3.c((iHashCode2 + (mr0Var == null ? 0 : mr0Var.a.hashCode())) * 31, 31, this.d), this.e, 31), this.f, 31), 31, this.g), this.h, 31), this.i, 31);
        js7<xn0, m2b> js7Var = this.j;
        return this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + uo2.a((iA + (js7Var != null ? js7Var.hashCode() : 0)) * 31, this.k, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValueDetailsViewState(valueItems=");
        sb.append(this.a);
        sb.append(", barChartData=");
        sb.append(this.b);
        sb.append(", bloodPressureChartData=");
        sb.append(this.c);
        sb.append(", displayedPeriodText=");
        sb.append(this.d);
        sb.append(", isProgress=");
        e4.a(sb, this.e, ", isContentVisible=", this.f, ", screenTitle=");
        sb.append(this.g);
        sb.append(", prevEnabled=");
        sb.append(this.h);
        sb.append(", nextEnabled=");
        sb.append(this.i);
        sb.append(", measure=");
        sb.append(this.j);
        sb.append(", isAddValueBtnVisible=");
        sb.append(this.k);
        sb.append(", scoreInfoLayoutUiState=");
        sb.append(this.l);
        sb.append(", scoreInfoLayoutExpandState=");
        sb.append(this.m);
        sb.append(", placeholderState=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }
}
