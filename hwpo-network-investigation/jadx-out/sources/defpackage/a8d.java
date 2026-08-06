package defpackage;

import defpackage.b9d;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class a8d<API extends b9d<API>> {
    public final l4c a;

    public a8d(l4c l4cVar) {
        this.a = l4cVar;
    }

    public static void a(String str, p8d p8dVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(p8dVar.b / 1000000)));
        sb.append(": logging error [");
        x8d x8dVar = p8dVar.d;
        if (x8dVar == null) {
            aa0.c("cannot request log site information prior to postProcess()");
            return;
        }
        pu9.c(1, x8dVar, sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }
}
