package androidx.emoji2.text;

import android.content.Context;
import android.os.Trace;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.fe3;
import defpackage.gc5;
import defpackage.ge3;
import defpackage.m76;
import defpackage.r10;
import defpackage.s66;
import defpackage.wu1;
import defpackage.yra;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements gc5<Boolean> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends d.c {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b implements d.h {
        public final Context a;

        public b(Context context) {
            this.a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.d.h
        public final void a(d.i iVar) {
            wu1 wu1Var = new wu1("EmojiCompatInitializer");
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), wu1Var);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new ge3(this, iVar, threadPoolExecutor, 0));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                Method method = yra.b;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (d.d()) {
                    d.a().e();
                }
            } finally {
                Method method2 = yra.b;
                Trace.endSection();
            }
        }
    }

    @Override // defpackage.gc5
    public final List<Class<? extends gc5<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.gc5
    public final Boolean b(Context context) {
        Object objB;
        a aVar = new a(new b(context));
        aVar.b = 1;
        if (d.k == null) {
            synchronized (d.j) {
                try {
                    if (d.k == null) {
                        d.k = new d(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        r10 r10VarC = r10.c(context);
        r10VarC.getClass();
        synchronized (r10.e) {
            try {
                objB = r10VarC.a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = r10VarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        s66 lifecycle = ((m76) objB).getLifecycle();
        lifecycle.a(new fe3(this, lifecycle));
        return Boolean.TRUE;
    }
}
