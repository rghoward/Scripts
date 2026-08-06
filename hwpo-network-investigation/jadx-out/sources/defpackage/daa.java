package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class daa<TResult> implements fh7 {
    public final /* synthetic */ e41 t;

    public daa(e41 e41Var) {
        this.t = e41Var;
    }

    @Override // defpackage.fh7
    public final void b(r9a<Object> r9aVar) {
        Exception excI = r9aVar.i();
        e41 e41Var = this.t;
        if (excI != null) {
            e41Var.resumeWith(new av8.a(excI));
        } else if (r9aVar.l()) {
            e41Var.l(null);
        } else {
            e41Var.resumeWith(r9aVar.j());
        }
    }
}
