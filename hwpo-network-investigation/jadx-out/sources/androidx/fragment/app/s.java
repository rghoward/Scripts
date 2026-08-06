package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import defpackage.b19;
import defpackage.c19;
import defpackage.e19;
import defpackage.f19;
import defpackage.g19;
import defpackage.lb2;
import defpackage.n76;
import defpackage.s66;
import defpackage.s97;
import defpackage.thb;
import defpackage.vhb;
import defpackage.whb;
import defpackage.wt4;
import defpackage.x09;
import defpackage.yd4;
import defpackage.z17;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements wt4, f19, whb {
    public final f t;
    public final vhb u;
    public final yd4 v;
    public thb.c w;
    public n76 x = null;
    public c19 y = null;

    public s(f fVar, vhb vhbVar, yd4 yd4Var) {
        this.t = fVar;
        this.u = vhbVar;
        this.v = yd4Var;
    }

    public final void a(s66.a aVar) {
        this.x.f(aVar);
    }

    public final void b() {
        if (this.x == null) {
            this.x = new n76(this, true);
            c19 c19Var = new c19(new e19(this, new s97(1, this)));
            this.y = c19Var;
            c19Var.a();
            this.v.run();
        }
    }

    @Override // defpackage.wt4
    public final lb2 getDefaultViewModelCreationExtras() {
        Application application;
        f fVar = this.t;
        Context applicationContext = fVar.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        z17 z17Var = new z17((Object) null);
        LinkedHashMap linkedHashMap = z17Var.a;
        if (application != null) {
            linkedHashMap.put(thb.a.d, application);
        }
        linkedHashMap.put(x09.a, fVar);
        linkedHashMap.put(x09.b, this);
        if (fVar.getArguments() != null) {
            linkedHashMap.put(x09.c, fVar.getArguments());
        }
        return z17Var;
    }

    @Override // defpackage.wt4
    public final thb.c getDefaultViewModelProviderFactory() {
        Application application;
        f fVar = this.t;
        thb.c defaultViewModelProviderFactory = fVar.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fVar.mDefaultFactory)) {
            this.w = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.w == null) {
            Context applicationContext = fVar.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.w = new g19(application, fVar, fVar.getArguments());
        }
        return this.w;
    }

    @Override // defpackage.m76
    public final s66 getLifecycle() {
        b();
        return this.x;
    }

    @Override // defpackage.f19
    public final b19 getSavedStateRegistry() {
        b();
        return this.y.b;
    }

    @Override // defpackage.whb
    public final vhb getViewModelStore() {
        b();
        return this.u;
    }
}
