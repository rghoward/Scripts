package defpackage;

import android.content.Intent;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.g;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nr1 {
    public static final fr1 a = new fr1(false, 954879418, new lr1());
    public static final fr1 b = new fr1(false, 1918065384, new mr1());
    public static final nr1 c = new nr1();
    public static final /* synthetic */ int d = 0;

    public static a31 a(vv2 vv2Var) {
        y21 y21Var = new y21();
        a31<T> a31Var = new a31<>(y21Var);
        y21Var.b = a31Var;
        y21Var.a = o03.class;
        try {
            vv2Var.j0(new f72(y21Var, vv2Var));
            y21Var.a = "Deferred.asListenableFuture";
            return a31Var;
        } catch (Exception e) {
            a31Var.u.m(e);
            return a31Var;
        }
    }

    public static Object b(Iterable iterable) {
        Object next;
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        vl.b();
        return null;
    }

    public static final void d(g gVar, xp5 xp5Var) {
        xp5Var.getClass();
        gVar.finish();
        Intent intent = gVar.getIntent();
        intent.setAction(xp5Var.t);
        gVar.startActivity(intent);
    }

    public static void e(List list, f78 f78Var, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (f78Var.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static final String f(jt1 jt1Var, int i) {
        return ((Resources) jt1Var.F(AndroidCompositionLocals_androidKt.c)).getString(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a3, code lost:
    
        if (r12.invoke(r7, r9, r0) == r6) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ba, code lost:
    
        if (r13.invoke(r7, r9, r0) == r6) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [ei4] */
    /* JADX WARN: Type inference failed for: r12v1, types: [ei4] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r13v0, types: [ei4] */
    /* JADX WARN: Type inference failed for: r13v1, types: [ei4] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(boolean r8, java.lang.String r9, defpackage.mh4 r10, defpackage.ei4 r11, defpackage.ei4 r12, defpackage.ei4 r13, defpackage.u02 r14) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r14 instanceof defpackage.mr7
            if (r0 == 0) goto L13
            r0 = r14
            mr7 r0 = (defpackage.mr7) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.y = r1
            goto L18
        L13:
            mr7 r0 = new mr7
            r0.<init>(r7, r14)
        L18:
            java.lang.Object r7 = r0.w
            int r14 = r0.y
            r1 = -1
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            v72 r6 = defpackage.v72.t
            if (r14 == 0) goto L4b
            if (r14 == r4) goto L3b
            if (r14 == r3) goto L36
            if (r14 != r2) goto L30
            defpackage.dv8.b(r7)
            goto Lbd
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r7)
            return r5
        L36:
            defpackage.dv8.b(r7)
            goto La6
        L3b:
            boolean r8 = r0.t
            p6a r9 = r0.v
            r13 = r9
            ei4 r13 = (defpackage.ei4) r13
            p6a r9 = r0.u
            r12 = r9
            ei4 r12 = (defpackage.ei4) r12
            defpackage.dv8.b(r7)
            goto L80
        L4b:
            defpackage.dv8.b(r7)
            if (r8 != 0) goto L57
            java.lang.Object r7 = r10.invoke()
            java.lang.Integer r7 = (java.lang.Integer) r7
            goto L58
        L57:
            r7 = r5
        L58:
            if (r7 != 0) goto L5b
            goto L64
        L5b:
            int r10 = r7.intValue()
            if (r10 != r1) goto L64
            g2b r7 = defpackage.g2b.a
            return r7
        L64:
            int r10 = r9.length()
            if (r10 != 0) goto L6b
            r9 = r5
        L6b:
            r10 = r12
            p6a r10 = (defpackage.p6a) r10
            r0.u = r10
            r10 = r13
            p6a r10 = (defpackage.p6a) r10
            r0.v = r10
            r0.t = r8
            r0.y = r4
            java.lang.Object r7 = r11.invoke(r7, r9, r0)
            if (r7 != r6) goto L80
            goto Lbc
        L80:
            js7 r7 = (defpackage.js7) r7
            B r9 = r7.u
            com.hwpo_training_app.core.data.model.pagination.PagingPaginationNetworkEntity r9 = (com.hwpo_training_app.core.data.model.pagination.PagingPaginationNetworkEntity) r9
            int r10 = r9.c
            int r9 = r9.b
            if (r10 >= r9) goto L8e
            int r1 = r10 + 1
        L8e:
            A r7 = r7.t
            if (r8 == 0) goto La9
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r1)
            r0.u = r5
            r0.v = r5
            r0.t = r8
            r0.y = r3
            java.lang.Object r7 = r12.invoke(r7, r9, r0)
            if (r7 != r6) goto La6
            goto Lbc
        La6:
            g2b r7 = defpackage.g2b.a
            return r7
        La9:
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r1)
            r0.u = r5
            r0.v = r5
            r0.t = r8
            r0.y = r2
            java.lang.Object r7 = r13.invoke(r7, r9, r0)
            if (r7 != r6) goto Lbd
        Lbc:
            return r6
        Lbd:
            g2b r7 = defpackage.g2b.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nr1.c(boolean, java.lang.String, mh4, ei4, ei4, ei4, u02):java.lang.Object");
    }
}
