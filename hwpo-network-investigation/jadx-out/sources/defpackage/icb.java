package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class icb implements el0 {
    public static final a Companion = new a();
    public static final icb f = new icb(hf3.t, false, false, true, new vz7(0, false, false, null, null, null, 127));
    public final List<y23> a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final vz7 e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public icb(List<? extends y23> list, boolean z, boolean z2, boolean z3, vz7 vz7Var) {
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = vz7Var;
    }

    public static icb a(icb icbVar, List list, boolean z, boolean z2, boolean z3, vz7 vz7Var, int i) {
        if ((i & 1) != 0) {
            list = icbVar.a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            z = icbVar.b;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = icbVar.c;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            z3 = icbVar.d;
        }
        boolean z6 = z3;
        if ((i & 16) != 0) {
            vz7Var = icbVar.e;
        }
        icbVar.getClass();
        list2.getClass();
        return new icb(list2, z4, z5, z6, vz7Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icb)) {
            return false;
        }
        icb icbVar = (icb) obj;
        return this.a.equals(icbVar.a) && this.b == icbVar.b && this.c == icbVar.c && this.d == icbVar.d && this.e.equals(icbVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + uo2.a(uo2.a(uo2.a(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValuesListViewState(valueItems=");
        sb.append(this.a);
        sb.append(", isProgress=");
        sb.append(this.b);
        sb.append(", isPaginationProgress=");
        e4.a(sb, this.c, ", hasNextPage=", this.d, ", placeholderState=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
