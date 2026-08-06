package defpackage;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kb6<T> {
    public static final Object j = new Object();
    public final Object a;
    public final pz8<qf7<? super T>, kb6<T>.c> b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends kb6<T>.c {
        @Override // kb6.c
        public final boolean d() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b extends kb6<T>.c implements g76 {
        public final m76 x;

        public b(m76 m76Var, qf7<? super T> qf7Var) {
            super(qf7Var);
            this.x = m76Var;
        }

        @Override // kb6.c
        public final void b() {
            this.x.getLifecycle().c(this);
        }

        @Override // kb6.c
        public final boolean c(m76 m76Var) {
            return this.x == m76Var;
        }

        @Override // kb6.c
        public final boolean d() {
            return this.x.getLifecycle().b().compareTo(s66.b.w) >= 0;
        }

        @Override // defpackage.g76
        public final void t(m76 m76Var, s66.a aVar) {
            m76 m76Var2 = this.x;
            s66.b bVarB = m76Var2.getLifecycle().b();
            if (bVarB == s66.b.t) {
                kb6.this.i(this.t);
                return;
            }
            s66.b bVar = null;
            while (bVar != bVarB) {
                a(d());
                bVar = bVarB;
                bVarB = m76Var2.getLifecycle().b();
            }
        }
    }

    public kb6() {
        this.a = new Object();
        this.b = new pz8<>();
        this.c = 0;
        Object obj = j;
        this.f = obj;
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        x20.h1().x.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        aa0.c(sk0.c("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(kb6<T>.c cVar) {
        if (cVar.u) {
            if (!cVar.d()) {
                cVar.a(false);
                return;
            }
            int i = cVar.v;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            cVar.v = i2;
            cVar.t.a((Object) this.e);
        }
    }

    public final void c(kb6<T>.c cVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (cVar != null) {
                b(cVar);
                cVar = null;
            } else {
                pz8<qf7<? super T>, kb6<T>.c> pz8Var = this.b;
                pz8Var.getClass();
                pz8.d dVar = new pz8.d();
                pz8Var.v.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((c) ((Map.Entry) dVar.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final T d() {
        T t = (T) this.e;
        if (t != j) {
            return t;
        }
        return null;
    }

    public void e(m76 m76Var, qf7<? super T> qf7Var) {
        kb6<T>.c cVar;
        a("observe");
        if (m76Var.getLifecycle().b() == s66.b.t) {
            return;
        }
        b bVar = new b(m76Var, qf7Var);
        pz8<qf7<? super T>, kb6<T>.c> pz8Var = this.b;
        pz8.c<qf7<? super T>, kb6<T>.c> cVarD = pz8Var.d(qf7Var);
        if (cVarD != null) {
            cVar = cVarD.u;
        } else {
            pz8.c<K, V> cVar2 = new pz8.c<>(qf7Var, bVar);
            pz8Var.w++;
            pz8.c<qf7<? super T>, kb6<T>.c> cVar3 = pz8Var.u;
            if (cVar3 == 0) {
                pz8Var.t = cVar2;
                pz8Var.u = cVar2;
            } else {
                cVar3.v = cVar2;
                cVar2.w = cVar3;
                pz8Var.u = cVar2;
            }
            cVar = null;
        }
        kb6<T>.c cVar4 = cVar;
        if (cVar4 != null && !cVar4.c(m76Var)) {
            z90.a("Cannot add the same observer with different lifecycles");
        } else {
            if (cVar4 != null) {
                return;
            }
            m76Var.getLifecycle().a(bVar);
        }
    }

    public final void f(qf7<? super T> qf7Var) {
        kb6<T>.c cVar;
        a("observeForever");
        a aVar = new a(qf7Var);
        pz8<qf7<? super T>, kb6<T>.c> pz8Var = this.b;
        pz8.c<qf7<? super T>, kb6<T>.c> cVarD = pz8Var.d(qf7Var);
        if (cVarD != null) {
            cVar = cVarD.u;
        } else {
            pz8.c<K, V> cVar2 = new pz8.c<>(qf7Var, aVar);
            pz8Var.w++;
            pz8.c<qf7<? super T>, kb6<T>.c> cVar3 = pz8Var.u;
            if (cVar3 == 0) {
                pz8Var.t = cVar2;
                pz8Var.u = cVar2;
            } else {
                cVar3.v = cVar2;
                cVar2.w = cVar3;
                pz8Var.u = cVar2;
            }
            cVar = null;
        }
        kb6<T>.c cVar4 = cVar;
        if (cVar4 instanceof b) {
            z90.a("Cannot add the same observer with different lifecycles");
        } else {
            if (cVar4 != null) {
                return;
            }
            aVar.a(true);
        }
    }

    public void i(qf7<? super T> qf7Var) {
        a("removeObserver");
        kb6<T>.c cVarE = this.b.e(qf7Var);
        if (cVarE == null) {
            return;
        }
        cVarE.b();
        cVarE.a(false);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public abstract class c {
        public final qf7<? super T> t;
        public boolean u;
        public int v = -1;

        public c(qf7<? super T> qf7Var) {
            this.t = qf7Var;
        }

        public final void a(boolean z) {
            if (z == this.u) {
                return;
            }
            this.u = z;
            int i = z ? 1 : -1;
            kb6 kb6Var = kb6.this;
            int i2 = kb6Var.c;
            kb6Var.c = i + i2;
            if (!kb6Var.d) {
                kb6Var.d = true;
                while (true) {
                    try {
                        int i3 = kb6Var.c;
                        if (i2 == i3) {
                            break;
                        }
                        boolean z2 = i2 == 0 && i3 > 0;
                        boolean z3 = i2 > 0 && i3 == 0;
                        if (z2) {
                            kb6Var.g();
                        } else if (z3) {
                            kb6Var.h();
                        }
                        i2 = i3;
                    } catch (Throwable th) {
                        kb6Var.d = false;
                        throw th;
                    }
                }
                kb6Var.d = false;
            }
            if (this.u) {
                kb6Var.c(this);
            }
        }

        public boolean c(m76 m76Var) {
            return false;
        }

        public abstract boolean d();

        public void b() {
        }
    }

    public void g() {
    }

    public void h() {
    }

    public kb6(T t) {
        this.a = new Object();
        this.b = new pz8<>();
        this.c = 0;
        this.f = j;
        this.e = t;
        this.g = 0;
    }
}
