package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jw0 implements fw0 {
    public final k37<lw0> a = new k37<>(new lw0[16]);

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:18:0x005f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005d -> B:19:0x0060). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.fw0
    public final java.lang.Object a(defpackage.sk8 r7, defpackage.u02 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.iw0
            if (r0 == 0) goto L13
            r0 = r8
            iw0 r0 = (defpackage.iw0) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            iw0 r0 = new iw0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.x
            int r1 = r0.z
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L36
            if (r1 != r3) goto L2f
            int r6 = r0.w
            int r7 = r0.v
            java.lang.Object[] r1 = r0.u
            sk8 r4 = r0.t
            defpackage.dv8.b(r8)
            r8 = r4
            goto L60
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r6)
            r6 = 0
            return r6
        L36:
            defpackage.dv8.b(r8)
            k37<lw0> r6 = r6.a
            T[] r8 = r6.t
            int r6 = r6.v
            r1 = r8
            r8 = r7
            r7 = r2
        L42:
            if (r7 >= r6) goto L62
            r4 = r1[r7]
            lw0 r4 = (defpackage.lw0) r4
            hw0 r5 = new hw0
            r5.<init>(r2, r8)
            r0.t = r8
            r0.u = r1
            r0.v = r7
            r0.w = r6
            r0.z = r3
            java.lang.Object r4 = defpackage.zv0.a(r4, r5, r0)
            v72 r5 = defpackage.v72.t
            if (r4 != r5) goto L60
            return r5
        L60:
            int r7 = r7 + r3
            goto L42
        L62:
            g2b r6 = defpackage.g2b.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jw0.a(sk8, u02):java.lang.Object");
    }
}
