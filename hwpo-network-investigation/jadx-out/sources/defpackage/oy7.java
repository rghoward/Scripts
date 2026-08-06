package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oy7 implements el0 {
    public static final a Companion = new a();
    public static final oy7 e = new oy7(false, false, null, hf3.t);
    public final boolean a;
    public final boolean b;
    public final m82 c;
    public final List<m82> d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public oy7(boolean z, boolean z2, m82 m82Var, List<m82> list) {
        this.a = z;
        this.b = z2;
        this.c = m82Var;
        this.d = list;
    }

    public static oy7 a(oy7 oy7Var, boolean z, boolean z2, m82 m82Var, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            z = oy7Var.a;
        }
        if ((i & 2) != 0) {
            z2 = oy7Var.b;
        }
        if ((i & 4) != 0) {
            m82Var = oy7Var.c;
        }
        List<m82> list = arrayList;
        if ((i & 8) != 0) {
            list = oy7Var.d;
        }
        oy7Var.getClass();
        return new oy7(z, z2, m82Var, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy7)) {
            return false;
        }
        oy7 oy7Var = (oy7) obj;
        return this.a == oy7Var.a && this.b == oy7Var.b && xj5.a(this.c, oy7Var.c) && this.d.equals(oy7Var.d);
    }

    public final int hashCode() {
        int iA = uo2.a(Boolean.hashCode(this.a) * 31, this.b, 31);
        m82 m82Var = this.c;
        return this.d.hashCode() + ((iA + (m82Var == null ? 0 : m82Var.hashCode())) * 31);
    }

    public final String toString() {
        return "PickCountryViewState(isProgress=" + this.a + ", isSaveButtonEnabled=" + this.b + ", selectedCountry=" + this.c + ", countries=" + this.d + ")";
    }
}
