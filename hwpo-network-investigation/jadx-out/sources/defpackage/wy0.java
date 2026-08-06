package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wy0 implements ce8 {
    public final ns3 a;
    public js3 b;
    public zq2 c;

    public wy0(ns3 ns3Var) {
        this.a = ns3Var;
    }

    public final long a() {
        zq2 zq2Var = this.c;
        if (zq2Var != null) {
            return zq2Var.d;
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    public final void b(if2 if2Var, Uri uri, Map map, long j, long j2, ge8 ge8Var) throws e3b {
        zq2 zq2Var = new zq2(if2Var, j, j2);
        this.c = zq2Var;
        if (this.b != null) {
            return;
        }
        js3[] js3VarArrB = this.a.b(uri, map);
        k95.a aVarO = k95.o(js3VarArrB.length);
        boolean z = true;
        if (js3VarArrB.length == 1) {
            this.b = js3VarArrB[0];
        } else {
            for (js3 js3Var : js3VarArrB) {
                try {
                    if (js3Var.d(zq2Var)) {
                        this.b = js3Var;
                        zq2Var.f = 0;
                        break;
                    }
                    aVarO.d(js3Var.f());
                    boolean z2 = this.b != null || zq2Var.d == j;
                    xl7.r(z2);
                    zq2Var.f = 0;
                } catch (EOFException unused) {
                    if (this.b != null || zq2Var.d == j) {
                    }
                } catch (Throwable th) {
                    if (this.b == null && zq2Var.d != j) {
                        z = false;
                    }
                    xl7.r(z);
                    zq2Var.f = 0;
                    throw th;
                }
                xl7.r(z2);
                zq2Var.f = 0;
            }
            if (this.b == null) {
                String str = "None of the available extractors (" + new pl5(", ").b(jb6.b(k95.r(js3VarArrB), new vy0())) + ") could read the stream.";
                uri.getClass();
                throw new e3b(str, aVarO.g());
            }
        }
        this.b.g(ge8Var);
    }
}
