package defpackage;

import com.hwpo_training_app.core.data.model.schedule.BenchmarkNetworkEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vr8 implements sr8 {
    public final rr8 a;
    public final wr8 b;
    public final r54<List<ao0>> c;

    public vr8(rr8 rr8Var, wr8 wr8Var) {
        rr8Var.getClass();
        wr8Var.getClass();
        this.a = rr8Var;
        this.b = wr8Var;
        this.c = wr8Var.d();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.sr8
    public final Object a(u02 u02Var) throws Throwable {
        tr8 tr8Var;
        ArrayList arrayList;
        if (u02Var instanceof tr8) {
            tr8Var = (tr8) u02Var;
            int i = tr8Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                tr8Var.w = i - Integer.MIN_VALUE;
            } else {
                tr8Var = new tr8(this, u02Var);
            }
        } else {
            tr8Var = new tr8(this, u02Var);
        }
        Object objA = tr8Var.u;
        int i2 = tr8Var.w;
        v72 v72Var = v72.t;
        if (i2 == 0) {
            dv8.b(objA);
            tr8Var.w = 1;
            objA = this.a.a(tr8Var);
            if (objA != v72Var) {
            }
            return v72Var;
        }
        if (i2 == 1) {
            dv8.b(objA);
        } else {
            if (i2 != 2) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = tr8Var.t;
            dv8.b(objA);
        }
        return Boolean.valueOf(!arrayList.isEmpty());
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList2 = new ArrayList(ph1.n(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(((BenchmarkNetworkEntity) it.next()).a());
        }
        tr8Var.t = arrayList2;
        tr8Var.w = 2;
        if (this.b.b(arrayList2) != v72Var) {
            arrayList = arrayList2;
            return Boolean.valueOf(!arrayList.isEmpty());
        }
        return v72Var;
    }

    @Override // defpackage.sr8
    public final r54<List<ao0>> b() {
        return this.c;
    }

    @Override // defpackage.sr8
    public final Object c(ge1 ge1Var) {
        g2b g2bVarClear = this.b.clear();
        return g2bVarClear == v72.t ? g2bVarClear : g2b.a;
    }

    @Override // defpackage.sr8
    public final Object d(int i, g5b.b bVar) {
        return this.b.c(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r5.b.a(r7) == r4) goto L21;
     */
    @Override // defpackage.sr8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(int r6, java.lang.String r7, java.lang.String r8, defpackage.u02 r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.ur8
            if (r0 == 0) goto L13
            r0 = r9
            ur8 r0 = (defpackage.ur8) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            ur8 r0 = new ur8
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.u
            int r1 = r0.w
            r2 = 2
            r3 = 1
            v72 r4 = defpackage.v72.t
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.dv8.b(r9)
            goto L5a
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r5)
            r5 = 0
            return r5
        L31:
            int r6 = r0.t
            defpackage.dv8.b(r9)
            goto L47
        L37:
            defpackage.dv8.b(r9)
            r0.t = r6
            r0.w = r3
            rr8 r9 = r5.a
            java.lang.Object r9 = r9.b(r6, r7, r8, r0)
            if (r9 != r4) goto L47
            goto L59
        L47:
            com.hwpo_training_app.core.data.model.schedule.BenchmarkNetworkEntity r9 = (com.hwpo_training_app.core.data.model.schedule.BenchmarkNetworkEntity) r9
            ao0 r7 = r9.a()
            r0.t = r6
            r0.w = r2
            wr8 r5 = r5.b
            g2b r5 = r5.a(r7)
            if (r5 != r4) goto L5a
        L59:
            return r4
        L5a:
            g2b r5 = defpackage.g2b.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr8.e(int, java.lang.String, java.lang.String, u02):java.lang.Object");
    }
}
