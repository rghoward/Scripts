package defpackage;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ao3 implements qq1 {
    public static StringBuilder b(String str, long j, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    @Override // defpackage.qq1
    public Object a(xu8 xu8Var) {
        ts5<ScheduledExecutorService> ts5Var = ExecutorsRegistrar.a;
        return m1b.t;
    }
}
