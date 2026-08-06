package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class fl4 extends g5b<a, l59> {
    public final sta a;
    public final p43 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pk.d(this.a, "Params(challengeId=", ")");
        }
    }

    public fl4(sta staVar, p43 p43Var) {
        staVar.getClass();
        p43Var.getClass();
        this.a = staVar;
        this.b = p43Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(a aVar, u02 u02Var) throws Throwable {
        gl4 gl4Var;
        if (u02Var instanceof gl4) {
            gl4Var = (gl4) u02Var;
            int i = gl4Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                gl4Var.v = i - Integer.MIN_VALUE;
            } else {
                gl4Var = new gl4(this, u02Var);
            }
        } else {
            gl4Var = new gl4(this, u02Var);
        }
        Object objH = gl4Var.t;
        int i2 = gl4Var.v;
        if (i2 == 0) {
            dv8.b(objH);
            int i3 = aVar.a;
            gl4Var.v = 1;
            objH = this.a.h(i3, gl4Var);
            v72 v72Var = v72.t;
            if (objH == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objH);
        }
        l59 l59Var = (l59) objH;
        ArrayList arrayListA = ii6.a(l59Var.e, this.b);
        int i4 = l59Var.a;
        List<String> list = l59Var.b;
        String str = l59Var.c;
        long j = l59Var.d;
        list.getClass();
        return new l59(i4, list, str, j, arrayListA);
    }
}
