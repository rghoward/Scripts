package defpackage;

import io.ably.lib.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.TrackpadScrollingLogic$startReceivingEvents$1", f = "TrackpadScrollingLogic.kt", l = {Log.NONE, Log.NONE}, m = "invokeSuspend", v = 1)
public final class uua extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public rua t;
    public z79 u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ rua x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uua(rua ruaVar, r02<? super uua> r02Var) {
        super(2, r02Var);
        this.x = ruaVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        uua uuaVar = new uua(this.x, r02Var);
        uuaVar.w = obj;
        return uuaVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((uua) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0013, B:17:0x0033, B:19:0x003d, B:23:0x0056, B:14:0x0028), top: B:31:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0067 -> B:17:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ak0
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.v
            rua r1 = r8.x
            r2 = 2
            r3 = 1
            r4 = 0
            v72 r5 = defpackage.v72.t
            if (r0 == 0) goto L2c
            if (r0 == r3) goto L20
            if (r0 != r2) goto L1a
            java.lang.Object r0 = r8.w
            t72 r0 = (defpackage.t72) r0
            defpackage.dv8.b(r9)     // Catch: java.lang.Throwable -> L18
            r9 = r0
            goto L33
        L18:
            r8 = move-exception
            goto L6e
        L1a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r8)
            return r4
        L20:
            z79 r0 = r8.u
            rua r6 = r8.t
            java.lang.Object r7 = r8.w
            t72 r7 = (defpackage.t72) r7
            defpackage.dv8.b(r9)     // Catch: java.lang.Throwable -> L18
            goto L56
        L2c:
            defpackage.dv8.b(r9)
            java.lang.Object r9 = r8.w
            t72 r9 = (defpackage.t72) r9
        L33:
            h72 r0 = r9.getCoroutineContext()     // Catch: java.lang.Throwable -> L18
            boolean r0 = defpackage.sd.h(r0)     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L69
            z79 r0 = r1.a     // Catch: java.lang.Throwable -> L18
            zx0 r6 = r1.f     // Catch: java.lang.Throwable -> L18
            r8.w = r9     // Catch: java.lang.Throwable -> L18
            r8.t = r1     // Catch: java.lang.Throwable -> L18
            r8.u = r0     // Catch: java.lang.Throwable -> L18
            r8.v = r3     // Catch: java.lang.Throwable -> L18
            r6.getClass()     // Catch: java.lang.Throwable -> L18
            java.lang.Object r6 = defpackage.zx0.K(r6, r8)     // Catch: java.lang.Throwable -> L18
            if (r6 != r5) goto L53
            goto L66
        L53:
            r7 = r9
            r9 = r6
            r6 = r1
        L56:
            rua$a r9 = (rua.a) r9     // Catch: java.lang.Throwable -> L18
            r8.w = r7     // Catch: java.lang.Throwable -> L18
            r8.t = r4     // Catch: java.lang.Throwable -> L18
            r8.u = r4     // Catch: java.lang.Throwable -> L18
            r8.v = r2     // Catch: java.lang.Throwable -> L18
            java.lang.Object r9 = defpackage.rua.c(r6, r0, r9, r8)     // Catch: java.lang.Throwable -> L18
            if (r9 != r5) goto L67
        L66:
            return r5
        L67:
            r9 = r7
            goto L33
        L69:
            r1.g = r4
            g2b r8 = defpackage.g2b.a
            return r8
        L6e:
            r1.g = r4
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uua.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
