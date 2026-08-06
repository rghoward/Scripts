package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class gha extends vx6<hha> {
    public final wja t;

    public gha(wja wjaVar) {
        this.t = wjaVar;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new hha(this.t);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        hha hhaVar = (hha) cVar;
        hhaVar.getClass();
        wja wjaVarD = zu1.d(this.t, ew2.f(hhaVar).S);
        hhaVar.c2(wjaVarD, (qa4.a) ku1.a(hhaVar, qu1.k));
        fha fhaVar = hhaVar.J;
        if (fhaVar == null) {
            throw x70.a("Min size state is not set.");
        }
        fha.a(fhaVar, null, null, wjaVarD, 23);
        ew2.f(hhaVar).Q();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gha)) {
            return false;
        }
        return xj5.a(this.t, ((gha) obj).t);
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
