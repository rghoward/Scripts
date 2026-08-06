package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.ay2;
import defpackage.cxa;
import defpackage.e04;
import defpackage.e14;
import defpackage.fg8;
import defpackage.fxa;
import defpackage.k5b;
import defpackage.kq1;
import defpackage.m4a;
import defpackage.qp1;
import defpackage.r66;
import defpackage.t04;
import defpackage.uu4;
import defpackage.w04;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(fg8 fg8Var, kq1 kq1Var) {
        return new FirebaseMessaging((e04) kq1Var.a(e04.class), (w04) kq1Var.a(w04.class), kq1Var.c(k5b.class), kq1Var.c(uu4.class), (t04) kq1Var.a(t04.class), kq1Var.f(fg8Var), (m4a) kq1Var.a(m4a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<qp1<?>> getComponents() {
        fg8 fg8Var = new fg8(cxa.class, fxa.class);
        qp1.a aVarB = qp1.b(FirebaseMessaging.class);
        aVarB.a = LIBRARY_NAME;
        aVarB.a(ay2.c(e04.class));
        aVarB.a(new ay2(0, 0, w04.class));
        aVarB.a(ay2.a(k5b.class));
        aVarB.a(ay2.a(uu4.class));
        aVarB.a(ay2.c(t04.class));
        aVarB.a(new ay2((fg8<?>) fg8Var, 0, 1));
        aVarB.a(ay2.c(m4a.class));
        aVarB.f = new e14(fg8Var, 0);
        aVarB.c(1);
        return Arrays.asList(aVarB.b(), r66.a(LIBRARY_NAME, "25.0.2"));
    }
}
