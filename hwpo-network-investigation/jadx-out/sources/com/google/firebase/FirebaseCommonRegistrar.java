package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ay2;
import defpackage.ci0;
import defpackage.e04;
import defpackage.f04;
import defpackage.fg8;
import defpackage.g04;
import defpackage.h04;
import defpackage.k5b;
import defpackage.lr2;
import defpackage.p66;
import defpackage.qp1;
import defpackage.qq1;
import defpackage.r66;
import defpackage.ru4;
import defpackage.tp5;
import defpackage.tu4;
import defpackage.uu4;
import defpackage.vr0;
import defpackage.xk;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<qp1<?>> getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        qp1.a aVarB = qp1.b(k5b.class);
        aVarB.a(new ay2(2, 0, p66.class));
        aVarB.f = new xk();
        arrayList.add(aVarB.b());
        final fg8 fg8Var = new fg8(ci0.class, Executor.class);
        qp1.a aVar = new qp1.a(lr2.class, new Class[]{tu4.class, uu4.class});
        aVar.a(ay2.c(Context.class));
        aVar.a(ay2.c(e04.class));
        aVar.a(new ay2(2, 0, ru4.class));
        aVar.a(new ay2(1, 1, k5b.class));
        aVar.a(new ay2((fg8<?>) fg8Var, 1, 0));
        aVar.f = new qq1() { // from class: jr2
            @Override // defpackage.qq1
            public final Object a(xu8 xu8Var) {
                return new lr2((Context) xu8Var.a(Context.class), ((e04) xu8Var.a(e04.class)).d(), xu8Var.b(fg8.a(ru4.class)), xu8Var.c(k5b.class), (Executor) xu8Var.g(fg8Var));
            }
        };
        arrayList.add(aVar.b());
        arrayList.add(r66.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(r66.a("fire-core", "22.0.1"));
        arrayList.add(r66.a("device-name", a(Build.PRODUCT)));
        arrayList.add(r66.a("device-model", a(Build.DEVICE)));
        arrayList.add(r66.a("device-brand", a(Build.BRAND)));
        arrayList.add(r66.b("android-target-sdk", new vr0()));
        arrayList.add(r66.b("android-min-sdk", new f04()));
        arrayList.add(r66.b("android-platform", new g04()));
        arrayList.add(r66.b("android-installer", new h04()));
        try {
            tp5.u.getClass();
            str = "2.3.21";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(r66.a("kotlin", str));
        }
        return arrayList;
    }
}
