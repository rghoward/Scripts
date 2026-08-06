package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ao3;
import defpackage.ci0;
import defpackage.fg8;
import defpackage.hr0;
import defpackage.o1b;
import defpackage.qp1;
import defpackage.sd2;
import defpackage.tn3;
import defpackage.ts5;
import defpackage.tw2;
import defpackage.un3;
import defpackage.vn3;
import defpackage.wn3;
import defpackage.x76;
import defpackage.xn3;
import defpackage.yl7;
import defpackage.yn3;
import defpackage.zn3;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final ts5<ScheduledExecutorService> a = new ts5<>(new tn3());
    public static final ts5<ScheduledExecutorService> b = new ts5<>(new un3());
    public static final ts5<ScheduledExecutorService> c = new ts5<>(new vn3());
    public static final ts5<ScheduledExecutorService> d = new ts5<>(new wn3());

    public static tw2 a() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        if (Build.VERSION.SDK_INT >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return new tw2(Executors.newFixedThreadPool(4, new sd2("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<qp1<?>> getComponents() {
        fg8 fg8Var = new fg8(ci0.class, ScheduledExecutorService.class);
        fg8[] fg8VarArr = {new fg8(ci0.class, ExecutorService.class), new fg8(ci0.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(fg8Var);
        for (fg8 fg8Var2 : fg8VarArr) {
            yl7.b(fg8Var2, "Null interface");
        }
        Collections.addAll(hashSet, fg8VarArr);
        qp1 qp1Var = new qp1(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new xn3(), hashSet3);
        fg8 fg8Var3 = new fg8(hr0.class, ScheduledExecutorService.class);
        fg8[] fg8VarArr2 = {new fg8(hr0.class, ExecutorService.class), new fg8(hr0.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(fg8Var3);
        for (fg8 fg8Var4 : fg8VarArr2) {
            yl7.b(fg8Var4, "Null interface");
        }
        Collections.addAll(hashSet4, fg8VarArr2);
        qp1 qp1Var2 = new qp1(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new yn3(), hashSet6);
        fg8 fg8Var5 = new fg8(x76.class, ScheduledExecutorService.class);
        fg8[] fg8VarArr3 = {new fg8(x76.class, ExecutorService.class), new fg8(x76.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(fg8Var5);
        for (fg8 fg8Var6 : fg8VarArr3) {
            yl7.b(fg8Var6, "Null interface");
        }
        Collections.addAll(hashSet7, fg8VarArr3);
        qp1 qp1Var3 = new qp1(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new zn3(), hashSet9);
        qp1.a aVarA = qp1.a(new fg8(o1b.class, Executor.class));
        aVarA.f = new ao3();
        return Arrays.asList(qp1Var, qp1Var2, qp1Var3, aVarA.b());
    }
}
