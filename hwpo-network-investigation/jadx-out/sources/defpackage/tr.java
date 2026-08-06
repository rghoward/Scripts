package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tr implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ tr(int i, Object obj, Object obj2) {
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
                final zr zrVar = (zr) obj2;
                final gca gcaVar = (gca) obj;
                rr rrVar = zrVar.g;
                mh4 mh4Var = new mh4() { // from class: wr
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        qq5 qq5VarInvoke = zrVar.c.invoke();
                        if (!qq5VarInvoke.e()) {
                            qq5VarInvoke = null;
                        }
                        qq5 qq5Var = qq5VarInvoke;
                        return qq5Var == null ? sk8.e : gcaVar.E(qq5Var).i(qq5Var.a0(0L));
                    }
                };
                gl8 gl8Var = new gl8();
                zrVar.e.d("positioner", rrVar, new xr(0, gl8Var, mh4Var));
                T t = gl8Var.t;
                if (t != 0) {
                    return (sk8) t;
                }
                xj5.e("result");
                throw null;
            default:
                return s.b((Context) obj2, ((s78) obj).a.concat(".preferences_pb"));
        }
    }
}
