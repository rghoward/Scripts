package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nrc implements l5a {
    public final /* synthetic */ Context t;

    public /* synthetic */ nrc(Context context) {
        this.t = context;
    }

    /* JADX WARN: Type inference failed for: r8v13, types: [grc] */
    /* JADX WARN: Type inference failed for: r8v7, types: [erc] */
    @Override // defpackage.l5a
    public final Object get() {
        Object obj = lrc.j;
        final irc ircVar = new irc();
        Context context = this.t;
        ircVar.a = context;
        context.getClass();
        if (ircVar.b == null) {
            ircVar.b = lrc.m;
        }
        if (ircVar.c == null) {
            final Context context2 = ircVar.a;
            ircVar.c = m5a.a(new l5a() { // from class: rrc
                @Override // defpackage.l5a
                public final Object get() {
                    Object obj2 = lrc.j;
                    zw zwVar = ioc.a;
                    return new ttc(new kpc(context2, ioc.a, zw.c.a, vn4.a.c));
                }
            });
        }
        if (ircVar.d == null) {
            ircVar.d = new l5a() { // from class: grc
                @Override // defpackage.l5a
                public final Object get() {
                    return new i88(new x0d(ircVar.b));
                }
            };
        }
        if (ircVar.e == null) {
            Context context3 = ircVar.a;
            final ArrayList arrayList = new ArrayList();
            m2d m2dVar = new m2d(new l2d(context3));
            new ConcurrentHashMap();
            Collections.addAll(arrayList, m2dVar, new w2d());
            ircVar.e = m5a.a(new l5a() { // from class: prc
                @Override // defpackage.l5a
                public final /* synthetic */ Object get() {
                    Object obj2 = lrc.j;
                    return new j2d(arrayList);
                }
            });
        }
        if (ircVar.f == null) {
            ircVar.f = new l5a() { // from class: erc
                @Override // defpackage.l5a
                public final Object get() {
                    Context context4 = ircVar.a;
                    Object obj2 = lrc.j;
                    try {
                        ApplicationInfo applicationInfo = context4.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                        applicationInfo.getClass();
                        return new i88(applicationInfo);
                    } catch (PackageManager.NameNotFoundException unused) {
                        return f0.t;
                    }
                }
            };
        }
        return new lrc(ircVar.a, ircVar.b, ircVar.c, ircVar.d, ircVar.e, ircVar.f);
    }
}
