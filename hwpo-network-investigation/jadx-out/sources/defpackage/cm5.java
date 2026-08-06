package defpackage;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cm5 {
    public final /* synthetic */ dm5 a;

    public cm5(dm5 dm5Var) {
        this.a = dm5Var;
    }

    public final String a(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            dm5 dm5Var = this.a;
            nn5 nn5Var = new nn5(stringWriter, dm5Var.a, dm5Var.b, dm5Var.c, dm5Var.d);
            nn5Var.h(obj);
            nn5Var.j();
            nn5Var.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }
}
