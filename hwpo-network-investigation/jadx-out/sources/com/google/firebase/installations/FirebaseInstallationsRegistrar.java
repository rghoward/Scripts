package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.ay2;
import defpackage.ci0;
import defpackage.e04;
import defpackage.fg8;
import defpackage.hd9;
import defpackage.hr0;
import defpackage.kq1;
import defpackage.op1;
import defpackage.qp1;
import defpackage.r66;
import defpackage.ru4;
import defpackage.s04;
import defpackage.su4;
import defpackage.t04;
import defpackage.tu4;
import defpackage.v04;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static t04 lambda$getComponents$0(kq1 kq1Var) {
        return new s04((e04) kq1Var.a(e04.class), kq1Var.c(tu4.class), (ExecutorService) kq1Var.g(new fg8(ci0.class, ExecutorService.class)), new hd9((Executor) kq1Var.g(new fg8(hr0.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<qp1<?>> getComponents() {
        qp1.a aVarB = qp1.b(t04.class);
        aVarB.a = LIBRARY_NAME;
        aVarB.a(ay2.c(e04.class));
        aVarB.a(ay2.a(tu4.class));
        aVarB.a(new ay2((fg8<?>) new fg8(ci0.class, ExecutorService.class), 1, 0));
        aVarB.a(new ay2((fg8<?>) new fg8(hr0.class, Executor.class), 1, 0));
        aVarB.f = new v04();
        qp1 qp1VarB = aVarB.b();
        su4 su4Var = new su4();
        qp1.a aVarB2 = qp1.b(ru4.class);
        aVarB2.e = 1;
        aVarB2.f = new op1(su4Var);
        return Arrays.asList(qp1VarB, aVarB2.b(), r66.a(LIBRARY_NAME, "19.1.0"));
    }
}
