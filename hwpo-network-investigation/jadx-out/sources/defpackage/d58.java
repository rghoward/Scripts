package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d58 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public d58() {
        throw null;
    }

    public d58(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d58)) {
            return false;
        }
        d58 d58Var = (d58) obj;
        return zj7.a(this.a, d58Var.a) && this.b == d58Var.b && vf7.b(this.c, d58Var.c) && vf7.b(this.d, d58Var.d) && this.e == d58Var.e && Float.compare(this.f, d58Var.f) == 0 && this.g == d58Var.g && this.h == d58Var.h && xj5.a(this.i, d58Var.i) && vf7.b(this.j, d58Var.j) && Float.compare(this.k, d58Var.k) == 0 && vf7.b(this.l, d58Var.l) && vf7.b(this.m, d58Var.m);
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + al.c(this.l, h44.a(al.c(this.j, (this.i.hashCode() + uo2.a(os2.a(this.g, h44.a(uo2.a(al.c(this.d, al.c(this.c, al.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), this.e, 31), this.f, 31), 31), this.h, 31)) * 31, 31), this.k, 31), 31);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) zj7.b(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) vf7.g(this.c)) + ", position=" + ((Object) vf7.g(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) n58.a(this.g)) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + ((Object) vf7.g(this.j)) + ", scaleGestureFactor=" + this.k + ", panGestureOffset=" + ((Object) vf7.g(this.l)) + ", originalEventPosition=" + ((Object) vf7.g(this.m)) + ')';
    }
}
