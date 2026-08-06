package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cu3 implements zt3 {
    public final r54<String> a;

    public cu3(du3 du3Var) {
        du3Var.getClass();
        this.a = du3Var.a();
    }

    @Override // defpackage.zt3
    public final r54<String> a() {
        return this.a;
    }

    @Override // defpackage.zt3
    public final Object b(ob1 ob1Var) {
        e41 e41Var = new e41(1, th0.e(ob1Var));
        e41Var.t();
        j04 j04VarA = j04.a();
        FirebaseMessaging.d().g().b(new au3(e41Var, j04VarA, this)).d(new b92(j04VarA, e41Var)).a(u9a.a, new bu3(j04VarA, e41Var));
        return e41Var.r();
    }

    @Override // defpackage.zt3
    public final Object c(u02 u02Var) throws Throwable {
        e41 e41Var = new e41(1, th0.e(u02Var));
        e41Var.t();
        try {
            FirebaseMessaging.d().b();
            e41Var.resumeWith(g2b.a);
        } catch (Exception e) {
            j04.a().b(e);
            e41Var.resumeWith(new av8.a(e));
        }
        Object objR = e41Var.r();
        return objR == v72.t ? objR : g2b.a;
    }
}
