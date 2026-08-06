package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cac extends o8c {
    @Override // defpackage.o8c
    public final a8c a(String str, cgc cgcVar, ArrayList arrayList) {
        if (str == null || str.isEmpty() || !cgcVar.d(str)) {
            z90.a(ct1.a("Command not found: ", str));
            return null;
        }
        a8c a8cVarG = cgcVar.g(str);
        if (a8cVarG instanceof g6c) {
            return ((g6c) a8cVarG).a(cgcVar, arrayList);
        }
        z90.a(sk0.c("Function ", str, " is not defined"));
        return null;
    }
}
