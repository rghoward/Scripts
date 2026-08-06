package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ig3 implements ug5 {
    public final ti8 a;
    public final x7a b;
    public final pq8 c;
    public final br6 d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final Drawable a;
        public final boolean b;
        public final jf2 c;
        public final String d;

        public a(Drawable drawable, boolean z, jf2 jf2Var, String str) {
            this.a = drawable;
            this.b = z;
            this.c = jf2Var;
            this.d = str;
        }
    }

    public ig3(ti8 ti8Var, x7a x7aVar, pq8 pq8Var) {
        this.a = ti8Var;
        this.b = x7aVar;
        this.c = pq8Var;
        this.d = new br6(ti8Var, pq8Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f A[LOOP:0: B:16:0x0057->B:20:0x006f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009f -> B:26:0x00a2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(defpackage.ig3 r8, defpackage.tw9 r9, defpackage.uq1 r10, defpackage.k85 r11, java.lang.Object r12, defpackage.zk7 r13, defpackage.nm3 r14, defpackage.u02 r15) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig3.b(ig3, tw9, uq1, k85, java.lang.Object, zk7, nm3, u02):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0141  */
    /* JADX WARN: Code duplicated, block: B:51:0x0144  */
    /* JADX WARN: Code duplicated, block: B:53:0x0147  */
    /* JADX WARN: Code duplicated, block: B:59:0x0172  */
    /* JADX WARN: Code duplicated, block: B:81:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0193, code lost:
    
        r1 = r1;
        if (r1 == r10) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, uq1] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, zk7] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.ig3 r24, defpackage.k85 r25, java.lang.Object r26, defpackage.zk7 r27, defpackage.nm3 r28, defpackage.u02 r29) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig3.c(ig3, k85, java.lang.Object, zk7, nm3, u02):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // defpackage.ug5
    public final Object a(bj8 bj8Var, u02 u02Var) throws Throwable {
        ng3 ng3Var;
        ig3 ig3Var = this;
        bj8 bj8Var2 = bj8Var;
        br6 br6Var = ig3Var.d;
        if (u02Var instanceof ng3) {
            ng3Var = (ng3) u02Var;
            int i = ng3Var.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                ng3Var.x = i - Integer.MIN_VALUE;
            } else {
                ng3Var = new ng3(ig3Var, u02Var);
            }
        } else {
            ng3Var = new ng3(ig3Var, u02Var);
        }
        ng3 ng3Var2 = ng3Var;
        Object obj = ng3Var2.v;
        int i2 = ng3Var2.x;
        if (i2 == 0) {
            dv8.b(obj);
            try {
                k85 k85Var = bj8Var2.d;
                Object obj2 = k85Var.b;
                br9 br9Var = bj8Var2.e;
                Bitmap.Config[] configArr = v.a;
                nm3 nm3Var = bj8Var2.f;
                zk7 zk7VarC = ig3Var.c.c(k85Var, br9Var);
                s39 s39Var = zk7VarC.e;
                List<js7<hi6<? extends Object, ? extends Object>, Class<? extends Object>>> list = ig3Var.a.g.b;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    js7<hi6<? extends Object, ? extends Object>, Class<? extends Object>> js7Var = list.get(i3);
                    hi6<? extends Object, ? extends Object> hi6Var = js7Var.t;
                    if (js7Var.u.isAssignableFrom(obj2.getClass())) {
                        hi6Var.getClass();
                        Object objA = hi6Var.a(obj2, zk7VarC);
                        if (objA != null) {
                            obj2 = objA;
                        }
                    }
                }
                ar6.a aVarB = br6Var.b(k85Var, obj2, zk7VarC, nm3Var);
                ar6.b bVarA = aVarB != null ? br6Var.a(k85Var, aVarB, br9Var, s39Var) : null;
                if (bVarA != null) {
                    return br6.c(bj8Var2, k85Var, aVarB, bVarA);
                }
                n72 n72Var = k85Var.u;
                og3 og3Var = new og3(ig3Var, k85Var, obj2, zk7VarC, nm3Var, aVarB, bj8Var2, null);
                ng3Var2.t = ig3Var;
                ng3Var2.u = bj8Var2;
                ng3Var2.x = 1;
                Object objG = oy0.g(n72Var, og3Var, ng3Var2);
                v72 v72Var = v72.t;
                return objG == v72Var ? v72Var : objG;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bj8 bj8Var3 = ng3Var2.u;
            ig3 ig3Var2 = ng3Var2.t;
            try {
                dv8.b(obj);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                bj8Var2 = bj8Var3;
                ig3Var = ig3Var2;
            }
        }
        if (th instanceof CancellationException) {
            throw th;
        }
        pq8 pq8Var = ig3Var.c;
        return pq8.a(bj8Var2.b(), th);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX WARN: Code duplicated, block: B:19:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00aa -> B:28:0x00ad). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(defpackage.uq1 r10, defpackage.k85 r11, java.lang.Object r12, defpackage.zk7 r13, defpackage.nm3 r14, defpackage.u02 r15) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig3.d(uq1, k85, java.lang.Object, zk7, nm3, u02):java.lang.Object");
    }
}
