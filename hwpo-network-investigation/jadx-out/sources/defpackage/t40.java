package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.platform.c;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class t40 {
    public g01 c;
    public g01 d;
    public IOException e;
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public final String f = "PublicSuffixDatabase.list";

    public final g01 a() {
        g01 g01Var = this.c;
        if (g01Var != null) {
            return g01Var;
        }
        xj5.e("bytes");
        throw null;
    }

    public final void b() {
        try {
            c cVar = c.a;
            Object obj = c.a;
            vd5 vd5VarC = null;
            uz1 uz1Var = obj != null ? (uz1) obj : null;
            Context contextB = uz1Var != null ? uz1Var.b() : null;
            AssetManager assets = contextB != null ? contextB.getAssets() : null;
            if (assets != null) {
                InputStream inputStreamOpen = assets.open(this.f);
                inputStreamOpen.getClass();
                vd5VarC = ev6.c(inputStreamOpen);
            } else if (Build.FINGERPRINT == null) {
                o03.a("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            } else {
                o03.a("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
            }
            ni8 ni8Var = new ni8(vd5VarC);
            try {
                g01 g01VarR = ni8Var.r(ni8Var.readInt());
                g01 g01VarR2 = ni8Var.r(ni8Var.readInt());
                g2b g2bVar = g2b.a;
                ni8Var.close();
                synchronized (this) {
                    g01VarR.getClass();
                    this.c = g01VarR;
                    g01VarR2.getClass();
                    this.d = g01VarR2;
                }
                this.b.countDown();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fg1.a(ni8Var, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            this.b.countDown();
            throw th3;
        }
    }
}
