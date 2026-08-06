package defpackage;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ozc {
    public volatile xxc a;
    public mzc b;

    public final mzc a(final lrc lrcVar) {
        final xxc xxcVar = this.a;
        xxc xxcVar2 = mzc.j;
        if (xxcVar != xxcVar2) {
            izc izcVar = mzc.i;
            izcVar.getClass();
            final gzc gzcVar = new gzc();
            gzcVar.a = false;
            ConcurrentHashMap concurrentHashMap = izcVar.a;
            Context context = lrcVar.b;
            String str = xxcVar.d;
            if (str == null) {
                str = (String) xxcVar.a.apply(context);
                xxcVar.d = str;
            }
            zxc zxcVar = (zxc) concurrentHashMap.computeIfAbsent(str, new Function() { // from class: dzc
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    zxc zxcVar2 = new zxc(new mzc(lrcVar, xxcVar));
                    gzcVar.a = true;
                    return zxcVar2;
                }
            });
            if (gzcVar.a) {
                y0d.a(lrcVar.b, new kh4(izcVar));
            }
            this.b = zxcVar.a;
            this.a = xxcVar2;
        }
        return this.b;
    }
}
