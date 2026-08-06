package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bv1 {
    public final vf1 a;
    public boolean b;

    public bv1() {
        this(vf1.a);
    }

    public final synchronized void a() {
        boolean z = false;
        while (!this.b) {
            try {
                this.a.getClass();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean b(long j) {
        try {
            if (j <= 0) {
                return this.b;
            }
            long jC = this.a.c();
            long j2 = j + jC;
            if (j2 < jC) {
                a();
            } else {
                boolean z = false;
                while (!this.b && jC < j2) {
                    try {
                        this.a.getClass();
                        wait(j2 - jC);
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                    jC = this.a.c();
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
            return this.b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean c() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public bv1(vf1 vf1Var) {
        this.a = vf1Var;
    }
}
