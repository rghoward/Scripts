package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class mh7 extends vx6<ph7> {
    public final oh4<qq5, g2b> t;

    /* JADX WARN: Multi-variable type inference failed */
    public mh7(oh4<? super qq5, g2b> oh4Var) {
        this.t = oh4Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        ph7 ph7Var = new ph7();
        ph7Var.H = this.t;
        return ph7Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ((ph7) cVar).H = this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mh7) {
            return this.t == ((mh7) obj).t;
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
