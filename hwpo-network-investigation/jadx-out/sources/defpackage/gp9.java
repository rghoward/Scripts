package defpackage;

import defpackage.mn2;
import defpackage.nn2;
import defpackage.on2;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gp9<I extends nn2, O extends on2, E extends mn2> implements kn2<I, O, E> {
    public final a a;
    public final I[] e;
    public final O[] f;
    public int g;
    public int h;
    public I i;
    public E j;
    public boolean k;
    public boolean l;
    public final Object b = new Object();
    public long m = -9223372036854775807L;
    public final ArrayDeque<I> c = new ArrayDeque<>();
    public final ArrayDeque<O> d = new ArrayDeque<>();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends Thread {
        public a() {
            super("ExoPlayer:SimpleDecoder");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            do {
                try {
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            } while (gp9.this.k());
        }
    }

    public gp9(I[] iArr, O[] oArr) {
        this.e = iArr;
        this.g = iArr.length;
        for (int i = 0; i < this.g; i++) {
            ((I[]) this.e)[i] = g();
        }
        this.f = oArr;
        this.h = oArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            ((O[]) this.f)[i2] = h();
        }
        a aVar = new a();
        this.a = aVar;
        aVar.start();
    }

    @Override // defpackage.kn2
    public final void a() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.kn2
    public final void b(long j) {
        synchronized (this.b) {
            try {
                xl7.r(this.g == this.e.length || this.k);
                this.m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kn2
    public final Object e() {
        I i;
        synchronized (this.b) {
            try {
                E e = this.j;
                if (e != null) {
                    throw e;
                }
                xl7.r(this.i == null);
                int i2 = this.g;
                if (i2 == 0) {
                    i = null;
                } else {
                    I[] iArr = this.e;
                    int i3 = i2 - 1;
                    this.g = i3;
                    i = iArr[i3];
                }
                this.i = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // defpackage.kn2
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                I i = this.i;
                if (i != null) {
                    i.j();
                    I[] iArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    iArr[i2] = i;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    I iRemoveFirst = this.c.removeFirst();
                    iRemoveFirst.j();
                    I[] iArr2 = this.e;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    iArr2[i3] = iRemoveFirst;
                }
                while (!this.d.isEmpty()) {
                    this.d.removeFirst().k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract I g();

    public abstract O h();

    public abstract E i(Throwable th);

    public abstract E j(I i, O o, boolean z);

    public final boolean k() {
        boolean z;
        E e;
        synchronized (this.b) {
            while (!this.l) {
                try {
                    if (!this.c.isEmpty() && this.h > 0) {
                        break;
                    }
                    this.b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.l) {
                return false;
            }
            I iRemoveFirst = this.c.removeFirst();
            O[] oArr = this.f;
            int i = this.h - 1;
            this.h = i;
            O o = oArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (iRemoveFirst.i(4)) {
                o.h(4);
            } else {
                o.u = iRemoveFirst.y;
                if (iRemoveFirst.i(134217728)) {
                    o.h(134217728);
                }
                long j = iRemoveFirst.y;
                synchronized (this.b) {
                    long j2 = this.m;
                    z = j2 == -9223372036854775807L || j >= j2;
                }
                if (!z) {
                    o.v = true;
                }
                try {
                    e = (E) j(iRemoveFirst, o, z2);
                } catch (OutOfMemoryError e2) {
                    e = (E) i(e2);
                } catch (RuntimeException e3) {
                    e = (E) i(e3);
                }
                if (e != null) {
                    synchronized (this.b) {
                        this.j = e;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k || o.v) {
                        o.k();
                    } else {
                        this.d.addLast(o);
                    }
                    iRemoveFirst.j();
                    I[] iArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    iArr[i2] = iRemoveFirst;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    @Override // defpackage.kn2
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final O d() {
        synchronized (this.b) {
            try {
                E e = this.j;
                if (e != null) {
                    throw e;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kn2
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void f(I i) {
        synchronized (this.b) {
            try {
                E e = this.j;
                if (e != null) {
                    throw e;
                }
                xl7.g(i == this.i);
                this.c.addLast(i);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(O o) {
        synchronized (this.b) {
            o.j();
            O[] oArr = this.f;
            int i = this.h;
            this.h = i + 1;
            oArr[i] = o;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }
}
