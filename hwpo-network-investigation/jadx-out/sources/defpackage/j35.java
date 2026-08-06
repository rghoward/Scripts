package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j35 extends ox6.c implements txa, g58, ju1 {
    public d53 H;
    public w48 I;
    public boolean J;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<j35, sxa> {
        public final /* synthetic */ cl8 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cl8 cl8Var) {
            super(1);
            this.u = cl8Var;
        }

        @Override // defpackage.oh4
        public final sxa invoke(j35 j35Var) {
            if (!j35Var.J) {
                return sxa.t;
            }
            this.u.t = false;
            return sxa.v;
        }
    }

    public j35(w48 w48Var, d53 d53Var) {
        this.H = d53Var;
        this.I = w48Var;
    }

    @Override // defpackage.g58
    public final long J() {
        if (this.H == null) {
            return tra.a;
        }
        tx2 tx2Var = ew2.f(this).R;
        int i = tra.b;
        return tra.a.b(tx2Var.n1(10.0f), tx2Var.n1(40.0f), tx2Var.n1(10.0f), tx2Var.n1(40.0f));
    }

    @Override // ox6.c
    public final void V1() {
        g2();
    }

    @Override // defpackage.g58
    public final void c0(r48 r48Var, s48 s48Var, long j) {
        if (s48Var == s48.u) {
            List<a58> list = r48Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (f2(list.get(i).i)) {
                    int i2 = r48Var.f;
                    if (i2 == 4) {
                        this.J = true;
                        e2();
                        return;
                    } else {
                        if (i2 == 5) {
                            g2();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c2() {
        w48 w48Var;
        gl8 gl8Var = new gl8();
        yx.f(this, new k35(1));
        j35 j35Var = (j35) gl8Var.t;
        if (j35Var == null || (w48Var = j35Var.I) == null) {
            w48Var = this.I;
        }
        d2(w48Var);
    }

    public abstract void d2(w48 w48Var);

    public final void e2() {
        cl8 cl8Var = new cl8();
        cl8Var.t = true;
        yx.h(this, new a(cl8Var));
        if (cl8Var.t) {
            c2();
        }
    }

    public abstract boolean f2(int i);

    /* JADX WARN: Multi-variable type inference failed */
    public final void g2() {
        if (this.J) {
            this.J = false;
            if (this.G) {
                gl8 gl8Var = new gl8();
                yx.f(this, new i35(gl8Var));
                j35 j35Var = (j35) gl8Var.t;
                if (j35Var != null) {
                    j35Var.c2();
                } else {
                    d2(null);
                }
            }
        }
    }

    @Override // defpackage.g58
    public final void t0() {
        g2();
    }
}
