package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pq0 extends es7 {
    public int A = 1;
    public final long B;
    public float C;
    public wh1 D;
    public final l75 y;
    public final long z;

    public pq0(l75 l75Var, long j) {
        int i;
        this.y = l75Var;
        this.z = j;
        int i2 = (int) (j >> 32);
        if (i2 < 0 || (i = (int) (4294967295L & j)) < 0 || i2 > l75Var.j() || i > l75Var.h()) {
            z90.a("Failed requirement.");
            throw null;
        }
        this.B = j;
        this.C = 1.0f;
    }

    @Override // defpackage.es7
    public final boolean a(float f) {
        this.C = f;
        return true;
    }

    @Override // defpackage.es7
    public final boolean e(wh1 wh1Var) {
        this.D = wh1Var;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq0)) {
            return false;
        }
        pq0 pq0Var = (pq0) obj;
        return xj5.a(this.y, pq0Var.y) && bg5.b(0L, 0L) && kg5.b(this.z, pq0Var.z) && this.A == pq0Var.A;
    }

    @Override // defpackage.es7
    public final long h() {
        return c43.c(this.B);
    }

    public final int hashCode() {
        return Integer.hashCode(this.A) + al.c(this.z, al.c(0L, this.y.hashCode() * 31, 31), 31);
    }

    @Override // defpackage.es7
    public final void i(d73 d73Var) {
        d73.b1(d73Var, this.y, 0L, this.z, 0L, (((long) Math.round(Float.intBitsToFloat((int) (d73Var.c() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (d73Var.c() & 4294967295L)))) & 4294967295L), this.C, null, this.D, 0, this.A, 328);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.y);
        sb.append(", srcOffset=");
        sb.append((Object) bg5.e(0L));
        sb.append(", srcSize=");
        sb.append((Object) kg5.c(this.z));
        sb.append(", filterQuality=");
        int i = this.A;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Low";
        } else if (i == 2) {
            str = "Medium";
        } else {
            str = i == 3 ? "High" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
