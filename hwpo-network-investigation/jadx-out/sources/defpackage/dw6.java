package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dw6 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ dw6(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.v;
        Object obj3 = this.u;
        switch (i) {
            case 0:
                mh4 mh4Var = (mh4) obj2;
                if (!((hn9) obj3).d()) {
                    mh4Var.invoke();
                }
                break;
            default:
                dl0.a aVar = (dl0.a) obj2;
                if (((cq9) obj3).k.compareAndSet(true, false)) {
                    aVar.a(obj);
                }
                break;
        }
        return g2b.a;
    }
}
