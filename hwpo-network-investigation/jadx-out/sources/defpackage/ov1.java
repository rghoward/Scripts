package defpackage;

import android.content.Context;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.d;
import com.google.firebase.remoteconfig.internal.e;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ov1 {
    public final LinkedHashSet a;
    public final d b;
    public final t04 c;
    public final ScheduledExecutorService d;

    public ov1(e04 e04Var, t04 t04Var, c cVar, gv1 gv1Var, Context context, String str, e eVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.a = linkedHashSet;
        this.b = new d(e04Var, t04Var, cVar, gv1Var, context, str, linkedHashSet, eVar, scheduledExecutorService);
        this.c = t04Var;
        this.d = scheduledExecutorService;
    }
}
