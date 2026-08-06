package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sr implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ sr(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.v;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                zr zrVar = (zr) obj2;
                final gca gcaVar = (gca) obj;
                qr qrVar = zrVar.f;
                mh4 mh4Var = new mh4() { // from class: vr
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return gcaVar.G0();
                    }
                };
                gl8 gl8Var = new gl8();
                zrVar.e.d("dataBuilder", qrVar, new xr(0, gl8Var, mh4Var));
                T t = gl8Var.t;
                if (t != 0) {
                    return (fca) t;
                }
                xj5.e("result");
                throw null;
            default:
                return new k06((m09) obj2, if3.t, (f09) obj);
        }
    }
}
