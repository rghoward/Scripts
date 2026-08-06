package defpackage;

import ah0.a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ah0<A extends a> {
    public Throwable b;
    public final Object a = new Object();
    public final k60 c = new k60(0);
    public t27<A> d = new t27<>((Object) null);
    public t27<A> e = new t27<>((Object) null);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a {
        public abstract void a();

        public abstract void b(Throwable th);
    }

    public final i41 a(A a2, mh4<g2b> mh4Var) {
        int i;
        int i2;
        int i3;
        el8 el8Var = new el8();
        el8Var.t = -1;
        synchronized (this.a) {
            Throwable th = this.b;
            if (th != null) {
                a2.b(th);
                return i41.a.a;
            }
            k60 k60Var = this.c;
            do {
                i = k60Var.get();
                i2 = i + 1;
            } while (!k60Var.compareAndSet(i, i2));
            boolean z = (134217727 & i2) == 1;
            el8Var.t = (i2 >>> 27) & 15;
            this.d.g(a2);
            if (z && mh4Var != null) {
                try {
                    mh4Var.invoke();
                } catch (Throwable th2) {
                    synchronized (this.a) {
                        try {
                            if (this.b == null) {
                                this.b = th2;
                                t27<A> t27Var = this.d;
                                Object[] objArr = t27Var.a;
                                int i4 = t27Var.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    ((a) objArr[i5]).b(th2);
                                }
                                this.d.j();
                                k60 k60Var2 = this.c;
                                do {
                                    i3 = k60Var2.get();
                                } while (!k60Var2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                                g2b g2bVar = g2b.a;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new dk7(new zg0(a2, this, el8Var));
        }
    }

    public final void b(oh4<? super A, g2b> oh4Var) {
        int i;
        synchronized (this.a) {
            try {
                t27<A> t27Var = this.d;
                this.d = this.e;
                this.e = t27Var;
                k60 k60Var = this.c;
                do {
                    i = k60Var.get();
                } while (!k60Var.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = t27Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    oh4Var.invoke(t27Var.b(i3));
                }
                t27Var.j();
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
