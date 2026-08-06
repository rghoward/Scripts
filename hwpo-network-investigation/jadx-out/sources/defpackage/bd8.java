package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bd8 {
    public static final a Companion = new a();
    public final int a;
    public final u59 b;
    public final int c;
    public final v59 d;
    public final int e;
    public final int f;
    public final int g;
    public final List<String> h;
    public final w59 i;
    public final String j;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public bd8(int i, u59 u59Var, int i2, v59 v59Var, int i3, int i4, int i5, List<String> list, w59 w59Var, String str) {
        u59Var.getClass();
        v59Var.getClass();
        list.getClass();
        str.getClass();
        this.a = i;
        this.b = u59Var;
        this.c = i2;
        this.d = v59Var;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = list;
        this.i = w59Var;
        this.j = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd8)) {
            return false;
        }
        bd8 bd8Var = (bd8) obj;
        return this.a == bd8Var.a && this.b == bd8Var.b && this.c == bd8Var.c && this.d == bd8Var.d && this.e == bd8Var.e && this.f == bd8Var.f && this.g == bd8Var.g && xj5.a(this.h, bd8Var.h) && this.i.equals(bd8Var.i) && xj5.a(this.j, bd8Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ho2.a(os2.a(this.g, os2.a(this.f, os2.a(this.e, (this.d.hashCode() + os2.a(this.c, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31)) * 31, 31), 31), 31), 31, this.h)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgramScoreModel(id=");
        sb.append(this.a);
        sb.append(", measure=");
        sb.append(this.b);
        sb.append(", objective=");
        sb.append(this.c);
        sb.append(", scoreType=");
        sb.append(this.d);
        sb.append(", rounds=");
        p23.a(sb, this.e, ", reps=", this.f, ", intervalsCount=");
        sb.append(this.g);
        sb.append(", description=");
        sb.append(this.h);
        sb.append(", value=");
        sb.append(this.i);
        sb.append(", symbol=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
