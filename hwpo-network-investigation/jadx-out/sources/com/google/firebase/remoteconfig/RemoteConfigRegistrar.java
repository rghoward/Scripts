package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ay2;
import defpackage.b04;
import defpackage.e04;
import defpackage.e14;
import defpackage.fg8;
import defpackage.g24;
import defpackage.hr0;
import defpackage.kq1;
import defpackage.qp1;
import defpackage.r66;
import defpackage.si;
import defpackage.sm8;
import defpackage.t04;
import defpackage.y2;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static sm8 lambda$getComponents$0(fg8 fg8Var, kq1 kq1Var) {
        b04 b04Var;
        Context context = (Context) kq1Var.a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) kq1Var.g(fg8Var);
        e04 e04Var = (e04) kq1Var.a(e04.class);
        t04 t04Var = (t04) kq1Var.a(t04.class);
        y2 y2Var = (y2) kq1Var.a(y2.class);
        synchronized (y2Var) {
            try {
                if (!y2Var.a.containsKey("frc")) {
                    y2Var.a.put("frc", new b04(y2Var.b));
                }
                b04Var = (b04) y2Var.a.get("frc");
            } catch (Throwable th) {
                throw th;
            }
        }
        return new sm8(context, scheduledExecutorService, e04Var, t04Var, b04Var, kq1Var.c(si.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<qp1<?>> getComponents() {
        fg8 fg8Var = new fg8(hr0.class, ScheduledExecutorService.class);
        qp1.a aVar = new qp1.a(sm8.class, new Class[]{g24.class});
        aVar.a = LIBRARY_NAME;
        aVar.a(ay2.c(Context.class));
        aVar.a(new ay2((fg8<?>) fg8Var, 1, 0));
        aVar.a(ay2.c(e04.class));
        aVar.a(ay2.c(t04.class));
        aVar.a(ay2.c(y2.class));
        aVar.a(ay2.a(si.class));
        aVar.f = new e14(fg8Var, 1);
        aVar.c(2);
        return Arrays.asList(aVar.b(), r66.a(LIBRARY_NAME, "23.1.0"));
    }
}
