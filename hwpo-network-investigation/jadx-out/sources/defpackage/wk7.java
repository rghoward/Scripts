package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wk7<T> implements of8<T>, tv2<T> {
    public static final i34 c = new i34();
    public static final uk7 d = new uk7();
    public tv2.a<T> a;
    public volatile of8<T> b;

    public wk7(i34 i34Var, of8 of8Var) {
        this.a = i34Var;
        this.b = of8Var;
    }

    public final void a(final tv2.a<T> aVar) {
        of8<T> of8Var;
        of8<T> of8Var2;
        of8<T> of8Var3 = this.b;
        uk7 uk7Var = d;
        if (of8Var3 != uk7Var) {
            aVar.a(of8Var3);
            return;
        }
        synchronized (this) {
            of8Var = this.b;
            if (of8Var != uk7Var) {
                of8Var2 = of8Var;
            } else {
                final tv2.a<T> aVar2 = this.a;
                this.a = new tv2.a() { // from class: vk7
                    @Override // tv2.a
                    public final void a(of8 of8Var4) {
                        aVar2.a(of8Var4);
                        aVar.a(of8Var4);
                    }
                };
                of8Var2 = null;
            }
        }
        if (of8Var2 != null) {
            aVar.a(of8Var);
        }
    }

    @Override // defpackage.of8
    public final T get() {
        return this.b.get();
    }
}
