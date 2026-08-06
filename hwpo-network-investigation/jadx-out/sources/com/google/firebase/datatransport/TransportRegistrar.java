package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ay2;
import defpackage.cxa;
import defpackage.fg8;
import defpackage.fxa;
import defpackage.j01;
import defpackage.kq1;
import defpackage.p51;
import defpackage.pxa;
import defpackage.qp1;
import defpackage.r66;
import defpackage.rp2;
import defpackage.sp2;
import defpackage.y56;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ fxa lambda$getComponents$0(kq1 kq1Var) {
        pxa.b((Context) kq1Var.a(Context.class));
        return pxa.a().c(j01.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ fxa lambda$getComponents$1(kq1 kq1Var) {
        pxa.b((Context) kq1Var.a(Context.class));
        return pxa.a().c(j01.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ fxa lambda$getComponents$2(kq1 kq1Var) {
        pxa.b((Context) kq1Var.a(Context.class));
        return pxa.a().c(j01.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<qp1<?>> getComponents() {
        qp1.a aVarB = qp1.b(fxa.class);
        aVarB.a = LIBRARY_NAME;
        aVarB.a(ay2.c(Context.class));
        aVarB.f = new rp2();
        qp1 qp1VarB = aVarB.b();
        qp1.a aVarA = qp1.a(new fg8(y56.class, fxa.class));
        aVarA.a(ay2.c(Context.class));
        aVarA.f = new p51();
        qp1 qp1VarB2 = aVarA.b();
        qp1.a aVarA2 = qp1.a(new fg8(cxa.class, fxa.class));
        aVarA2.a(ay2.c(Context.class));
        aVarA2.f = new sp2();
        return Arrays.asList(qp1VarB, qp1VarB2, aVarA2.b(), r66.a(LIBRARY_NAME, "19.0.0"));
    }
}
