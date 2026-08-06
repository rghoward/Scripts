package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k3a extends IllegalStateException {
    public final int t;
    public final int u;

    /* JADX WARN: Illegal instructions before constructor call */
    public k3a(int i, int i2) {
        String strD;
        if (i == 0) {
            strD = pk.d(i2, "Player stuck buffering and not loading for ", " ms");
        } else if (i == 1) {
            strD = pk.d(i2, "Player stuck buffering with no progress for ", " ms");
        } else if (i == 2) {
            strD = pk.d(i2, "Player stuck playing with no progress for ", " ms");
        } else if (i == 3) {
            strD = pk.d(i2, "Player stuck playing without ending for ", " ms");
        } else {
            if (i != 4) {
                d43.c();
                throw null;
            }
            strD = pk.d(i2, "Player stuck suppressed for ", " ms");
        }
        super(strD);
        this.t = i;
        this.u = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k3a.class != obj.getClass()) {
            return false;
        }
        k3a k3aVar = (k3a) obj;
        return this.t == k3aVar.t && this.u == k3aVar.u;
    }

    public final int hashCode() {
        return ((527 + this.t) * 31) + this.u;
    }
}
