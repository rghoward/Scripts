package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class qaa extends vx6<saa> {
    public final String t;

    public qaa(String str) {
        this.t = str;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        saa saaVar = new saa();
        saaVar.H = this.t;
        return saaVar;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ((saa) cVar).H = this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qaa)) {
            return false;
        }
        return xj5.a(this.t, ((qaa) obj).t);
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
