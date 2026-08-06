package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class hp8 implements el0 {
    public final boolean a;
    public final List<jo8> b;

    public hp8(List list, boolean z) {
        this.a = z;
        this.b = list;
    }

    public static hp8 a(hp8 hp8Var, boolean z, List list, int i) {
        if ((i & 1) != 0) {
            z = hp8Var.a;
        }
        if ((i & 2) != 0) {
            list = hp8Var.b;
        }
        hp8Var.getClass();
        list.getClass();
        return new hp8(list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp8)) {
            return false;
        }
        hp8 hp8Var = (hp8) obj;
        return this.a == hp8Var.a && xj5.a(this.b, hp8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ReportReasonsViewState(isLoading=" + this.a + ", reportReasons=" + this.b + ")";
    }

    public hp8() {
        this(0);
    }

    public /* synthetic */ hp8(int i) {
        this(hf3.t, false);
    }
}
