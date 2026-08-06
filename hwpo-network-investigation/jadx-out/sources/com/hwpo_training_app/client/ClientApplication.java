package com.hwpo_training_app.client;

import android.content.res.Resources;
import defpackage.a78;
import defpackage.df1;
import defpackage.dx4;
import defpackage.e04;
import defpackage.g14;
import defpackage.g2b;
import defpackage.ha2;
import defpackage.k55;
import defpackage.o7a;
import defpackage.rma;
import defpackage.xg5;
import defpackage.xj5;
import defpackage.z90;
import defpackage.zz1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ClientApplication extends dx4 {
    public static final /* synthetic */ int y = 0;
    public k55 v;
    public xg5 w;
    public final o7a x = new o7a(new df1(0, this));

    public final k55 b() {
        k55 k55Var = this.v;
        if (k55Var != null) {
            return k55Var;
        }
        xj5.e("buildConfig");
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        zz1 zz1Var = (zz1) this.x.getValue();
        Resources resources = super.getResources();
        resources.getClass();
        zz1Var.a(resources);
        return resources;
    }

    @Override // defpackage.dx4, android.app.Application
    public final void onCreate() {
        super.onCreate();
        b();
        ha2 ha2Var = new ha2();
        rma.a aVar = rma.a;
        aVar.getClass();
        if (ha2Var == aVar) {
            z90.a("Cannot plant Timber into itself.");
            return;
        }
        ArrayList<rma.b> arrayList = rma.b;
        synchronized (arrayList) {
            arrayList.add(ha2Var);
            Object[] array = arrayList.toArray(new rma.b[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            rma.c = (rma.b[]) array;
            g2b g2bVar = g2b.a;
        }
        b();
        a78.e("1:1002898446466:android:e4b8b25a91cfdf3e8bfc9b", "ApplicationId must be set.");
        b();
        b();
        a78.e("AIzaSyBy5YYjSLldSgkJG3etwZjt6Agh8yS6wW0", "ApiKey must be set.");
        g14 g14Var = new g14("1:1002898446466:android:e4b8b25a91cfdf3e8bfc9b", "AIzaSyBy5YYjSLldSgkJG3etwZjt6Agh8yS6wW0", null, null, null, null, "hwpo-6d183");
        b();
        e04.f(g14Var, this, "HWPO");
        b();
        xg5 xg5Var = this.w;
        if (xg5Var == null) {
            xj5.e("intercom");
            throw null;
        }
        xg5Var.a();
        b();
    }
}
