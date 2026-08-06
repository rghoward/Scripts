package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.a76;
import defpackage.aa0;
import defpackage.ga8;
import defpackage.gc5;
import defpackage.ha8;
import defpackage.hf3;
import defpackage.m76;
import defpackage.r10;
import defpackage.s66;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements gc5<m76> {
    @Override // defpackage.gc5
    public final List<Class<? extends gc5<?>>> a() {
        return hf3.t;
    }

    @Override // defpackage.gc5
    public final m76 b(Context context) {
        context.getClass();
        r10 r10VarC = r10.c(context);
        r10VarC.getClass();
        if (!r10VarC.b.contains(ProcessLifecycleInitializer.class)) {
            aa0.c("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!a76.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new a76.a());
        }
        ga8 ga8Var = ga8.B;
        ga8Var.getClass();
        ga8Var.x = new Handler();
        ga8Var.y.f(s66.a.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new ha8(ga8Var));
        return ga8Var;
    }
}
