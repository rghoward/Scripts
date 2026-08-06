package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ay2;
import defpackage.b3;
import defpackage.kq1;
import defpackage.qp1;
import defpackage.r66;
import defpackage.si;
import defpackage.y2;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y2 lambda$getComponents$0(kq1 kq1Var) {
        return new y2((Context) kq1Var.a(Context.class), kq1Var.c(si.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<qp1<?>> getComponents() {
        qp1.a aVarB = qp1.b(y2.class);
        aVarB.a = LIBRARY_NAME;
        aVarB.a(ay2.c(Context.class));
        aVarB.a(ay2.a(si.class));
        aVarB.f = new b3();
        return Arrays.asList(aVarB.b(), r66.a(LIBRARY_NAME, "21.1.1"));
    }
}
