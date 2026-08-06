package defpackage;

import android.content.ContentResolver;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a55 extends k4b {
    public final a70 d;
    public final ContentResolver e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a55(a70 a70Var, py3 py3Var, ContentResolver contentResolver) {
        super(py3Var);
        a70Var.getClass();
        py3Var.getClass();
        this.d = a70Var;
        this.e = contentResolver;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if (r8 == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
    
        if (r8 == r2) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r9, java.lang.String r10, defpackage.u02 r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.z45
            if (r0 == 0) goto L13
            r0 = r11
            z45 r0 = (defpackage.z45) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            z45 r0 = new z45
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.u
            int r1 = r0.w
            v72 r2 = defpackage.v72.t
            py3 r3 = r8.a
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L44
            if (r1 == r6) goto L3e
            if (r1 == r5) goto L36
            if (r1 != r4) goto L30
            defpackage.dv8.b(r11)
            goto L93
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r8)
            return r7
        L36:
            java.lang.String r9 = r0.t
            defpackage.dv8.b(r11)     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L96
            goto L96
        L3c:
            r8 = move-exception
            goto L79
        L3e:
            java.lang.String r9 = r0.t
            defpackage.dv8.b(r11)     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L96
            goto L5e
        L44:
            defpackage.dv8.b(r11)
            android.net.Uri r11 = android.net.Uri.parse(r9)
            android.content.ContentResolver r1 = r8.e
            n17 r10 = defpackage.wy3.e(r11, r1, r10)
            a70 r8 = r8.d     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L96
            r0.t = r9     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L96
            r0.w = r6     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L96
            java.lang.Object r11 = r8.a(r10, r0)     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L96
            if (r11 != r2) goto L5e
            goto L92
        L5e:
            com.hwpo_training_app.core.data.model.attachments.SectionAttachmentNetworkEntity r11 = (com.hwpo_training_app.core.data.model.attachments.SectionAttachmentNetworkEntity) r11     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L96
            m89 r8 = r11.a()     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L96
            r0.t = r9     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L96
            r0.w = r5     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L96
            fx3$c r10 = new fx3$c     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L96
            r10.<init>(r9, r8)     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L96
            java.lang.Object r8 = r3.a(r10, r0)     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L96
            if (r8 != r2) goto L74
            goto L76
        L74:
            g2b r8 = defpackage.g2b.a     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L96
        L76:
            if (r8 != r2) goto L96
            goto L92
        L79:
            r0.t = r7
            r0.w = r4
            rma$a r10 = defpackage.rma.a
            r10.b(r8)
            fx3$b r8 = new fx3$b
            r8.<init>(r9)
            java.lang.Object r8 = r3.a(r8, r0)
            if (r8 != r2) goto L8e
            goto L90
        L8e:
            g2b r8 = defpackage.g2b.a
        L90:
            if (r8 != r2) goto L93
        L92:
            return r2
        L93:
            g2b r8 = defpackage.g2b.a
            return r8
        L96:
            g2b r8 = defpackage.g2b.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a55.a(java.lang.String, java.lang.String, u02):java.lang.Object");
    }
}
