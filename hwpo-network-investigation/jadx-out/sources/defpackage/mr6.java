package defpackage;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mr6 {
    public final Runnable a;
    public final CopyOnWriteArrayList<cs6> b = new CopyOnWriteArrayList<>();
    public final HashMap c = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public final s66 a;
        public g76 b;

        public a(s66 s66Var, g76 g76Var) {
            this.a = s66Var;
            this.b = g76Var;
            s66Var.a(g76Var);
        }
    }

    public mr6(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(final cs6 cs6Var, m76 m76Var) {
        this.b.add(cs6Var);
        this.a.run();
        s66 lifecycle = m76Var.getLifecycle();
        HashMap map = this.c;
        a aVar = (a) map.remove(cs6Var);
        if (aVar != null) {
            aVar.a.c(aVar.b);
            aVar.b = null;
        }
        map.put(cs6Var, new a(lifecycle, new g76() { // from class: lr6
            @Override // defpackage.g76
            public final void t(m76 m76Var2, s66.a aVar2) {
                mr6 mr6Var = this.t;
                mr6Var.getClass();
                if (aVar2 == s66.a.ON_DESTROY) {
                    mr6Var.c(cs6Var);
                }
            }
        }));
    }

    public final void b(final cs6 cs6Var, m76 m76Var, final s66.b bVar) {
        s66 lifecycle = m76Var.getLifecycle();
        HashMap map = this.c;
        a aVar = (a) map.remove(cs6Var);
        if (aVar != null) {
            aVar.a.c(aVar.b);
            aVar.b = null;
        }
        map.put(cs6Var, new a(lifecycle, new g76() { // from class: kr6
            @Override // defpackage.g76
            public final void t(m76 m76Var2, s66.a aVar2) {
                s66.a aVar3;
                mr6 mr6Var = this.t;
                Runnable runnable = mr6Var.a;
                CopyOnWriteArrayList<cs6> copyOnWriteArrayList = mr6Var.b;
                s66.a.Companion.getClass();
                s66.b bVar2 = bVar;
                bVar2.getClass();
                int iOrdinal = bVar2.ordinal();
                if (iOrdinal == 2) {
                    aVar3 = s66.a.ON_CREATE;
                } else if (iOrdinal != 3) {
                    aVar3 = iOrdinal != 4 ? null : s66.a.ON_RESUME;
                } else {
                    aVar3 = s66.a.ON_START;
                }
                cs6 cs6Var2 = cs6Var;
                if (aVar2 == aVar3) {
                    copyOnWriteArrayList.add(cs6Var2);
                    runnable.run();
                } else if (aVar2 == s66.a.ON_DESTROY) {
                    mr6Var.c(cs6Var2);
                } else if (aVar2 == s66.a.C0240a.a(bVar2)) {
                    copyOnWriteArrayList.remove(cs6Var2);
                    runnable.run();
                }
            }
        }));
    }

    public final void c(cs6 cs6Var) {
        this.b.remove(cs6Var);
        a aVar = (a) this.c.remove(cs6Var);
        if (aVar != null) {
            aVar.a.c(aVar.b);
            aVar.b = null;
        }
        this.a.run();
    }
}
