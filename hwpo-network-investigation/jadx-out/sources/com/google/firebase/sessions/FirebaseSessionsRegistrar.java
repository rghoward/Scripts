package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ay2;
import defpackage.ba8;
import defpackage.ci0;
import defpackage.e04;
import defpackage.fg8;
import defpackage.fn8;
import defpackage.fxa;
import defpackage.gn8;
import defpackage.h72;
import defpackage.hr0;
import defpackage.i43;
import defpackage.ie9;
import defpackage.k24;
import defpackage.ke2;
import defpackage.km3;
import defpackage.kq1;
import defpackage.lf8;
import defpackage.n72;
import defpackage.nh9;
import defpackage.o24;
import defpackage.of8;
import defpackage.om9;
import defpackage.p24;
import defpackage.q24;
import defpackage.qc6;
import defpackage.qm9;
import defpackage.qp1;
import defpackage.r24;
import defpackage.r66;
import defpackage.s24;
import defpackage.t04;
import defpackage.t24;
import defpackage.tg9;
import defpackage.uk9;
import defpackage.ve5;
import defpackage.vg9;
import defpackage.wi9;
import defpackage.ws0;
import defpackage.x24;
import defpackage.y24;
import defpackage.z24;
import defpackage.z6b;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final a Companion = new a();
    private static final fg8<Context> appContext = fg8.a(Context.class);
    private static final fg8<e04> firebaseApp = fg8.a(e04.class);
    private static final fg8<t04> firebaseInstallationsApi = fg8.a(t04.class);
    private static final fg8<n72> backgroundDispatcher = new fg8<>(ci0.class, n72.class);
    private static final fg8<n72> blockingDispatcher = new fg8<>(hr0.class, n72.class);
    private static final fg8<fxa> transportFactory = fg8.a(fxa.class);
    private static final fg8<o24> firebaseSessionsComponent = fg8.a(o24.class);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k24 getComponents$lambda$0(kq1 kq1Var) {
        return ((o24) kq1Var.g(firebaseSessionsComponent)).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o24 getComponents$lambda$1(kq1 kq1Var) {
        Object objG = kq1Var.g(appContext);
        objG.getClass();
        Object objG2 = kq1Var.g(backgroundDispatcher);
        objG2.getClass();
        Object objG3 = kq1Var.g(blockingDispatcher);
        objG3.getClass();
        Object objG4 = kq1Var.g(firebaseApp);
        objG4.getClass();
        Object objG5 = kq1Var.g(firebaseInstallationsApi);
        objG5.getClass();
        of8 of8VarF = kq1Var.f(transportFactory);
        of8VarF.getClass();
        ke2 ke2Var = new ke2();
        ke2Var.a = ve5.a((e04) objG4);
        ve5 ve5VarA = ve5.a((Context) objG);
        ke2Var.b = ve5VarA;
        ke2Var.c = i43.a(new qc6(ve5VarA));
        ke2Var.d = i43.a(s24.a.a);
        ke2Var.e = ve5.a((t04) objG5);
        ke2Var.f = i43.a(new p24(ke2Var.a));
        ve5 ve5VarA2 = ve5.a((h72) objG3);
        ke2Var.g = ve5VarA2;
        ke2Var.h = i43.a(new fn8(ve5VarA2, ke2Var.f));
        ke2Var.i = ve5.a((h72) objG2);
        ke2Var.j = i43.a(new wi9(ke2Var.c, i43.a(new gn8(ke2Var.d, ke2Var.e, ke2Var.f, ke2Var.h, i43.a(new uk9(ke2Var.i, ke2Var.d, i43.a(new q24(ke2Var.b, ke2Var.g))))))));
        lf8<z6b> lf8VarA = i43.a(t24.a.a);
        ke2Var.k = lf8VarA;
        ke2Var.l = i43.a(new vg9(ke2Var.d, lf8VarA));
        ke2Var.m = i43.a(new tg9(ke2Var.a, ke2Var.e, ke2Var.j, i43.a(new km3(ve5.a(of8VarF))), ke2Var.i));
        ke2Var.n = i43.a(new r24(ke2Var.b, ke2Var.g, i43.a(new ie9(ke2Var.l))));
        lf8<om9> lf8VarA2 = i43.a(new qm9(ke2Var.j, ke2Var.l, ke2Var.m, ke2Var.d, ke2Var.n, i43.a(new ba8(ke2Var.b, ke2Var.k)), ke2Var.i));
        ke2Var.o = lf8VarA2;
        ke2Var.p = i43.a(new z24(ke2Var.a, ke2Var.j, ke2Var.i, i43.a(new nh9(lf8VarA2))));
        return ke2Var;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<qp1<? extends Object>> getComponents() {
        qp1.a aVarB = qp1.b(k24.class);
        aVarB.a = LIBRARY_NAME;
        aVarB.a(ay2.b(firebaseSessionsComponent));
        aVarB.f = new x24();
        aVarB.c(2);
        qp1 qp1VarB = aVarB.b();
        qp1.a aVarB2 = qp1.b(o24.class);
        aVarB2.a = "fire-sessions-component";
        aVarB2.a(ay2.b(appContext));
        aVarB2.a(ay2.b(backgroundDispatcher));
        aVarB2.a(ay2.b(blockingDispatcher));
        aVarB2.a(ay2.b(firebaseApp));
        aVarB2.a(ay2.b(firebaseInstallationsApi));
        aVarB2.a(new ay2(transportFactory, 1, 1));
        aVarB2.f = new y24();
        return ws0.i(qp1VarB, aVarB2.b(), r66.a(LIBRARY_NAME, "3.0.6"));
    }
}
