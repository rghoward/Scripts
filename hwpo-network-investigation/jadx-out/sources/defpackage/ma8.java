package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ma8 {
    public static final void a(cca ccaVar, Context context, final boolean z, final String str, final long j) {
        if (lja.c(j) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List list = (List) ja8.t.invoke(context2);
        if (list.isEmpty()) {
            return;
        }
        t27<dca> t27Var = ccaVar.a;
        t27<dca> t27Var2 = ccaVar.a;
        zca zcaVar = zca.b;
        t27Var.g(zcaVar);
        int size = list.size();
        int i = 0;
        while (i < size) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            t27Var2.g(new sca(new ka8(i), resolveInfo.loadLabel(packageManager).toString(), 0, new oh4() { // from class: la8
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    ja8.u.invoke(context2, resolveInfo, Boolean.valueOf(z), str, new lja(j));
                    ((ada) obj).close();
                    return g2b.a;
                }
            }));
            i++;
            context2 = context;
        }
        t27Var2.g(zcaVar);
    }
}
