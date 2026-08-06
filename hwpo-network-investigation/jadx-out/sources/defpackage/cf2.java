package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {41, 43}, m = "invokeSuspend", v = 1)
public final class cf2 extends p6a implements ci4<Object, r02<Object>, Object> {
    public Iterator t;
    public ze2 u;
    public Object v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ List<ze2<Object>> y;
    public final /* synthetic */ ArrayList z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {42}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements oh4<r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ ze2<Object> u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ze2<Object> ze2Var, r02<? super a> r02Var) {
            super(1, r02Var);
            this.u = ze2Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(r02<?> r02Var) {
            return new a(this.u, r02Var);
        }

        @Override // defpackage.oh4
        public final Object invoke(r02<? super g2b> r02Var) {
            return ((a) create(r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                this.t = 1;
                Object objCleanUp = this.u.cleanUp(this);
                v72 v72Var = v72.t;
                if (objCleanUp == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf2(List list, ArrayList arrayList, r02 r02Var) {
        super(2, r02Var);
        this.y = list;
        this.z = arrayList;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        cf2 cf2Var = new cf2(this.y, this.z, r02Var);
        cf2Var.x = obj;
        return cf2Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, r02<Object> r02Var) {
        return ((cf2) create(obj, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x0058  */
    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Code duplicated, block: B:22:0x007e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0080  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ak0
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.w
            r1 = 2
            r2 = 1
            r3 = 0
            v72 r4 = defpackage.v72.t
            if (r0 == 0) goto L2e
            if (r0 == r2) goto L1d
            if (r0 != r1) goto L17
            java.util.Iterator r0 = r9.t
            java.lang.Object r5 = r9.x
            java.util.List r5 = (java.util.List) r5
            defpackage.dv8.b(r10)
            goto L3b
        L17:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r9)
            return r3
        L1d:
            java.lang.Object r0 = r9.v
            ze2 r5 = r9.u
            java.util.Iterator r6 = r9.t
            java.lang.Object r7 = r9.x
            java.util.List r7 = (java.util.List) r7
            defpackage.dv8.b(r10)
            r8 = r7
            r7 = r5
            r5 = r8
            goto L5d
        L2e:
            defpackage.dv8.b(r10)
            java.lang.Object r10 = r9.x
            java.util.List<ze2<java.lang.Object>> r0 = r9.y
            java.util.Iterator r0 = r0.iterator()
            java.util.ArrayList r5 = r9.z
        L3b:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L82
            java.lang.Object r6 = r0.next()
            ze2 r6 = (defpackage.ze2) r6
            r9.x = r5
            r9.t = r0
            r9.u = r6
            r9.v = r10
            r9.w = r2
            java.lang.Object r7 = r6.shouldMigrate(r10, r9)
            if (r7 != r4) goto L58
            goto L7d
        L58:
            r8 = r0
            r0 = r10
            r10 = r7
            r7 = r6
            r6 = r8
        L5d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L80
            cf2$a r10 = new cf2$a
            r10.<init>(r7, r3)
            r5.add(r10)
            r9.x = r5
            r9.t = r6
            r9.u = r3
            r9.v = r3
            r9.w = r1
            java.lang.Object r10 = r7.migrate(r0, r9)
            if (r10 != r4) goto L7e
        L7d:
            return r4
        L7e:
            r0 = r6
            goto L3b
        L80:
            r10 = r0
            goto L7e
        L82:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cf2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
