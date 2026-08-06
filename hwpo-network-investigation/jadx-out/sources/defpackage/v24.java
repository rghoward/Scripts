package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v24 {
    public static final v24 a = new v24();
    public static final Map<kh9.a, a> b = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final CountDownLatch a;
        public v82 b = null;

        public a(CountDownLatch countDownLatch) {
            this.a = countDownLatch;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && xj5.a(this.b, aVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            v82 v82Var = this.b;
            return iHashCode + (v82Var == null ? 0 : v82Var.hashCode());
        }

        public final String toString() {
            return "Dependency(latch=" + this.a + ", subscriber=" + this.b + ')';
        }
    }

    public static a a(kh9.a aVar) {
        Map<kh9.a, a> map = b;
        map.getClass();
        a aVar2 = map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        sp2.b(aVar, ". Dependencies should be added at class load time.", "Cannot get dependency ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x008d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x008e  */
    /* JADX WARN: Code duplicated, block: B:23:0x009a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008e -> B:21:0x008f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(defpackage.u02 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.w24
            if (r0 == 0) goto L13
            r0 = r9
            w24 r0 = (defpackage.w24) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            w24 r0 = new w24
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r8 = r0.y
            int r9 = r0.A
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L36
            if (r9 != r2) goto L30
            java.lang.Object r9 = r0.x
            java.util.Map r3 = r0.w
            kh9$a r4 = r0.v
            java.util.Iterator r5 = r0.u
            java.util.Map r6 = r0.t
            defpackage.dv8.b(r8)
            goto L8f
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r8)
            return r1
        L36:
            defpackage.dv8.b(r8)
            java.util.Map<kh9$a, v24$a> r8 = defpackage.v24.b
            r8.getClass()
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            int r3 = r8.size()
            int r3 = defpackage.pi6.g(r3)
            r9.<init>(r3)
            java.util.Set r8 = r8.entrySet()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r5 = r8
            r3 = r9
        L57:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto La7
            java.lang.Object r8 = r5.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.Object r4 = r8.getKey()
            kh9$a r4 = (kh9.a) r4
            java.lang.Object r8 = r8.getValue()
            v24$a r8 = (v24.a) r8
            u24 r6 = new u24
            r7 = 0
            r6.<init>(r7, r8)
            r0.t = r3
            r0.u = r5
            r0.v = r4
            r0.w = r3
            r0.x = r9
            r0.A = r2
            java.lang.Object r8 = defpackage.zv.g(r6, r0)
            v72 r6 = defpackage.v72.t
            if (r8 != r6) goto L8e
            return r6
        L8e:
            r6 = r3
        L8f:
            r4.getClass()
            v24$a r8 = a(r4)
            v82 r8 = r8.b
            if (r8 == 0) goto L9f
            r3.put(r9, r8)
            r3 = r6
            goto L57
        L9f:
            java.lang.String r8 = "Subscriber "
            java.lang.String r9 = " has not been registered."
            defpackage.sp2.b(r4, r9, r8)
            return r1
        La7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v24.b(u02):java.lang.Object");
    }
}
