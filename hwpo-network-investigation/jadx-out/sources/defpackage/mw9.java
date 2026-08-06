package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.data.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mw9 implements ye2, ye2.a {
    public final en2<?> t;
    public final gn2 u;
    public volatile int v;
    public volatile oe2 w;
    public volatile Object x;
    public volatile kx6.a<?> y;
    public volatile pe2 z;

    public mw9(en2 en2Var, gn2 gn2Var) {
        this.t = en2Var;
        this.u = gn2Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    @Override // defpackage.ye2
    public final boolean a() {
        boolean z;
        if (this.x == null) {
            if (this.w != null) {
            }
            this.w = null;
            this.y = null;
            z = false;
            while (!z) {
                ArrayList arrayListB = this.t.b();
                int i = this.v;
                this.v = i + 1;
                this.y = (kx6.a) arrayListB.get(i);
                if (this.y == null) {
                }
            }
            return z;
        }
        Object obj = this.x;
        this.x = null;
        try {
            if (b(obj)) {
                if (this.w != null || !this.w.a()) {
                    this.w = null;
                    this.y = null;
                    z = false;
                    while (!z && this.v < this.t.b().size()) {
                        ArrayList arrayListB2 = this.t.b();
                        int i2 = this.v;
                        this.v = i2 + 1;
                        this.y = (kx6.a) arrayListB2.get(i2);
                        if (this.y == null && (this.t.p.c(this.y.c.getDataSource()) || this.t.c(this.y.c.a()) != null)) {
                            this.y.c.c(this.t.o, new lw9(this, this.y));
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
            }
        }
        return true;
    }

    public final boolean b(Object obj) throws Throwable {
        Throwable th;
        int i = vd6.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            a aVarG = this.t.c.a().g(obj);
            Object objA = aVarG.a();
            xf3<X> xf3VarD = this.t.d(objA);
            qe2 qe2Var = new qe2(xf3VarD, objA, this.t.i);
            ko5 ko5Var = this.y.a;
            en2<?> en2Var = this.t;
            pe2 pe2Var = new pe2(ko5Var, en2Var.n);
            j13 j13VarA = ((hg3.c) en2Var.h).a();
            j13VarA.c(pe2Var, qe2Var);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + pe2Var + ", data: " + obj + ", encoder: " + xf3VarD + ", duration: " + vd6.a(jElapsedRealtimeNanos));
            }
            if (j13VarA.b(pe2Var) != null) {
                this.z = pe2Var;
                this.w = new oe2(Collections.singletonList(this.y.a), this.t, this);
                this.y.c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.z + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.u.f(this.y.a, aVarG.a(), this.y.c, this.y.c.getDataSource(), this.y.a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.y.c.b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.ye2
    public final void cancel() {
        kx6.a<?> aVar = this.y;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // ye2.a
    public final void e(ko5 ko5Var, Exception exc, xe2<?> xe2Var, kf2 kf2Var) {
        this.u.e(ko5Var, exc, xe2Var, this.y.c.getDataSource());
    }

    @Override // ye2.a
    public final void f(ko5 ko5Var, Object obj, xe2<?> xe2Var, kf2 kf2Var, ko5 ko5Var2) {
        this.u.f(ko5Var, obj, xe2Var, this.y.c.getDataSource(), ko5Var);
    }
}
