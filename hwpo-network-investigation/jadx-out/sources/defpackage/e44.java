package defpackage;

import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e44 implements nva {
    public static String a(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static /* synthetic */ void b() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.nva
    public Object apply(Object obj) {
        ev7 ev7Var = (ev7) obj;
        ev7Var.getClass();
        try {
            int iM = ev7Var.m(null);
            byte[] bArr = new byte[iM];
            Logger logger = tg1.y;
            tg1.a aVar = new tg1.a(bArr, iM);
            ev7Var.e(aVar);
            if (aVar.J1() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            jl.a("Serializing " + ev7Var.getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
            return null;
        }
    }
}
