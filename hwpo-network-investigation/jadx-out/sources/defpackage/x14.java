package defpackage;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x14 implements mf8 {
    public final r14 a;
    public final t14 b;
    public final s14 c;
    public final w14 d;
    public final u14 e;
    public final q14 f;
    public final v14 g;

    public x14(r14 r14Var, t14 t14Var, s14 s14Var, w14 w14Var, u14 u14Var, q14 q14Var, v14 v14Var) {
        this.a = r14Var;
        this.b = t14Var;
        this.c = s14Var;
        this.d = w14Var;
        this.e = u14Var;
        this.f = q14Var;
        this.g = v14Var;
    }

    @Override // defpackage.nf8
    public final Object get() {
        return new n14((e04) this.a.get(), (of8) this.b.get(), (t04) this.c.get(), (of8) this.d.get(), (RemoteConfigManager) this.e.get(), (rv1) this.f.get(), (SessionManager) this.g.get());
    }
}
