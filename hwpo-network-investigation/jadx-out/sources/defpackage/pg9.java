package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pg9 implements vg5, jh9 {
    public final g23 a;
    public mh4<g2b> b;

    public pg9(g23 g23Var) {
        this.a = g23Var;
    }

    @Override // defpackage.jh9
    public final void a(e25.a aVar) {
        this.b = aVar;
    }

    @Override // defpackage.vg5
    public final qu8 intercept(vg5.a aVar) {
        aj8 aj8Var = (aj8) aVar;
        qu8 qu8VarA = aj8Var.a(aj8Var.e);
        if (qu8VarA.w == 401) {
            g23 g23Var = this.a;
            synchronized (g23Var) {
                try {
                    Iterator<oi8.a> it = g23Var.d.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        oi8.this.cancel();
                    }
                    Iterator<oi8.a> it2 = g23Var.e.iterator();
                    it2.getClass();
                    while (it2.hasNext()) {
                        oi8.this.cancel();
                    }
                    Iterator<oi8> it3 = g23Var.f.iterator();
                    it3.getClass();
                    while (it3.hasNext()) {
                        it3.next().cancel();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            mh4<g2b> mh4Var = this.b;
            if (mh4Var != null) {
                mh4Var.invoke();
                return qu8VarA;
            }
        }
        return qu8VarA;
    }
}
