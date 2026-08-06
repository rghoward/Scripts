package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b2c<T> implements di7, lh7, ch7 {
    public boolean A;
    public final Object t = new Object();
    public final int u;
    public final q6d v;
    public int w;
    public int x;
    public int y;
    public Exception z;

    public b2c(int i, q6d q6dVar) {
        this.u = i;
        this.v = q6dVar;
    }

    public final void a() {
        int i = this.w;
        int i2 = this.x;
        int i3 = i + i2 + this.y;
        int i4 = this.u;
        if (i3 == i4) {
            Exception exc = this.z;
            q6d q6dVar = this.v;
            if (exc == null) {
                if (this.A) {
                    q6dVar.s();
                    return;
                } else {
                    q6dVar.p(null);
                    return;
                }
            }
            int length = String.valueOf(i2).length();
            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + length + 8 + 24);
            sb.append(i2);
            sb.append(" out of ");
            sb.append(i4);
            sb.append(" underlying tasks failed");
            q6dVar.r(new ExecutionException(sb.toString(), this.z));
        }
    }

    @Override // defpackage.ch7
    public final void b() {
        synchronized (this.t) {
            this.y++;
            this.A = true;
            a();
        }
    }

    @Override // defpackage.lh7
    public final void d(Exception exc) {
        synchronized (this.t) {
            this.x++;
            this.z = exc;
            a();
        }
    }

    @Override // defpackage.di7
    public final void onSuccess(T t) {
        synchronized (this.t) {
            this.w++;
            a();
        }
    }
}
