package defpackage;

import android.content.Context;
import com.intercom.twig.BuildConfig;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pxa {
    public static volatile me2 e;
    public final uf1 a;
    public final uf1 b;
    public final q49 c;
    public final v4b d;

    public pxa(uf1 uf1Var, uf1 uf1Var2, q49 q49Var, v4b v4bVar, final sob sobVar) {
        this.a = uf1Var;
        this.b = uf1Var2;
        this.c = q49Var;
        this.d = v4bVar;
        sobVar.a.execute(new Runnable() { // from class: qob
            @Override // java.lang.Runnable
            public final void run() {
                final sob sobVar2 = sobVar;
                sobVar2.d.m(new n7a.a() { // from class: rob
                    @Override // n7a.a
                    public final Object execute() {
                        sob sobVar3 = sobVar2;
                        Iterator<exa> it = sobVar3.b.A().iterator();
                        while (it.hasNext()) {
                            sobVar3.c.a(it.next(), 1);
                        }
                        return null;
                    }
                });
            }
        });
    }

    public static pxa a() {
        me2 me2Var = e;
        if (me2Var != null) {
            return me2Var.z.get();
        }
        aa0.c("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (pxa.class) {
                try {
                    if (e == null) {
                        le2 le2Var = new le2();
                        context.getClass();
                        le2Var.a = context;
                        e = le2Var.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final gxa c(j01 j01Var) {
        byte[] bytes;
        Set setUnmodifiableSet = j01Var != null ? Collections.unmodifiableSet(j01.d) : Collections.singleton(new ag3("proto"));
        j01Var.getClass();
        String str = j01Var.a;
        String str2 = j01Var.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = BuildConfig.FLAVOR;
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        return new gxa(setUnmodifiableSet, new ef0("cct", bytes, o98.t), this);
    }
}
