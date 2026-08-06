package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class az3 extends vx6<cz3> {
    public final d13 t;
    public final float u;

    public az3(d13 d13Var, float f) {
        this.t = d13Var;
        this.u = f;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        cz3 cz3Var = new cz3();
        cz3Var.H = this.t;
        cz3Var.I = this.u;
        return cz3Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        cz3 cz3Var = (cz3) cVar;
        cz3Var.H = this.t;
        cz3Var.I = this.u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az3)) {
            return false;
        }
        az3 az3Var = (az3) obj;
        return this.t == az3Var.t && this.u == az3Var.u;
    }

    public final int hashCode() {
        return Float.hashCode(this.u) + (this.t.hashCode() * 31);
    }
}
