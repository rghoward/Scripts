package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class mb extends vx6<ob> {
    public final d11 t;

    public mb(d11 d11Var) {
        this.t = d11Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [nb] */
    @Override // defpackage.vx6
    public final ox6.c a() {
        final ob obVar = new ob();
        obVar.J = this.t;
        ?? r1 = new oh4() { // from class: nb
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                ob obVar2 = obVar;
                obVar2.J.invoke((cca) obj, ku1.a(obVar2, AndroidCompositionLocals_androidKt.b));
                return g2b.a;
            }
        };
        lb lbVar = new lb();
        lbVar.H = r1;
        obVar.c2(lbVar);
        return obVar;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ((ob) cVar).J = this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mb) {
            return this.t == ((mb) obj).t;
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
