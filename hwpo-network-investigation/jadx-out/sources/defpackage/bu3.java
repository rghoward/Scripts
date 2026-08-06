package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bu3 implements ch7 {
    public final /* synthetic */ j04 t;
    public final /* synthetic */ e41 u;

    public bu3(j04 j04Var, e41 e41Var) {
        this.t = j04Var;
        this.u = e41Var;
    }

    @Override // defpackage.ch7
    public final void b() {
        l92 l92Var = this.t.a;
        l92Var.o.a.b(new h92(l92Var, System.currentTimeMillis() - l92Var.d, "getToken task canceled"));
        RuntimeException runtimeException = new RuntimeException("FCM token retrieving was cancelled");
        e41 e41Var = this.u;
        if (e41Var.s() instanceof kc7) {
            e41Var.resumeWith(new av8.a(runtimeException));
        }
    }
}
