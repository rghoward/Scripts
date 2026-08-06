package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {119, 121}, m = "invokeSuspend", v = 1)
public final class bob extends p6a implements ci4<s54<? super Float>, r02<? super g2b>, Object> {
    public final /* synthetic */ Context A;
    public ca1 t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ ContentResolver w;
    public final /* synthetic */ Uri x;
    public final /* synthetic */ cob y;
    public final /* synthetic */ zx0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bob(ContentResolver contentResolver, Uri uri, cob cobVar, zx0 zx0Var, Context context, r02 r02Var) {
        super(2, r02Var);
        this.w = contentResolver;
        this.x = uri;
        this.y = cobVar;
        this.z = zx0Var;
        this.A = context;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        bob bobVar = new bob(this.w, this.x, this.y, this.z, this.A, r02Var);
        bobVar.v = obj;
        return bobVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(s54<? super Float> s54Var, r02<? super g2b> r02Var) {
        return ((bob) create(s54Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x005c A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:18:0x0043, B:22:0x0054, B:24:0x005c, B:14:0x002b, B:17:0x003c), top: B:31:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r6.emit(r7, r10) == r5) goto L26;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            int r0 = r10.u
            r1 = 2
            r2 = 1
            cob r3 = r10.y
            android.content.ContentResolver r4 = r10.w
            v72 r5 = defpackage.v72.t
            if (r0 == 0) goto L2f
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1e
            ca1 r0 = r10.t
            java.lang.Object r6 = r10.v
            s54 r6 = (defpackage.s54) r6
            defpackage.dv8.b(r11)     // Catch: java.lang.Throwable -> L1c
        L19:
            r11 = r6
            r6 = r0
            goto L43
        L1c:
            r10 = move-exception
            goto L87
        L1e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r10)
            r10 = 0
            return r10
        L25:
            ca1 r0 = r10.t
            java.lang.Object r6 = r10.v
            s54 r6 = (defpackage.s54) r6
            defpackage.dv8.b(r11)     // Catch: java.lang.Throwable -> L1c
            goto L54
        L2f:
            defpackage.dv8.b(r11)
            java.lang.Object r11 = r10.v
            s54 r11 = (defpackage.s54) r11
            android.net.Uri r0 = r10.x
            r6 = 0
            r4.registerContentObserver(r0, r6, r3)
            zx0 r0 = r10.z     // Catch: java.lang.Throwable -> L1c
            zx0$a r6 = new zx0$a     // Catch: java.lang.Throwable -> L1c
            r6.<init>()     // Catch: java.lang.Throwable -> L1c
        L43:
            r10.v = r11     // Catch: java.lang.Throwable -> L1c
            r10.t = r6     // Catch: java.lang.Throwable -> L1c
            r10.u = r2     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r0 = r6.b(r10)     // Catch: java.lang.Throwable -> L1c
            if (r0 != r5) goto L50
            goto L80
        L50:
            r9 = r6
            r6 = r11
            r11 = r0
            r0 = r9
        L54:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1c
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1c
            if (r11 == 0) goto L81
            r0.next()     // Catch: java.lang.Throwable -> L1c
            android.content.Context r11 = r10.A     // Catch: java.lang.Throwable -> L1c
            c37<android.content.Context, zz9<java.lang.Float>> r7 = defpackage.dob.a     // Catch: java.lang.Throwable -> L1c
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r7 = "animator_duration_scale"
            r8 = 1065353216(0x3f800000, float:1.0)
            float r11 = android.provider.Settings.Global.getFloat(r11, r7, r8)     // Catch: java.lang.Throwable -> L1c
            java.lang.Float r7 = new java.lang.Float     // Catch: java.lang.Throwable -> L1c
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L1c
            r10.v = r6     // Catch: java.lang.Throwable -> L1c
            r10.t = r0     // Catch: java.lang.Throwable -> L1c
            r10.u = r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r11 = r6.emit(r7, r10)     // Catch: java.lang.Throwable -> L1c
            if (r11 != r5) goto L19
        L80:
            return r5
        L81:
            r4.unregisterContentObserver(r3)
            g2b r10 = defpackage.g2b.a
            return r10
        L87:
            r4.unregisterContentObserver(r3)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bob.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
