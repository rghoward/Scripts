package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w59 {
    public static final a Companion = new a();
    public final int a;
    public final int b;
    public final int c;
    public final double d;
    public final boolean e;
    public final int f;
    public final List<w59> g;
    public final boolean h;
    public final boolean i;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static w59 a(a aVar, int i, List list, int i2) {
            if ((i2 & 1) != 0) {
                i = -1;
            }
            int i3 = i;
            if ((i2 & 2) != 0) {
                list = hf3.t;
            }
            aVar.getClass();
            return new w59(-1, -1, -1, -1.0d, false, i3, list, false, false);
        }
    }

    public w59(int i, int i2, int i3, double d, boolean z, int i4, List<w59> list, boolean z2, boolean z3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = d;
        this.e = z;
        this.f = i4;
        this.g = list;
        this.h = z2;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w59)) {
            return false;
        }
        w59 w59Var = (w59) obj;
        return this.a == w59Var.a && this.b == w59Var.b && this.c == w59Var.c && Double.compare(this.d, w59Var.d) == 0 && this.e == w59Var.e && this.f == w59Var.f && this.g.equals(w59Var.g) && this.h == w59Var.h && this.i == w59Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + uo2.a(ho2.a(os2.a(this.f, uo2.a((Double.hashCode(this.d) + os2.a(this.c, os2.a(this.b, Integer.hashCode(this.a) * 31, 31), 31)) * 31, this.e, 31), 31), 31, this.g), this.h, 31);
    }

    public final String toString() {
        StringBuilder sbB = u43.b("ScoreValueModel(id=", ", rounds=", ", reps=", this.a, this.b);
        sbB.append(this.c);
        sbB.append(", value=");
        sbB.append(this.d);
        sbB.append(", adjusted=");
        sbB.append(this.e);
        sbB.append(", position=");
        sbB.append(this.f);
        sbB.append(", intervalValues=");
        sbB.append(this.g);
        sbB.append(", linkMedia=");
        sbB.append(this.h);
        sbB.append(", linkNotes=");
        sbB.append(this.i);
        sbB.append(")");
        return sbB.toString();
    }
}
