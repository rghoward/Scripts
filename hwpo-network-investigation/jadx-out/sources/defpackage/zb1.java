package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zb1 extends kl5 {
    public final e41<?> A;

    public zb1(e41<?> e41Var) {
        this.A = e41Var;
    }

    @Override // defpackage.kl5
    public final boolean q() {
        return true;
    }

    @Override // defpackage.kl5
    public final void r(Throwable th) {
        boolean zO;
        ll5 ll5VarP = p();
        e41<?> e41Var = this.A;
        Throwable thP = e41Var.p(ll5VarP);
        if (e41Var.y()) {
            r02<?> r02Var = e41Var.w;
            r02Var.getClass();
            zO = ((a23) r02Var).o(thP);
        } else {
            zO = false;
        }
        if (zO) {
            return;
        }
        e41Var.l(thP);
        if (e41Var.y()) {
            return;
        }
        e41Var.n();
    }
}
