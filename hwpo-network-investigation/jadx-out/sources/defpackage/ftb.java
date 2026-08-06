package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ftb extends vx6<gtb> {
    public final float t;

    public ftb(float f) {
        this.t = f;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        gtb gtbVar = new gtb();
        gtbVar.H = this.t;
        return gtbVar;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ((gtb) cVar).H = this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ftb) && Float.compare(this.t, ((ftb) obj).t) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.t);
    }

    public final String toString() {
        return ho.a(new StringBuilder("ZIndexElement(zIndex="), this.t, ')');
    }
}
