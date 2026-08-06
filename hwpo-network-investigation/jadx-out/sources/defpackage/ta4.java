package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ta4 implements qa4.a {
    public final p48 a;
    public final jo b;
    public final xza c;
    public final ya4 d;
    public final r08 e;

    public ta4(p48 p48Var, jo joVar) {
        xza xzaVar = ua4.a;
        ya4 ya4Var = new ya4();
        ya4.a aVar = ya4.a;
        ht4 ht4Var = h23.a;
        aVar.getClass();
        u72.a(h72.a.C0100a.c(aVar, ht4Var).c0(ff3.t).c0(new k5a(null)));
        r08 r08Var = new r08();
        this.a = p48Var;
        this.b = joVar;
        this.c = xzaVar;
        this.d = ya4Var;
        this.e = r08Var;
        new oh4() { // from class: ra4
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                wza wzaVar = (wza) obj;
                return this.t.b(new wza(null, wzaVar.b, wzaVar.c, wzaVar.d, wzaVar.e)).getValue();
            }
        };
    }

    @Override // qa4.a
    public final yza a(qa4 qa4Var, ob4 ob4Var, int i, int i2) {
        jo joVar = this.b;
        joVar.getClass();
        int i3 = joVar.a;
        ob4 ob4Var2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? ob4Var : new ob4(uh8.g(ob4Var.t + i3, 1, 1000));
        this.a.getClass();
        return b(new wza(qa4Var, ob4Var2, i, i2, null));
    }

    public final yza b(final wza wzaVar) {
        xza xzaVar = this.c;
        oh4 oh4Var = new oh4() { // from class: sa4
            /* JADX WARN: Code duplicated, block: B:19:0x003e A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:20:0x003f  */
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                Typeface typefaceA;
                yza.a aVar;
                ta4 ta4Var = this.t;
                ta4Var.d.getClass();
                wza wzaVar2 = wzaVar;
                qa4 qa4Var = wzaVar2.a;
                if (qa4Var instanceof xa4) {
                    throw null;
                }
                d28 d28Var = ta4Var.e.a;
                int i = wzaVar2.c;
                ob4 ob4Var = wzaVar2.b;
                if (qa4Var != null && !(qa4Var instanceof gr2)) {
                    if (qa4Var instanceof jk4) {
                        typefaceA = d28Var.b((jk4) qa4Var, ob4Var, i);
                    } else {
                        if (qa4Var instanceof xb6) {
                            throw null;
                        }
                        aVar = null;
                    }
                    if (aVar != null) {
                        return aVar;
                    }
                    aa0.c("Could not load font");
                    return null;
                }
                typefaceA = d28Var.a(ob4Var, i);
                aVar = new yza.a(typefaceA);
                if (aVar != null) {
                    return aVar;
                }
                aa0.c("Could not load font");
                return null;
            }
        };
        synchronized (((rd7) xzaVar.a)) {
            yza yzaVar = (yza) ((nf6) xzaVar.b).c(wzaVar);
            if (yzaVar != null) {
                if (yzaVar.c()) {
                    return yzaVar;
                }
            }
            try {
                yza yzaVar2 = (yza) oh4Var.invoke(new gm0(1, xzaVar, wzaVar));
                synchronized (((rd7) xzaVar.a)) {
                    try {
                        if (((nf6) xzaVar.b).c(wzaVar) == null && yzaVar2.c()) {
                            ((nf6) xzaVar.b).d(wzaVar, yzaVar2);
                        }
                        g2b g2bVar = g2b.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return yzaVar2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }
}
