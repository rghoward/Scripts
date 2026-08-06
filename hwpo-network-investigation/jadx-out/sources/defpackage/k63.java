package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k63<T> extends ox6.c implements lr5 {
    public wj<T> H;
    public ci4<? super kg5, ? super xx1, ? extends js7<? extends g63<T>, ? extends T>> I;
    public fl7 J;
    public boolean K;

    public k63() {
        throw null;
    }

    @Override // ox6.c
    public final void V1() {
        this.K = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.lr5
    public final gl6 e(final hl6 hl6Var, cl6 cl6Var, long j) {
        final jz7 jz7VarE = cl6Var.E(j);
        if (!hl6Var.P0() || !this.K) {
            js7<? extends g63<T>, ? extends T> js7VarInvoke = this.I.invoke(new kg5((((long) jz7VarE.u) & 4294967295L) | (((long) jz7VarE.t) << 32)), new xx1(j));
            wj wjVar = (wj<T>) this.H;
            g63 g63Var = (g63) js7VarInvoke.t;
            B b = js7VarInvoke.u;
            if (!xj5.a(wjVar.e(), g63Var)) {
                wjVar.m.setValue(g63Var);
                a47 a47Var = wjVar.e.b;
                boolean zH = a47Var.h();
                if (zH) {
                    try {
                        tj tjVar = wjVar.n;
                        float fD = wjVar.e().d(b);
                        if (!Float.isNaN(fD)) {
                            tjVar.a(fD, 0.0f);
                            wjVar.i(null);
                        }
                        wjVar.h(b);
                        g2b g2bVar = g2b.a;
                        a47Var.c(null);
                    } catch (Throwable th) {
                        a47Var.c(null);
                        throw th;
                    }
                }
                if (!zH) {
                    wjVar.i(b);
                }
            }
        }
        this.K = hl6Var.P0() || this.K;
        return hl6Var.y0(jz7VarE.t, jz7VarE.u, if3.t, new oh4() { // from class: j63
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                jz7.a aVar = (jz7.a) obj;
                boolean zP0 = hl6Var.P0();
                k63 k63Var = this;
                wj<T> wjVar2 = k63Var.H;
                float fD2 = zP0 ? wjVar2.e().d(k63Var.H.h.getValue()) : wjVar2.g();
                fl7 fl7Var = k63Var.J;
                float f = fl7Var == fl7.u ? fD2 : 0.0f;
                if (fl7Var != fl7.t) {
                    fD2 = 0.0f;
                }
                aVar.t = true;
                aVar.l(jz7VarE, wk6.b(f), wk6.b(fD2), 0.0f);
                g2b g2bVar2 = g2b.a;
                aVar.t = false;
                return g2b.a;
            }
        });
    }
}
