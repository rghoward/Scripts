package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ti8 implements b85 {
    public final Context a;
    public final at2 b;
    public final o7a c;
    public final c85 d;
    public final o02 e;
    public final pq8 f;
    public final uq1 g;
    public final ArrayList h;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "coil.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", l = {113}, m = "invokeSuspend")
    public static final class a extends p6a implements ci4<t72, r02<? super l85>, Object> {
        public int t;
        public final /* synthetic */ ti8 u;
        public final /* synthetic */ k85 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r02 r02Var, k85 k85Var, ti8 ti8Var) {
            super(2, r02Var);
            this.u = ti8Var;
            this.v = k85Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(r02Var, this.v, this.u);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super l85> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                this.t = 1;
                obj = ti8.d(this.u, this.v, 0, this);
                v72 v72Var = v72.t;
                if (obj == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return obj;
        }
    }

    public ti8(Context context, at2 at2Var, o7a o7aVar, o7a o7aVar2, o7a o7aVar3, uq1 uq1Var, c85 c85Var) {
        this.a = context;
        this.b = at2Var;
        this.c = o7aVar;
        this.d = c85Var;
        k5a k5aVarB = od3.b();
        et2 et2Var = i23.a;
        this.e = u72.a(h72.a.C0100a.c(k5aVarB, ag6.a.x0()).c0(new yi8(o72.a.t)));
        x7a x7aVar = new x7a(this);
        pq8 pq8Var = new pq8(this, x7aVar);
        this.f = pq8Var;
        uq1.a aVar = new uq1.a(uq1Var);
        aVar.b(new h55(), f55.class);
        aVar.b(new k2a(), String.class);
        aVar.b(new qy3(), Uri.class);
        aVar.b(new hu8(), Uri.class);
        aVar.b(new xt8(), Integer.class);
        aVar.b(new pz0(), byte[].class);
        js7 js7Var = new js7(new y4b(), Uri.class);
        ArrayList arrayList = aVar.c;
        arrayList.add(js7Var);
        arrayList.add(new js7(new bx3(c85Var.a), File.class));
        aVar.a(new b55.a(o7aVar3, o7aVar2, c85Var.c), Uri.class);
        aVar.a(new xw3.a(), File.class);
        aVar.a(new u40.a(), Uri.class);
        aVar.a(new rz1.a(), Uri.class);
        aVar.a(new fu8.a(), Uri.class);
        aVar.a(new o73.a(), Drawable.class);
        aVar.a(new mq0.a(), Bitmap.class);
        aVar.a(new uz0.a(), ByteBuffer.class);
        aVar.e.add(new jq0.b(c85Var.d, c85Var.e));
        uq1 uq1VarC = aVar.c();
        this.g = uq1VarC;
        this.h = th1.L(uq1VarC.a, new ig3(this, x7aVar, pq8Var));
        new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01bf A[Catch: all -> 0x01bd, TRY_LEAVE, TryCatch #5 {all -> 0x01bd, blocks: (B:93:0x01ab, B:95:0x01af, B:97:0x01b9, B:98:0x01bc, B:101:0x01bf), top: B:113:0x01ab }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9 A[Catch: all -> 0x00d6, PHI: r1 r2 r3 r4
      0x00d9: PHI (r1v15 ti8) = (r1v3 ti8), (r1v16 ti8), (r1v17 ti8) binds: [B:28:0x0073, B:38:0x00c1, B:40:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x00d9: PHI (r2v17 nm3) = (r2v5 nm3), (r2v28 nm3), (r2v29 nm3) binds: [B:28:0x0073, B:38:0x00c1, B:40:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x00d9: PHI (r3v10 k85) = (r3v19 k85), (r3v20 k85), (r3v21 k85) binds: [B:28:0x0073, B:38:0x00c1, B:40:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x00d9: PHI (r4v10 bq8) = (r4v12 bq8), (r4v13 bq8), (r4v14 bq8) binds: [B:28:0x0073, B:38:0x00c1, B:40:0x00d3] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {all -> 0x00d6, blocks: (B:44:0x00d9, B:46:0x00df, B:47:0x00e2, B:49:0x00f2, B:50:0x00f5, B:52:0x00fc, B:53:0x00ff, B:35:0x00b8, B:37:0x00be, B:39:0x00c3, B:91:0x01a3, B:92:0x01aa), top: B:110:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00df A[Catch: all -> 0x00d6, TryCatch #3 {all -> 0x00d6, blocks: (B:44:0x00d9, B:46:0x00df, B:47:0x00e2, B:49:0x00f2, B:50:0x00f5, B:52:0x00fc, B:53:0x00ff, B:35:0x00b8, B:37:0x00be, B:39:0x00c3, B:91:0x01a3, B:92:0x01aa), top: B:110:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f2 A[Catch: all -> 0x00d6, TryCatch #3 {all -> 0x00d6, blocks: (B:44:0x00d9, B:46:0x00df, B:47:0x00e2, B:49:0x00f2, B:50:0x00f5, B:52:0x00fc, B:53:0x00ff, B:35:0x00b8, B:37:0x00be, B:39:0x00c3, B:91:0x01a3, B:92:0x01aa), top: B:110:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00fc A[Catch: all -> 0x00d6, TryCatch #3 {all -> 0x00d6, blocks: (B:44:0x00d9, B:46:0x00df, B:47:0x00e2, B:49:0x00f2, B:50:0x00f5, B:52:0x00fc, B:53:0x00ff, B:35:0x00b8, B:37:0x00be, B:39:0x00c3, B:91:0x01a3, B:92:0x01aa), top: B:110:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0114  */
    /* JADX WARN: Code duplicated, block: B:62:0x0140  */
    /* JADX WARN: Code duplicated, block: B:65:0x0149 A[Catch: all -> 0x0181, TryCatch #2 {all -> 0x0181, blocks: (B:63:0x0143, B:65:0x0149, B:68:0x015b, B:73:0x0173, B:75:0x017a, B:69:0x015f, B:72:0x016d, B:80:0x0183, B:82:0x0187, B:85:0x0196, B:86:0x019b), top: B:109:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x015b A[Catch: all -> 0x0181, TryCatch #2 {all -> 0x0181, blocks: (B:63:0x0143, B:65:0x0149, B:68:0x015b, B:73:0x0173, B:75:0x017a, B:69:0x015f, B:72:0x016d, B:80:0x0183, B:82:0x0187, B:85:0x0196, B:86:0x019b), top: B:109:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x015f A[Catch: all -> 0x0181, TryCatch #2 {all -> 0x0181, blocks: (B:63:0x0143, B:65:0x0149, B:68:0x015b, B:73:0x0173, B:75:0x017a, B:69:0x015f, B:72:0x016d, B:80:0x0183, B:82:0x0187, B:85:0x0196, B:86:0x019b), top: B:109:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x016c  */
    /* JADX WARN: Code duplicated, block: B:72:0x016d A[Catch: all -> 0x0181, TryCatch #2 {all -> 0x0181, blocks: (B:63:0x0143, B:65:0x0149, B:68:0x015b, B:73:0x0173, B:75:0x017a, B:69:0x015f, B:72:0x016d, B:80:0x0183, B:82:0x0187, B:85:0x0196, B:86:0x019b), top: B:109:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x017a A[Catch: all -> 0x0181, TryCatch #2 {all -> 0x0181, blocks: (B:63:0x0143, B:65:0x0149, B:68:0x015b, B:73:0x0173, B:75:0x017a, B:69:0x015f, B:72:0x016d, B:80:0x0183, B:82:0x0187, B:85:0x0196, B:86:0x019b), top: B:109:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0183 A[Catch: all -> 0x0181, TryCatch #2 {all -> 0x0181, blocks: (B:63:0x0143, B:65:0x0149, B:68:0x015b, B:73:0x0173, B:75:0x017a, B:69:0x015f, B:72:0x016d, B:80:0x0183, B:82:0x0187, B:85:0x0196, B:86:0x019b), top: B:109:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0187 A[Catch: all -> 0x0181, TRY_LEAVE, TryCatch #2 {all -> 0x0181, blocks: (B:63:0x0143, B:65:0x0149, B:68:0x015b, B:73:0x0173, B:75:0x017a, B:69:0x015f, B:72:0x016d, B:80:0x0183, B:82:0x0187, B:85:0x0196, B:86:0x019b), top: B:109:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0196 A[Catch: all -> 0x0181, TRY_ENTER, TryCatch #2 {all -> 0x0181, blocks: (B:63:0x0143, B:65:0x0149, B:68:0x015b, B:73:0x0173, B:75:0x017a, B:69:0x015f, B:72:0x016d, B:80:0x0183, B:82:0x0187, B:85:0x0196, B:86:0x019b), top: B:109:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:95:0x01af A[Catch: all -> 0x01bd, TryCatch #5 {all -> 0x01bd, blocks: (B:93:0x01ab, B:95:0x01af, B:97:0x01b9, B:98:0x01bc, B:101:0x01bf), top: B:113:0x01ab }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01b9 A[Catch: all -> 0x01bd, TryCatch #5 {all -> 0x01bd, blocks: (B:93:0x01ab, B:95:0x01af, B:97:0x01b9, B:98:0x01bc, B:101:0x01bf), top: B:113:0x01ab }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [k85$b] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, ti8] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, nm3] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [k85] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6, types: [bq8] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object d(ti8 ti8Var, k85 k85Var, int i, u02 u02Var) throws Throwable {
        wi8 wi8Var;
        ?? r2;
        ?? r1;
        nm3 nm3Var;
        ti8 ti8Var2;
        ?? r3;
        ?? r4;
        Bitmap bitmap;
        nm3 nm3Var2;
        k85 k85Var2;
        bq8 bq8Var;
        ti8 ti8Var3;
        ti8 ti8Var4;
        ?? r5;
        ti8 ti8Var5;
        bq8 bq8Var2;
        k85 k85Var3;
        nm3 nm3Var3;
        bq8 bq8Var3;
        k85 k85Var4;
        nm3 nm3Var4;
        l85 l85Var;
        f5a f5aVar;
        k9a k9aVar;
        k85 k85Var5;
        Drawable drawable;
        xva xvaVarA;
        k85.b bVar;
        nm3 nm3Var5;
        Object objG;
        bq8 bq8Var4;
        k85 k85Var6;
        Drawable drawableB;
        k9a k9aVar2;
        k85.b bVar2;
        Object objB;
        bq8 ribVar;
        k85 k85VarA;
        nm3.a aVar;
        ti8 ti8Var6 = ti8Var;
        k85 k85Var7 = k85Var;
        if (u02Var instanceof wi8) {
            wi8Var = (wi8) u02Var;
            int i2 = wi8Var.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wi8Var.A = i2 - Integer.MIN_VALUE;
            } else {
                wi8Var = new wi8(ti8Var6, u02Var);
            }
        } else {
            wi8Var = new wi8(ti8Var6, u02Var);
        }
        wi8 wi8Var2 = wi8Var;
        Object obj = wi8Var2.y;
        int i3 = wi8Var2.A;
        v72 v72Var = v72.t;
        if (i3 != 0) {
            try {
                if (i3 == 1) {
                    nm3 nm3Var6 = wi8Var2.w;
                    k85 k85Var8 = wi8Var2.v;
                    bq8 bq8Var5 = wi8Var2.u;
                    ti8 ti8Var7 = wi8Var2.t;
                    dv8.b(obj);
                    nm3Var = nm3Var6;
                    ti8Var2 = ti8Var7;
                    k85Var6 = k85Var8;
                    bq8Var4 = bq8Var5;
                    ti8Var2 = ti8Var6;
                    nm3Var = aVar;
                    k85Var6 = k85VarA;
                    bq8Var4 = ribVar;
                    ti8Var2 = ti8Var6;
                    nm3Var = aVar;
                    k85Var6 = k85VarA;
                    bq8Var4 = ribVar;
                    ti8Var2 = ti8Var6;
                    nm3Var = aVar;
                    k85Var6 = k85VarA;
                    bq8Var4 = ribVar;
                    if (ti8Var2.e() != null) {
                        k85Var6.getClass();
                    }
                    drawableB = q.b(k85Var6, k85Var6.C, k85Var6.B, k85Var6.G.j);
                    k9aVar2 = k85Var6.c;
                    if (k9aVar2 != null) {
                        k9aVar2.onStart(drawableB);
                    }
                    nm3Var.getClass();
                    bVar2 = k85Var6.d;
                    if (bVar2 != null) {
                        bVar2.onStart(k85Var6);
                    }
                    lr9 lr9Var = k85Var6.y;
                    wi8Var2.t = ti8Var2;
                    wi8Var2.u = bq8Var4;
                    wi8Var2.v = k85Var6;
                    wi8Var2.w = nm3Var;
                    wi8Var2.x = null;
                    wi8Var2.A = 2;
                    objB = lr9Var.b(wi8Var2);
                    if (objB != v72Var) {
                        ti8Var3 = ti8Var2;
                        nm3Var2 = nm3Var;
                        k85Var2 = k85Var6;
                        obj = objB;
                        bitmap = null;
                        bq8Var = bq8Var4;
                        nm3Var2.getClass();
                        n72 n72Var = k85Var2.t;
                        xi8 xi8Var = new xi8(k85Var2, ti8Var3, (br9) obj, nm3Var2, bitmap, null);
                        nm3Var5 = nm3Var2;
                        wi8Var2.t = ti8Var3;
                        wi8Var2.u = bq8Var;
                        wi8Var2.v = k85Var2;
                        wi8Var2.w = nm3Var5;
                        wi8Var2.x = null;
                        wi8Var2.A = 3;
                        objG = oy0.g(n72Var, xi8Var, wi8Var2);
                        if (objG != v72Var) {
                            nm3Var4 = nm3Var5;
                            k85Var4 = k85Var2;
                            obj = objG;
                            bq8Var3 = bq8Var;
                            ti8Var4 = ti8Var3;
                        }
                    }
                    return v72Var;
                }
                if (i3 == 2) {
                    Bitmap bitmap2 = wi8Var2.x;
                    nm3 nm3Var7 = wi8Var2.w;
                    k85 k85Var9 = wi8Var2.v;
                    bq8 bq8Var6 = wi8Var2.u;
                    ti8 ti8Var8 = wi8Var2.t;
                    try {
                        dv8.b(obj);
                        bitmap = bitmap2;
                        nm3Var2 = nm3Var7;
                        k85Var2 = k85Var9;
                        bq8Var = bq8Var6;
                        ti8Var3 = ti8Var8;
                        try {
                            nm3Var2.getClass();
                            n72 n72Var2 = k85Var2.t;
                            xi8 xi8Var2 = new xi8(k85Var2, ti8Var3, (br9) obj, nm3Var2, bitmap, null);
                            nm3Var5 = nm3Var2;
                            try {
                                wi8Var2.t = ti8Var3;
                                wi8Var2.u = bq8Var;
                                wi8Var2.v = k85Var2;
                                wi8Var2.w = nm3Var5;
                                wi8Var2.x = null;
                                wi8Var2.A = 3;
                                objG = oy0.g(n72Var2, xi8Var2, wi8Var2);
                                if (objG != v72Var) {
                                    nm3Var4 = nm3Var5;
                                    k85Var4 = k85Var2;
                                    obj = objG;
                                    bq8Var3 = bq8Var;
                                    ti8Var4 = ti8Var3;
                                }
                                return v72Var;
                            } catch (Throwable th) {
                                th = th;
                                k85Var3 = k85Var2;
                                nm3Var3 = nm3Var5;
                                bq8Var2 = bq8Var;
                                ti8Var5 = ti8Var3;
                                r1 = ti8Var5;
                                r2 = nm3Var3;
                                r3 = k85Var3;
                                r4 = bq8Var2;
                                if (!(th instanceof CancellationException)) {
                                    r1.f.getClass();
                                    dm3 dm3VarA = pq8.a(r3, th);
                                    f(dm3VarA, r3.c, r2);
                                    r4.v();
                                    return dm3VarA;
                                }
                                r1.getClass();
                                r2.getClass();
                                r5 = r3.d;
                                if (r5 != 0) {
                                    r5.onCancel(r3);
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            nm3Var5 = nm3Var2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r2 = nm3Var7;
                        r3 = k85Var9;
                        r4 = bq8Var6;
                        r1 = ti8Var8;
                    }
                } else {
                    if (i3 != 3) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nm3 nm3Var8 = wi8Var2.w;
                    k85 k85Var10 = wi8Var2.v;
                    bq8 bq8Var7 = wi8Var2.u;
                    ti8 ti8Var9 = wi8Var2.t;
                    dv8.b(obj);
                    ti8Var4 = ti8Var9;
                    nm3Var4 = nm3Var8;
                    k85Var4 = k85Var10;
                    bq8Var3 = bq8Var7;
                }
                try {
                    l85Var = (l85) obj;
                    if (l85Var instanceof f5a) {
                        f5aVar = (f5a) l85Var;
                        k9aVar = k85Var4.c;
                        ti8Var4.getClass();
                        k85Var5 = f5aVar.b;
                        drawable = f5aVar.a;
                        if (k9aVar instanceof uwa) {
                            xvaVarA = k85Var5.j.a((uwa) k9aVar, f5aVar);
                            if (xvaVarA instanceof ic7) {
                                k9aVar.onSuccess(drawable);
                            } else {
                                nm3Var4.getClass();
                                xvaVarA.a();
                            }
                        } else if (k9aVar != null) {
                            k9aVar.onSuccess(drawable);
                        }
                        nm3Var4.getClass();
                        bVar = k85Var5.d;
                        if (bVar != null) {
                            bVar.onSuccess(k85Var5, f5aVar);
                        }
                    } else {
                        if (!(l85Var instanceof dm3)) {
                            throw new ib7();
                        }
                        k9a k9aVar3 = k85Var4.c;
                        ti8Var4.getClass();
                        f((dm3) l85Var, k9aVar3, nm3Var4);
                    }
                    bq8Var3.v();
                    return l85Var;
                } catch (Throwable th4) {
                    th = th4;
                    nm3Var3 = nm3Var4;
                    k85Var3 = k85Var4;
                    bq8Var2 = bq8Var3;
                    ti8Var5 = ti8Var4;
                    r1 = ti8Var5;
                    r2 = nm3Var3;
                    r3 = k85Var3;
                    r4 = bq8Var2;
                    if (!(th instanceof CancellationException)) {
                        r1.f.getClass();
                        dm3 dm3VarA2 = pq8.a(r3, th);
                        f(dm3VarA2, r3.c, r2);
                        r4.v();
                        return dm3VarA2;
                    }
                    r1.getClass();
                    r2.getClass();
                    r5 = r3.d;
                    if (r5 != 0) {
                        r5.onCancel(r3);
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                r2 = ti8Var6;
                r1 = -2147483648;
                r3 = i3;
                r4 = k85Var7;
            }
        } else {
            dv8.b(obj);
            pq8 pq8Var = ti8Var6.f;
            el5 el5VarE = sd.e(wi8Var2.getContext());
            pq8Var.getClass();
            s66 s66Var = k85Var7.x;
            k9a k9aVar4 = k85Var7.c;
            ribVar = k9aVar4 instanceof pib ? new rib(pq8Var.a, k85Var7, (pib) k9aVar4, s66Var, el5VarE) : new uk0(s66Var, el5VarE);
            ribVar.h();
            k85.a aVarA = k85.a(k85Var);
            aVarA.b = ti8Var6.b;
            aVarA.x = null;
            k85VarA = aVarA.a();
            aVar = nm3.a;
            try {
                if (k85VarA.b == pd7.b) {
                    throw new qd7("The request's data is null.");
                }
                ribVar.start();
                if (i == 0) {
                    s66 s66Var2 = k85VarA.x;
                    wi8Var2.t = ti8Var6;
                    wi8Var2.u = ribVar;
                    wi8Var2.v = k85VarA;
                    wi8Var2.w = aVar;
                    wi8Var2.A = 1;
                    if (n.a(s66Var2, wi8Var2) == v72Var) {
                        ti8Var2 = ti8Var6;
                        nm3Var = aVar;
                        k85Var6 = k85VarA;
                        bq8Var4 = ribVar;
                        ti8Var2 = ti8Var6;
                        nm3Var = aVar;
                        k85Var6 = k85VarA;
                        bq8Var4 = ribVar;
                    } else {
                        ti8Var2 = ti8Var6;
                        nm3Var = aVar;
                        k85Var6 = k85VarA;
                        bq8Var4 = ribVar;
                        ti8Var2 = ti8Var6;
                        nm3Var = aVar;
                        k85Var6 = k85VarA;
                        bq8Var4 = ribVar;
                        ti8Var2 = ti8Var6;
                        nm3Var = aVar;
                        k85Var6 = k85VarA;
                        bq8Var4 = ribVar;
                        if (ti8Var2.e() != null) {
                            k85Var6.getClass();
                        }
                        drawableB = q.b(k85Var6, k85Var6.C, k85Var6.B, k85Var6.G.j);
                        k9aVar2 = k85Var6.c;
                        if (k9aVar2 != null) {
                            k9aVar2.onStart(drawableB);
                        }
                        nm3Var.getClass();
                        bVar2 = k85Var6.d;
                        if (bVar2 != null) {
                            bVar2.onStart(k85Var6);
                        }
                        lr9 lr9Var2 = k85Var6.y;
                        wi8Var2.t = ti8Var2;
                        wi8Var2.u = bq8Var4;
                        wi8Var2.v = k85Var6;
                        wi8Var2.w = nm3Var;
                        wi8Var2.x = null;
                        wi8Var2.A = 2;
                        objB = lr9Var2.b(wi8Var2);
                        if (objB != v72Var) {
                            ti8Var3 = ti8Var2;
                            nm3Var2 = nm3Var;
                            k85Var2 = k85Var6;
                            obj = objB;
                            bitmap = null;
                            bq8Var = bq8Var4;
                            nm3Var2.getClass();
                            n72 n72Var3 = k85Var2.t;
                            xi8 xi8Var3 = new xi8(k85Var2, ti8Var3, (br9) obj, nm3Var2, bitmap, null);
                            nm3Var5 = nm3Var2;
                            wi8Var2.t = ti8Var3;
                            wi8Var2.u = bq8Var;
                            wi8Var2.v = k85Var2;
                            wi8Var2.w = nm3Var5;
                            wi8Var2.x = null;
                            wi8Var2.A = 3;
                            objG = oy0.g(n72Var3, xi8Var3, wi8Var2);
                            if (objG != v72Var) {
                                nm3Var4 = nm3Var5;
                                k85Var4 = k85Var2;
                                obj = objG;
                                bq8Var3 = bq8Var;
                                ti8Var4 = ti8Var3;
                                l85Var = (l85) obj;
                                if (l85Var instanceof f5a) {
                                    f5aVar = (f5a) l85Var;
                                    k9aVar = k85Var4.c;
                                    ti8Var4.getClass();
                                    k85Var5 = f5aVar.b;
                                    drawable = f5aVar.a;
                                    if (k9aVar instanceof uwa) {
                                        xvaVarA = k85Var5.j.a((uwa) k9aVar, f5aVar);
                                        if (xvaVarA instanceof ic7) {
                                            k9aVar.onSuccess(drawable);
                                        } else {
                                            nm3Var4.getClass();
                                            xvaVarA.a();
                                        }
                                    } else if (k9aVar != null) {
                                        k9aVar.onSuccess(drawable);
                                    }
                                    nm3Var4.getClass();
                                    bVar = k85Var5.d;
                                    if (bVar != null) {
                                        bVar.onSuccess(k85Var5, f5aVar);
                                    }
                                } else {
                                    if (!(l85Var instanceof dm3)) {
                                        throw new ib7();
                                    }
                                    k9a k9aVar5 = k85Var4.c;
                                    ti8Var4.getClass();
                                    f((dm3) l85Var, k9aVar5, nm3Var4);
                                }
                                bq8Var3.v();
                                return l85Var;
                            }
                        }
                    }
                } else {
                    ti8Var2 = ti8Var6;
                    nm3Var = aVar;
                    k85Var6 = k85VarA;
                    bq8Var4 = ribVar;
                    ti8Var2 = ti8Var6;
                    nm3Var = aVar;
                    k85Var6 = k85VarA;
                    bq8Var4 = ribVar;
                    ti8Var2 = ti8Var6;
                    nm3Var = aVar;
                    k85Var6 = k85VarA;
                    bq8Var4 = ribVar;
                    if (ti8Var2.e() != null) {
                        k85Var6.getClass();
                    }
                    drawableB = q.b(k85Var6, k85Var6.C, k85Var6.B, k85Var6.G.j);
                    k9aVar2 = k85Var6.c;
                    if (k9aVar2 != null) {
                        k9aVar2.onStart(drawableB);
                    }
                    nm3Var.getClass();
                    bVar2 = k85Var6.d;
                    if (bVar2 != null) {
                        bVar2.onStart(k85Var6);
                    }
                    lr9 lr9Var3 = k85Var6.y;
                    wi8Var2.t = ti8Var2;
                    wi8Var2.u = bq8Var4;
                    wi8Var2.v = k85Var6;
                    wi8Var2.w = nm3Var;
                    wi8Var2.x = null;
                    wi8Var2.A = 2;
                    objB = lr9Var3.b(wi8Var2);
                    if (objB != v72Var) {
                        ti8Var3 = ti8Var2;
                        nm3Var2 = nm3Var;
                        k85Var2 = k85Var6;
                        obj = objB;
                        bitmap = null;
                        bq8Var = bq8Var4;
                        nm3Var2.getClass();
                        n72 n72Var4 = k85Var2.t;
                        xi8 xi8Var4 = new xi8(k85Var2, ti8Var3, (br9) obj, nm3Var2, bitmap, null);
                        nm3Var5 = nm3Var2;
                        wi8Var2.t = ti8Var3;
                        wi8Var2.u = bq8Var;
                        wi8Var2.v = k85Var2;
                        wi8Var2.w = nm3Var5;
                        wi8Var2.x = null;
                        wi8Var2.A = 3;
                        objG = oy0.g(n72Var4, xi8Var4, wi8Var2);
                        if (objG != v72Var) {
                            nm3Var4 = nm3Var5;
                            k85Var4 = k85Var2;
                            obj = objG;
                            bq8Var3 = bq8Var;
                            ti8Var4 = ti8Var3;
                            l85Var = (l85) obj;
                            if (l85Var instanceof f5a) {
                                f5aVar = (f5a) l85Var;
                                k9aVar = k85Var4.c;
                                ti8Var4.getClass();
                                k85Var5 = f5aVar.b;
                                drawable = f5aVar.a;
                                if (k9aVar instanceof uwa) {
                                    xvaVarA = k85Var5.j.a((uwa) k9aVar, f5aVar);
                                    if (xvaVarA instanceof ic7) {
                                        k9aVar.onSuccess(drawable);
                                    } else {
                                        nm3Var4.getClass();
                                        xvaVarA.a();
                                    }
                                } else if (k9aVar != null) {
                                    k9aVar.onSuccess(drawable);
                                }
                                nm3Var4.getClass();
                                bVar = k85Var5.d;
                                if (bVar != null) {
                                    bVar.onSuccess(k85Var5, f5aVar);
                                }
                            } else {
                                if (!(l85Var instanceof dm3)) {
                                    throw new ib7();
                                }
                                k9a k9aVar6 = k85Var4.c;
                                ti8Var4.getClass();
                                f((dm3) l85Var, k9aVar6, nm3Var4);
                            }
                            bq8Var3.v();
                            return l85Var;
                        }
                    }
                }
                return v72Var;
            } catch (Throwable th6) {
                th = th6;
                r1 = ti8Var6;
                r2 = aVar;
                r3 = k85VarA;
                r4 = ribVar;
            }
        }
        try {
            if (!(th instanceof CancellationException)) {
                r1.f.getClass();
                dm3 dm3VarA3 = pq8.a(r3, th);
                f(dm3VarA3, r3.c, r2);
                r4.v();
                return dm3VarA3;
            }
            r1.getClass();
            r2.getClass();
            r5 = r3.d;
            if (r5 != 0) {
                r5.onCancel(r3);
            }
            throw th;
        } catch (Throwable th7) {
            r4.v();
            throw th7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static void f(dm3 dm3Var, k9a k9aVar, nm3 nm3Var) {
        k85 k85Var = dm3Var.b;
        Drawable drawable = dm3Var.a;
        if (k9aVar instanceof uwa) {
            xva xvaVarA = k85Var.j.a((uwa) k9aVar, dm3Var);
            if (xvaVarA instanceof ic7) {
                k9aVar.onError(drawable);
            } else {
                nm3Var.getClass();
                xvaVarA.a();
            }
        } else if (k9aVar != null) {
            k9aVar.onError(drawable);
        }
        nm3Var.getClass();
        k85.b bVar = k85Var.d;
        if (bVar != null) {
            bVar.onError(k85Var, dm3Var);
        }
    }

    @Override // defpackage.b85
    public final z23 a(k85 k85Var) {
        vv2 vv2VarB = oy0.b(this.e, null, new a(null, k85Var, this), 3);
        k9a k9aVar = k85Var.c;
        return k9aVar instanceof pib ? v.c(((pib) k9aVar).a()).a(vv2VarB) : new vca();
    }

    @Override // defpackage.b85
    public final at2 b() {
        return this.b;
    }

    @Override // defpackage.b85
    public final Object c(k85 k85Var, u02 u02Var) {
        if (k85Var.c instanceof pib) {
            return u72.d(new ui8(null, k85Var, this), u02Var);
        }
        et2 et2Var = i23.a;
        return oy0.g(ag6.a.x0(), new vi8(null, k85Var, this), u02Var);
    }

    public final ar6 e() {
        return (ar6) this.c.getValue();
    }
}
