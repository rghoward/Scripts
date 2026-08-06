package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tk2 extends dk0 implements qk2 {
    public final dt7 f;
    public final dt7 g;

    public tk2(Long l, Long l2, fg5 fg5Var, int i, s99 s99Var, Locale locale) {
        super(l2, fg5Var, s99Var, locale);
        b21 b21Var = null;
        if (l != null) {
            b21 b21VarB = this.c.b(l.longValue());
            if (fg5Var.d(b21VarB.t)) {
                b21Var = b21VarB;
            }
        }
        this.f = bl7.i(b21Var);
        this.g = bl7.i(new n23(i));
    }

    @Override // defpackage.qk2
    public final void a(int i) {
        Long lF = f();
        if (lF != null) {
            c(this.c.f(lF.longValue()).e);
        }
        this.g.setValue(new n23(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qk2
    public final int b() {
        return ((n23) this.g.getValue()).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qk2
    public final Long f() {
        b21 b21Var = (b21) this.f.getValue();
        if (b21Var != null) {
            return Long.valueOf(b21Var.w);
        }
        return null;
    }

    @Override // defpackage.qk2
    public final void h(Long l) {
        dt7 dt7Var = this.f;
        if (l == null) {
            dt7Var.setValue(null);
        } else {
            b21 b21VarB = this.c.b(l.longValue());
            dt7Var.setValue(this.a.d(b21VarB.t) ? b21VarB : null);
        }
    }
}
