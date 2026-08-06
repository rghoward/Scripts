package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class g41 implements jac {
    public static final /* synthetic */ int t = 0;
    public static final /* synthetic */ g41 u = new g41();

    public static final e41 b(r02 r02Var) {
        if (!(r02Var instanceof a23)) {
            return new e41(1, r02Var);
        }
        e41 e41VarK = ((a23) r02Var).k();
        if (e41VarK != null) {
            if (!e41VarK.C()) {
                e41VarK = null;
            }
            if (e41VarK != null) {
                return e41VarK;
            }
        }
        return new e41(2, r02Var);
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Boolean.valueOf(((p7c) o7c.u.t.t).a());
    }
}
