package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class au3 implements fh7, i19 {
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public au3(e41 e41Var, j04 j04Var, cu3 cu3Var) {
        this.t = e41Var;
        this.u = j04Var;
    }

    @Override // defpackage.i19
    public Object a(Object obj) {
        return ((oh4) this.u).invoke(obj);
    }

    @Override // defpackage.fh7
    public void b(r9a r9aVar) {
        j04 j04Var = (j04) this.u;
        e41 e41Var = (e41) this.t;
        r9aVar.getClass();
        if (!r9aVar.n() && (e41Var.s() instanceof kc7)) {
            Exception excI = r9aVar.i();
            if (excI == null) {
                excI = new RuntimeException("FCM Instance id error");
            }
            j04Var.b(excI);
            e41Var.resumeWith(new av8.a(excI));
            return;
        }
        String str = (String) r9aVar.j();
        if (str != null) {
            e41Var.resumeWith(str);
            return;
        }
        RuntimeException runtimeException = new RuntimeException("FCM device token is null");
        j04Var.b(runtimeException);
        e41Var.resumeWith(new av8.a(runtimeException));
    }

    @Override // defpackage.i19
    public Object c(k19 k19Var, Object obj) {
        return ((ci4) this.t).invoke(k19Var, obj);
    }

    public au3(ci4 ci4Var, oh4 oh4Var) {
        this.t = ci4Var;
        this.u = oh4Var;
    }
}
