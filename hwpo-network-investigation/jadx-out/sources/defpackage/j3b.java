package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class j3b extends vx6<l3b> {
    public final float t;
    public final float u;

    public j3b(float f, float f2) {
        this.t = f;
        this.u = f2;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        l3b l3bVar = new l3b();
        l3bVar.H = this.t;
        l3bVar.I = this.u;
        return l3bVar;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        l3b l3bVar = (l3b) cVar;
        l3bVar.H = this.t;
        l3bVar.I = this.u;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j3b)) {
            return false;
        }
        j3b j3bVar = (j3b) obj;
        return y43.e(this.t, j3bVar.t) && y43.e(this.u, j3bVar.u);
    }

    public final int hashCode() {
        return Float.hashCode(this.u) + (Float.hashCode(this.t) * 31);
    }
}
