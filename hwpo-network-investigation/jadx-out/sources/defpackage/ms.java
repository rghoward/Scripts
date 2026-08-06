package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ms extends TextPaint {
    public np a;
    public fda b;
    public int c;
    public el9 d;
    public uh1 e;
    public fx0 f;
    public my2 g;
    public cr9 h;
    public e73 i;

    public final cs7 a() {
        np npVar = this.a;
        if (npVar != null) {
            return npVar;
        }
        np npVar2 = new np(this);
        this.a = npVar2;
        return npVar2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        ((np) a()).i(i);
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    public final void c(final fx0 fx0Var, final long j, float f) {
        if (fx0Var == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (fx0Var instanceof aw9) {
            d(uy5.d(f, ((aw9) fx0Var).a));
            return;
        }
        if (!(fx0Var instanceof cl9)) {
            u.b();
            return;
        }
        if (xj5.a(this.f, fx0Var)) {
            cr9 cr9Var = this.h;
            if (!(cr9Var == null ? false : cr9.a(cr9Var.a, j))) {
                if (j != 9205357640488583168L) {
                    this.f = fx0Var;
                    this.h = new cr9(j);
                    this.g = bl7.f(new mh4() { // from class: ls
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ((cl9) fx0Var).b(j);
                        }
                    });
                }
            }
        } else if (j != 9205357640488583168L) {
            this.f = fx0Var;
            this.h = new cr9(j);
            this.g = bl7.f(new mh4() { // from class: ls
                @Override // defpackage.mh4
                public final Object invoke() {
                    return ((cl9) fx0Var).b(j);
                }
            });
        }
        cs7 cs7VarA = a();
        my2 my2Var = this.g;
        ((np) cs7VarA).d(my2Var != null ? (Shader) my2Var.getValue() : null);
        this.e = null;
        j84.d(this, f);
    }

    public final void d(long j) {
        uh1 uh1Var = this.e;
        if ((uh1Var == null ? false : uh1.c(uh1Var.a, j)) || j == 16) {
            return;
        }
        this.e = new uh1(j);
        setColor(u7d.l(j));
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
    }

    public final void e(e73 e73Var) {
        if (e73Var == null || xj5.a(this.i, e73Var)) {
            return;
        }
        this.i = e73Var;
        if (e73Var.equals(zy3.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(e73Var instanceof b3a)) {
            u.b();
            return;
        }
        ((np) a()).p(1);
        b3a b3aVar = (b3a) e73Var;
        ((np) a()).o(b3aVar.a);
        ((np) a()).n(b3aVar.b);
        ((np) a()).m(b3aVar.d);
        ((np) a()).l(b3aVar.c);
        ((np) a()).a.setPathEffect(null);
    }

    public final void f(el9 el9Var) {
        if (el9Var == null || xj5.a(this.d, el9Var)) {
            return;
        }
        this.d = el9Var;
        if (el9Var.equals(el9.d)) {
            clearShadowLayer();
            return;
        }
        el9 el9Var2 = this.d;
        float f = el9Var2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (el9Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), u7d.l(this.d.a));
    }

    public final void g(fda fdaVar) {
        if (fdaVar == null || xj5.a(this.b, fdaVar)) {
            return;
        }
        this.b = fdaVar;
        int i = fdaVar.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
